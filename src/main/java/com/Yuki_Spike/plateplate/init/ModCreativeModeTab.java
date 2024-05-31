package com.Yuki_Spike.plateplate.init;

import com.Yuki_Spike.plateplate.PlatePlate;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PlatePlate.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PLATE_TAB = CREATIVE_MODE_TABS.register("plate_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + PlatePlate.MODID + ".tab"))
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ModItem.HACKSAW.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ModItem.HACKSAW.get());
                output.accept(ModBlock.OAK_PLATE.get());
                output.accept(ModBlock.OAK_CARVED_PLATE.get());
                output.accept(ModBlock.HANGING_OAK_PLATE.get());
                output.accept(ModBlock.HANGING_OAK_CARVED_PLATE.get());
                output.accept(ModBlock.SPRUCE_PLATE.get());
                output.accept(ModBlock.SPRUCE_CARVED_PLATE.get());
                output.accept(ModBlock.HANGING_SPRUCE_PLATE.get());
                output.accept(ModBlock.HANGING_SPRUCE_CARVED_PLATE.get());
                output.accept(ModBlock.BIRCH_PLATE.get());
                output.accept(ModBlock.BIRCH_CARVED_PLATE.get());
                output.accept(ModBlock.HANGING_BIRCH_PLATE.get());
                output.accept(ModBlock.HANGING_BIRCH_CARVED_PLATE.get());
                output.accept(ModBlock.JUNGLE_PLATE.get());
                output.accept(ModBlock.JUNGLE_CARVED_PLATE.get());
                output.accept(ModBlock.HANGING_JUNGLE_PLATE.get());
                output.accept(ModBlock.HANGING_JUNGLE_CARVED_PLATE.get());
                output.accept(ModBlock.ACACIA_PLATE.get());
                output.accept(ModBlock.ACACIA_CARVED_PLATE.get());
                output.accept(ModBlock.HANGING_ACACIA_PLATE.get());
                output.accept(ModBlock.HANGING_ACACIA_CARVED_PLATE.get());
                output.accept(ModBlock.DARK_OAK_PLATE.get());
                output.accept(ModBlock.DARK_OAK_CARVED_PLATE.get());
                output.accept(ModBlock.HANGING_DARK_OAK_PLATE.get());
                output.accept(ModBlock.HANGING_DARK_OAK_CARVED_PLATE.get());
                output.accept(ModBlock.MANGROVE_PLATE.get());
                output.accept(ModBlock.MANGROVE_CARVED_PLATE.get());
                output.accept(ModBlock.HANGING_MANGROVE_PLATE.get());
                output.accept(ModBlock.HANGING_MANGROVE_CARVED_PLATE.get());
                output.accept(ModBlock.CHERRY_PLATE.get());
                output.accept(ModBlock.CHERRY_CARVED_PLATE.get());
                output.accept(ModBlock.HANGING_CHERRY_PLATE.get());
                output.accept(ModBlock.HANGING_CHERRY_CARVED_PLATE.get());
                output.accept(ModBlock.BAMBOO_PLATE.get());
                output.accept(ModBlock.BAMBOO_CARVED_PLATE.get());
                output.accept(ModBlock.HANGING_BAMBOO_PLATE.get());
                output.accept(ModBlock.HANGING_BAMBOO_CARVED_PLATE.get());
                output.accept(ModBlock.CRIMSON_PLATE.get());
                output.accept(ModBlock.CRIMSON_CARVED_PLATE.get());
                output.accept(ModBlock.HANGING_CRIMSON_PLATE.get());
                output.accept(ModBlock.HANGING_CRIMSON_CARVED_PLATE.get());
                output.accept(ModBlock.WARPED_PLATE.get());
                output.accept(ModBlock.WARPED_CARVED_PLATE.get());
                output.accept(ModBlock.HANGING_WARPED_PLATE.get());
                output.accept(ModBlock.HANGING_WARPED_CARVED_PLATE.get());

                output.accept(ModBlock.IRON_CARVED_PLATE.get());
                output.accept(ModBlock.HANGING_IRON_CARVED_PLATE.get());
                output.accept(ModBlock.COPPER_CARVED_PLATE.get());
                output.accept(ModBlock.HANGING_COPPER_CARVED_PLATE.get());

                output.accept(ModBlock.GLASS_PLATE.get());
                output.accept(ModBlock.HANGING_GLASS_PLATE.get());
                output.accept(ModBlock.REDSTONE_PLATE.get());
                output.accept(ModBlock.REDSTONE_LAMP_PLATE.get());
            }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
