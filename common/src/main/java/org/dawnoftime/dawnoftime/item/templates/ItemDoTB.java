package org.dawnoftime.dawnoftime.item.templates;

import org.dawnoftime.dawnoftime.registry.RegistryIds;
import net.minecraft.world.item.Item;

public class ItemDoTB extends Item {
    public ItemDoTB() {
        super(RegistryIds.itemProperties());
    }

    public ItemDoTB(Properties properties) {
        super(properties);
    }
}
