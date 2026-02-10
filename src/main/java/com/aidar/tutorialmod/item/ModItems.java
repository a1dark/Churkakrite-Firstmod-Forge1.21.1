package com.aidar.tutorialmod.item;

import com.aidar.tutorialmod.TutorMod;
import com.aidar.tutorialmod.item.custom.ChiselItem;
import com.aidar.tutorialmod.item.custom.FuelItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorMod.Mod_Id);
    public static final RegistryObject<Item> CHURKAKRITE= ITEMS.register("churkakrite", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHURKAKRITE_RAW=ITEMS.register("churkakrite_raw", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHISEL=ITEMS.register("chisel",() -> new ChiselItem(new Item.Properties().durability(32)));

    public static final RegistryObject<Item> CHURKAKRITE_ASHES=ITEMS.register("churkakrite_ashes",() -> new FuelItem(new Item.Properties(), 1200));

    public static final RegistryObject<Item> CHINUTE=ITEMS.register("chinute", () -> new Item(new Item.Properties().food(ModFoodProperties.CHINUTE)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
