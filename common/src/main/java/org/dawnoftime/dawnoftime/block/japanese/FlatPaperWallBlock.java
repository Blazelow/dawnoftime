package org.dawnoftime.dawnoftime.block.japanese;

import net.minecraft.network.chat.Component;
import java.util.function.Consumer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import org.dawnoftime.dawnoftime.block.templates.PillarPaneBlock;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class FlatPaperWallBlock extends PillarPaneBlock {
    public FlatPaperWallBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, Consumer<Component> tooltip, TooltipFlag flag) {
        super.appendHoverText(stack, context, tooltip, flag);
        tooltip.accept(Component.translatable("tooltip.dawnoftimebuilder.connected_texture_label"));
        tooltip.accept(Component.translatable("tooltip.dawnoftimebuilder.connected_texture"));
    }
}
