package org.dawnoftime.dawnoftime.registry;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import org.dawnoftime.dawnoftime.menu.StoneOvenMenu;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public abstract class DoTBMenusRegistry {
    public static DoTBMenusRegistry INSTANCE;

    public final Supplier<MenuType<StoneOvenMenu>> STONE_OVEN = register("stone_oven", StoneOvenMenu::new);

    public abstract <T extends AbstractContainerMenu> Supplier<MenuType<T>> register(String name, BiFunction<Integer, Inventory, T> factory);
}
