package org.dawnoftime.dawnoftime.item.templates;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.block.Block;
import org.dawnoftime.dawnoftime.block.IBlockTooltip;

import java.util.function.Consumer;

public class DoTBBlockItem extends BlockItem {
    public DoTBBlockItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay display, Consumer<Component> tooltip, TooltipFlag flag) {
        super.appendHoverText(stack, context, display, tooltip, flag);
        if (this.getBlock() instanceof IBlockTooltip blockTooltip) {
            blockTooltip.appendHoverText(stack, context, tooltip, flag);
        }
    }
}
