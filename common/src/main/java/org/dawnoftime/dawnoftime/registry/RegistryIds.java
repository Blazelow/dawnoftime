package org.dawnoftime.dawnoftime.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.dawnoftime.dawnoftime.DoTBCommon;

import java.util.function.Supplier;

/**
 * Since 1.21.2 the properties of a block or an item must know their registry key before the object is built.
 * The loader registries call {@link #withId} around every block, item and block item supplier, then the helpers below
 * read that id to fill the properties. This avoids passing the id through the 586 block declarations.
 */
public final class RegistryIds {
    private static final ThreadLocal<String> CURRENT_ID = new ThreadLocal<>();

    private RegistryIds() {}

    public static <R> R withId(String id, Supplier<R> supplier) {
        String previous = CURRENT_ID.get();
        CURRENT_ID.set(id);
        try {
            return supplier.get();
        } finally {
            if (previous == null) {
                CURRENT_ID.remove();
            } else {
                CURRENT_ID.set(previous);
            }
        }
    }

    private static String currentId() {
        String id = CURRENT_ID.get();
        if (id == null) {
            throw new IllegalStateException("Block or item properties created outside of a registry supplier");
        }
        return id;
    }

    private static Identifier identifier(String id) {
        return Identifier.fromNamespaceAndPath(DoTBCommon.MOD_ID, id);
    }

    public static BlockBehaviour.Properties copyOf(Block block) {
        return BlockBehaviour.Properties.ofFullCopy(block).setId(ResourceKey.create(Registries.BLOCK, identifier(currentId())));
    }

    public static Item.Properties itemProperties() {
        return new Item.Properties().setId(ResourceKey.create(Registries.ITEM, identifier(currentId())));
    }

    public static Item.Properties blockItemProperties() {
        return itemProperties().useBlockDescriptionPrefix();
    }
}
