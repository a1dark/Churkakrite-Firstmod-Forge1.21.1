package com.aidar.tutorialmod.item;

import com.aidar.tutorialmod.TutorMod;
import com.aidar.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorMod.Mod_Id);
    public static final RegistryObject<CreativeModeTab> CHURKAKRITE_ITEMS_TAB = CREATIVE_MODE_TABS.register("churkakrite_items_tab",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.CHURKAKRITE.get()))
                    .title(Component.translatable("creativetab.firstmod.churkakrite_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CHURKAKRITE.get());
                        output.accept(ModItems.CHURKAKRITE_RAW.get());
                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> CHURKAKRITE_BLOCKS_TAB = CREATIVE_MODE_TABS.register("churkakrite_blocks_tab",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModBlocks.CHURKAKRITE_BLOCK.get()))
                    .withTabsBefore(CHURKAKRITE_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.firstmod.churkakrite_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.CHURKAKRITE_BLOCK.get());
                        output.accept(ModBlocks.RAW_CHURKAKRITE_BLOCK.get());
                        output.accept(ModBlocks.CHURKAKRITE_ORE.get());
                        output.accept(ModBlocks.CHURKAKRITE_DEEPSLATE_ORE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
