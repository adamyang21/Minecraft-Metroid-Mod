package com.adamyang21.metroidmod.item;

import com.adamyang21.metroidmod.MetroidMod;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MetroidMod.MOD_ID);

    public static final RegistryObject<Item> ARM_CANNON = ITEMS.register("arm_cannon",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MISSILE_LAUNCHER = ITEMS.register("missile_launcher",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
