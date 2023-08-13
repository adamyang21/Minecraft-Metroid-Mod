package com.adamyang21.metroidmod.item;

import com.adamyang21.metroidmod.MetroidMod;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MetroidMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab METROID_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        METROID_TAB = event.registerCreativeModeTab(new ResourceLocation(MetroidMod.MOD_ID, "metroid_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.ARM_CANNON.get())).title(Component.translatable("creativemodetab.metroid_tab")));
    }
}
