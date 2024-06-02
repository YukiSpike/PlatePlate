package com.Yuki_Spike.plateplate.init;

import com.Yuki_Spike.plateplate.PlatePlate;
import com.Yuki_Spike.plateplate.block.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class ModBlock {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(PlatePlate.MODID);

    //木板
    public static final Supplier<Block> OAK_PLATE = registerBlock("oak_plate",
            () -> new ModPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> OAK_CARVED_PLATE = registerBlock("oak_carved_plate",
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
    public static final Supplier<Block> HANGING_OAK_CARVED_PLATE = registerBlock("hanging_oak_carved_plate",
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
    public static final Supplier<Block> SPRUCE_CARVED_PLATE = registerBlock("spruce_carved_plate",
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
    public static final Supplier<Block> HANGING_SPRUCE_CARVED_PLATE = registerBlock("hanging_spruce_carved_plate",
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
    public static final Supplier<Block> BIRCH_CARVED_PLATE = registerBlock("birch_carved_plate",
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
    public static final Supplier<Block> HANGING_BIRCH_CARVED_PLATE = registerBlock("hanging_birch_carved_plate",
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
    public static final Supplier<Block> JUNGLE_CARVED_PLATE = registerBlock("jungle_carved_plate",
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
    public static final Supplier<Block> HANGING_JUNGLE_CARVED_PLATE = registerBlock("hanging_jungle_carved_plate",
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
    public static final Supplier<Block> ACACIA_CARVED_PLATE = registerBlock("acacia_carved_plate",
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
    public static final Supplier<Block> HANGING_ACACIA_CARVED_PLATE = registerBlock("hanging_acacia_carved_plate",
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
    public static final Supplier<Block> DARK_OAK_CARVED_PLATE = registerBlock("dark_oak_carved_plate",
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
    public static final Supplier<Block> HANGING_DARK_OAK_CARVED_PLATE = registerBlock("hanging_dark_oak_carved_plate",
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
    public static final Supplier<Block> MANGROVE_CARVED_PLATE = registerBlock("mangrove_carved_plate",
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
    public static final Supplier<Block> HANGING_MANGROVE_CARVED_PLATE = registerBlock("hanging_mangrove_carved_plate",
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
    public static final Supplier<Block> CHERRY_CARVED_PLATE = registerBlock("cherry_carved_plate",
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
    public static final Supplier<Block> HANGING_CHERRY_CARVED_PLATE = registerBlock("hanging_cherry_carved_plate",
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
    public static final Supplier<Block> BAMBOO_CARVED_PLATE = registerBlock("bamboo_carved_plate",
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
    public static final Supplier<Block> HANGING_BAMBOO_CARVED_PLATE = registerBlock("hanging_bamboo_carved_plate",
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
    public static final Supplier<Block> CRIMSON_CARVED_PLATE = registerBlock("crimson_carved_plate",
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
    public static final Supplier<Block> HANGING_CRIMSON_CARVED_PLATE = registerBlock("hanging_crimson_carved_plate",
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
    public static final Supplier<Block> WARPED_CARVED_PLATE = registerBlock("warped_carved_plate",
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
    public static final Supplier<Block> HANGING_WARPED_CARVED_PLATE = registerBlock("hanging_warped_carved_plate",
            () -> new ModHangingPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));

    //石板
    public static final Supplier<Block> SMOOTH_STONE_PLATE = registerBlock("smooth_stone_plate",
            () -> new ModPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)
                    .noOcclusion()));
    public static final Supplier<Block> HANGING_SMOOTH_STONE_PLATE = registerBlock("hanging_smooth_stone_plate",
            () -> new ModHangingPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)
                    .noOcclusion()));

    //金属板
    public static final Supplier<Block> IRON_PLATE = registerBlock("iron_plate",
            () -> new ModPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL)
                    .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
                    .sound(SoundType.METAL)
                    .noOcclusion()));
    public static final Supplier<Block> IRON_CARVED_PLATE = registerBlock("iron_carved_plate",
            () -> new ModPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL)
                    .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
                    .sound(SoundType.METAL)
                    .noOcclusion()));
    public static final Supplier<Block> HANGING_IRON_PLATE = registerBlock("hanging_iron_plate",
            () -> new ModHangingPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL)
                    .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
                    .sound(SoundType.METAL)
                    .noOcclusion()));
    public static final Supplier<Block> HANGING_IRON_CARVED_PLATE = registerBlock("hanging_iron_carved_plate",
            () -> new ModHangingPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL)
                    .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
                    .sound(SoundType.METAL)
                    .noOcclusion()));

    public static final Supplier<Block> COPPER_PLATE = registerBlock("copper_plate",
            () -> new ModPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_ORANGE)
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 6.0F)
                    .sound(SoundType.COPPER)
                    .noOcclusion()));
    public static final Supplier<Block> COPPER_CARVED_PLATE = registerBlock("copper_carved_plate",
            () -> new ModPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_ORANGE)
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 6.0F)
                    .sound(SoundType.COPPER)
                    .noOcclusion()));
    public static final Supplier<Block> HANGING_COPPER_PLATE = registerBlock("hanging_copper_plate",
            () -> new ModHangingPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_ORANGE)
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 6.0F)
                    .sound(SoundType.COPPER)
                    .noOcclusion()));
    public static final Supplier<Block> HANGING_COPPER_CARVED_PLATE = registerBlock("hanging_copper_carved_plate",
            () -> new ModHangingPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_ORANGE)
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 6.0F)
                    .sound(SoundType.COPPER)
                    .noOcclusion()));

    //玻璃板
    public static final Supplier<Block> GLASS_PLATE = registerBlock("glass_plate",
            () -> new ModPlateBlock(BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sound(SoundType.GLASS)
                    .noOcclusion()));
    public static final Supplier<Block> HANGING_GLASS_PLATE = registerBlock("hanging_glass_plate",
            () -> new ModHangingPlateBlock(BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sound(SoundType.GLASS)
                    .noOcclusion()));

    //特殊方块
    public static final Supplier<Block> CRAFTING_PLATE = registerBlock("crafting_plate",
            () -> new ModCraftingPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.5F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> HANGING_CRAFTING_PLATE = registerBlock("hanging_crafting_plate",
            () -> new ModHangingCraftingPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.5F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Supplier<Block> REDSTONE_PLATE = registerBlock("redstone_plate",
            () -> new ModPoweredPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.FIRE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
                    .sound(SoundType.METAL)
                    .noOcclusion()));
    public static final Supplier<Block> HANGING_REDSTONE_PLATE = registerBlock("hanging_redstone_plate",
            () -> new ModHangingPoweredPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.FIRE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
                    .sound(SoundType.METAL)
                    .noOcclusion()));
    public static final Supplier<Block> REDSTONE_LAMP_PLATE = registerBlock("redstone_lamp_plate",
            () -> new ModLampPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.FIRE)
                    .lightLevel(litBlockEmission(15))
                    .strength(0.3F)
                    .sound(SoundType.GLASS)
                    .noOcclusion()));
    public static final Supplier<Block> HANGING_REDSTONE_LAMP_PLATE = registerBlock("hanging_redstone_lamp_plate",
            () -> new ModHangingLampPlateBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.FIRE)
                    .lightLevel(litBlockEmission(15))
                    .strength(0.3F)
                    .sound(SoundType.GLASS)
                    .noOcclusion()));


    private static ToIntFunction<BlockState> litBlockEmission(int pLightValue) {
        return p_50763_ -> p_50763_.getValue(BlockStateProperties.LIT) ? pLightValue : 0;
    }

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
