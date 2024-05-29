package com.Yuki_Spike.plateplate.init;

import com.Yuki_Spike.plateplate.PlatePlate;
import com.Yuki_Spike.plateplate.block.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import java.util.function.Supplier;

public class ModBlock {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(PlatePlate.MODID);

    public static final Supplier<Block> OAK_PLATE = registerBlock("oak_plate",
            () -> new ModPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> OAK_TRAPDOOR_PLATE = registerBlock("oak_trapdoor_plate",
            () -> new ModPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> HANGING_OAK_PLATE = registerBlock("hanging_oak_plate",
            () -> new ModHangingPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> HANGING_OAK_TRAPDOOR_PLATE = registerBlock("hanging_oak_trapdoor_plate",
            () -> new ModHangingPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));

    public static final Supplier<Block> SPRUCE_PLATE = registerBlock("spruce_plate",
            () -> new ModPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> SPRUCE_TRAPDOOR_PLATE = registerBlock("spruce_trapdoor_plate",
            () -> new ModPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> HANGING_SPRUCE_PLATE = registerBlock("hanging_spruce_plate",
            () -> new ModHangingPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> HANGING_SPRUCE_TRAPDOOR_PLATE = registerBlock("hanging_spruce_trapdoor_plate",
            () -> new ModHangingPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));

    public static final Supplier<Block> BIRCH_PLATE = registerBlock("birch_plate",
            () -> new ModPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> BIRCH_TRAPDOOR_PLATE = registerBlock("birch_trapdoor_plate",
            () -> new ModPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> HANGING_BIRCH_PLATE = registerBlock("hanging_birch_plate",
            () -> new ModHangingPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> HANGING_BIRCH_TRAPDOOR_PLATE = registerBlock("hanging_birch_trapdoor_plate",
            () -> new ModHangingPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));

    public static final Supplier<Block> JUNGLE_PLATE = registerBlock("jungle_plate",
            () -> new ModPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> JUNGLE_TRAPDOOR_PLATE = registerBlock("jungle_trapdoor_plate",
            () -> new ModPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> HANGING_JUNGLE_PLATE = registerBlock("hanging_jungle_plate",
            () -> new ModHangingPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> HANGING_JUNGLE_TRAPDOOR_PLATE = registerBlock("hanging_jungle_trapdoor_plate",
            () -> new ModHangingPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));

    public static final Supplier<Block> ACACIA_PLATE = registerBlock("acacia_plate",
            () -> new ModPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> ACACIA_TRAPDOOR_PLATE = registerBlock("acacia_trapdoor_plate",
            () -> new ModPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> HANGING_ACACIA_PLATE = registerBlock("hanging_acacia_plate",
            () -> new ModHangingPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> HANGING_ACACIA_TRAPDOOR_PLATE = registerBlock("hanging_acacia_trapdoor_plate",
            () -> new ModHangingPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));

    public static final Supplier<Block> DARK_OAK_PLATE = registerBlock("dark_oak_plate",
            () -> new ModPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> DARK_OAK_TRAPDOOR_PLATE = registerBlock("dark_oak_trapdoor_plate",
            () -> new ModPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> HANGING_DARK_OAK_PLATE = registerBlock("hanging_dark_oak_plate",
            () -> new ModHangingPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> HANGING_DARK_OAK_TRAPDOOR_PLATE = registerBlock("hanging_dark_oak_trapdoor_plate",
            () -> new ModHangingPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));

    public static final Supplier<Block> MANGROVE_PLATE = registerBlock("mangrove_plate",
            () -> new ModPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> MANGROVE_TRAPDOOR_PLATE = registerBlock("mangrove_trapdoor_plate",
            () -> new ModPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> HANGING_MANGROVE_PLATE = registerBlock("hanging_mangrove_plate",
            () -> new ModHangingPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> HANGING_MANGROVE_TRAPDOOR_PLATE = registerBlock("hanging_mangrove_trapdoor_plate",
            () -> new ModHangingPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));

    public static final Supplier<Block> CHERRY_PLATE = registerBlock("cherry_plate",
            () -> new ModPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> CHERRY_TRAPDOOR_PLATE = registerBlock("cherry_trapdoor_plate",
            () -> new ModPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> HANGING_CHERRY_PLATE = registerBlock("hanging_cherry_plate",
            () -> new ModHangingPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> HANGING_CHERRY_TRAPDOOR_PLATE = registerBlock("hanging_cherry_trapdoor_plate",
            () -> new ModHangingPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));

    public static final Supplier<Block> BAMBOO_PLATE = registerBlock("bamboo_plate",
            () -> new ModPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> BAMBOO_TRAPDOOR_PLATE = registerBlock("bamboo_trapdoor_plate",
            () -> new ModPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> HANGING_BAMBOO_PLATE = registerBlock("hanging_bamboo_plate",
            () -> new ModHangingPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> HANGING_BAMBOO_TRAPDOOR_PLATE = registerBlock("hanging_bamboo_trapdoor_plate",
            () -> new ModHangingPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));

    public static final Supplier<Block> CRIMSON_PLATE = registerBlock("crimson_plate",
            () -> new ModPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> CRIMSON_TRAPDOOR_PLATE = registerBlock("crimson_trapdoor_plate",
            () -> new ModPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> HANGING_CRIMSON_PLATE = registerBlock("hanging_crimson_plate",
            () -> new ModHangingPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> HANGING_CRIMSON_TRAPDOOR_PLATE = registerBlock("hanging_crimson_trapdoor_plate",
            () -> new ModHangingPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));

    public static final Supplier<Block> WARPED_PLATE = registerBlock("warped_plate",
            () -> new ModPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> WARPED_TRAPDOOR_PLATE = registerBlock("warped_trapdoor_plate",
            () -> new ModPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> HANGING_WARPED_PLATE = registerBlock("hanging_warped_plate",
            () -> new ModHangingPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> HANGING_WARPED_TRAPDOOR_PLATE = registerBlock("hanging_warped_trapdoor_plate",
            () -> new ModHangingPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));

    public static final Supplier<Block> IRON_CARVED_PLATE = registerBlock("iron_carved_plate",
            () -> new ModPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL)
                    .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
                    .sound(SoundType.METAL)
                    .noOcclusion()));


    private static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block) {
        Supplier<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> Supplier<Item> registerBlockItem(String name, Supplier<T> block) {
        return ModItem.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
