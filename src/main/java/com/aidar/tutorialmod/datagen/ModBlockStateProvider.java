package com.aidar.tutorialmod.datagen;

import com.aidar.tutorialmod.TutorMod;
import com.aidar.tutorialmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output,  ExistingFileHelper exFileHelper) {
        super(output, TutorMod.Mod_Id, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        blockWithItem(ModBlocks.CHURKAKRITE_BLOCK);
        blockWithItem(ModBlocks.RAW_CHURKAKRITE_BLOCK);

        blockWithItem(ModBlocks.CHURKAKRITE_ORE);
        blockWithItem(ModBlocks.CHURKAKRITE_DEEPSLATE_ORE);

        blockWithItem(ModBlocks.ANCIENT_BLOCK);
    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
