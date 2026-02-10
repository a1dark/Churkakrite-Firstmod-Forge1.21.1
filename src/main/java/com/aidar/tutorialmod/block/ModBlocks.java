package com.aidar.tutorialmod.block;

import com.aidar.tutorialmod.TutorMod;
import com.aidar.tutorialmod.block.custom.AncientBlock;
import com.aidar.tutorialmod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TutorMod.Mod_Id);

    public static final RegistryObject<Block> CHURKAKRITE_BLOCK = registerBlock("churkakrite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(6f).requiresCorrectToolForDrops().sound(SoundType.NETHER_GOLD_ORE)));
    public static final RegistryObject<Block> RAW_CHURKAKRITE_BLOCK = registerBlock("raw_churkakrite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(6f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHURKAKRITE_ORE = registerBlock("churkakrite_ore",
            () -> new DropExperienceBlock(UniformInt.of(1,2),BlockBehaviour.Properties.of()
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHURKAKRITE_DEEPSLATE_ORE = registerBlock("churkakrite_deepslate_ore",
            () -> new DropExperienceBlock(UniformInt.of(1,2),BlockBehaviour.Properties.of()
                    .strength(7f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> ANCIENT_BLOCK = registerBlock("ancient_block",
            () -> new AncientBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().lightLevel(p_50872_ -> 10)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}