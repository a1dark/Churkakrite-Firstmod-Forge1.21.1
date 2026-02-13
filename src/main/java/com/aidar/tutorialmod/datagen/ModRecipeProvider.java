package com.aidar.tutorialmod.datagen;

import com.aidar.tutorialmod.block.ModBlocks;
import com.aidar.tutorialmod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        List<ItemLike> CHURKAKRITE_SMELTABLES = List.of(ModItems.CHURKAKRITE_RAW.get(), ModBlocks.CHURKAKRITE_ORE.get(), ModBlocks.CHURKAKRITE_DEEPSLATE_ORE.get());
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHURKAKRITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.CHURKAKRITE.get())
                .unlockedBy(getHasName(ModItems.CHURKAKRITE.get()), has(ModItems.CHURKAKRITE.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ANCIENT_BLOCK.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("CCC")
                .define('A', ModItems.CHURKAKRITE.get())
                .define('B', Items.IRON_INGOT)
                .define('C', Items.REDSTONE_BLOCK)
                .unlockedBy(getHasName(ModItems.CHURKAKRITE.get()), has(ModItems.CHURKAKRITE.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CHINUTE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.APPLE)
                .define('B', ModItems.CHURKAKRITE.get())
                .unlockedBy(getHasName(ModItems.CHURKAKRITE.get()), has(ModItems.CHURKAKRITE.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CHURKAKRITE.get(), 9)
                .requires(ModBlocks.CHURKAKRITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.CHURKAKRITE_BLOCK.get()), has(ModBlocks.CHURKAKRITE_BLOCK.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CHURKAKRITE_ASHES.get(), 4)
                .requires(ModItems.CHURKAKRITE.get())
                .unlockedBy(getHasName(ModItems.CHURKAKRITE.get()), has(ModItems.CHURKAKRITE.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CHISEL.get())
                .requires(ModItems.CHURKAKRITE.get())
                .requires(Items.STICK)
                .unlockedBy(getHasName(ModItems.CHURKAKRITE.get()), has(ModItems.CHURKAKRITE.get())).save(pRecipeOutput);


        oreSmelting(pRecipeOutput, CHURKAKRITE_SMELTABLES, RecipeCategory.MISC, ModItems.CHURKAKRITE.get(), 0.25f, 200, "churkakrite" );
        oreBlasting(pRecipeOutput, CHURKAKRITE_SMELTABLES, RecipeCategory.MISC, ModItems.CHURKAKRITE.get(), 0.25f, 100, "churkakrite" );
    }
}
