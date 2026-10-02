package org.dawnoftime.dawnoftime.block;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.function.Consumer;

/**
 * Implemented by blocks that add lines to the tooltip of their block item.
 * Since 1.21.5 {@code Block} no longer has {@code appendHoverText}, the tooltip is built by {@link org.dawnoftime.dawnoftime.item.templates.DoTBBlockItem}.
 */
public interface IBlockTooltip {
    default void appendHoverText(ItemStack stack, Item.TooltipContext context, Consumer<Component> tooltip, TooltipFlag flag) {
    }
}
