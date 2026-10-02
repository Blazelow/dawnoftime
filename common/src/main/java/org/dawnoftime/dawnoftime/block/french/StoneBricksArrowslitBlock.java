package org.dawnoftime.dawnoftime.block.french;

import net.minecraft.network.chat.Component;
import java.util.function.Consumer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.dawnoftime.dawnoftime.block.templates.WaterloggedHorizontalBlock;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class StoneBricksArrowslitBlock extends WaterloggedHorizontalBlock {
    public StoneBricksArrowslitBlock(Properties properties, VoxelShape[] shapes) {
        super(properties, shapes);
    }

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, Consumer<Component> tooltip, TooltipFlag flag) {
        super.appendHoverText(stack, context, tooltip, flag);
        tooltip.accept(Component.translatable("tooltip.dawnoftimebuilder.stone_bricks_defense_label"));
        tooltip.accept(Component.translatable("tooltip.dawnoftimebuilder.stone_bricks_defense"));
    }
}
