package com.aidar.tutorialmod.datagen;

import com.aidar.tutorialmod.TutorMod;
import com.aidar.tutorialmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TutorMod.Mod_Id, existingFileHelper);
    }


    @Override
    protected void registerModels() {

        basicItem(ModItems.CHURKAKRITE.get());
        basicItem(ModItems.CHURKAKRITE_RAW.get());

        basicItem(ModItems.CHISEL.get());
        basicItem(ModItems.CHINUTE.get());
        basicItem(ModItems.CHURKAKRITE_ASHES.get());

    }
}
