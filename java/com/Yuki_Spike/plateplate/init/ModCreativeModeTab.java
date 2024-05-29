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
                output.accept(ModBlock.OAK_TRAPDOOR_PLATE.get());
                output.accept(ModBlock.HANGING_OAK_PLATE.get());
                output.accept(ModBlock.HANGING_OAK_TRAPDOOR_PLATE.get());
                output.accept(ModBlock.SPRUCE_PLATE.get());
                output.accept(ModBlock.SPRUCE_TRAPDOOR_PLATE.get());
                output.accept(ModBlock.HANGING_SPRUCE_PLATE.get());
                output.accept(ModBlock.HANGING_SPRUCE_TRAPDOOR_PLATE.get());
                output.accept(ModBlock.BIRCH_PLATE.get());
                output.accept(ModBlock.BIRCH_TRAPDOOR_PLATE.get());
                output.accept(ModBlock.HANGING_BIRCH_PLATE.get());
                output.accept(ModBlock.HANGING_BIRCH_TRAPDOOR_PLATE.get());
                output.accept(ModBlock.JUNGLE_PLATE.get());
                output.accept(ModBlock.JUNGLE_TRAPDOOR_PLATE.get());
                output.accept(ModBlock.HANGING_JUNGLE_PLATE.get());
                output.accept(ModBlock.HANGING_JUNGLE_TRAPDOOR_PLATE.get());
                output.accept(ModBlock.ACACIA_PLATE.get());
                output.accept(ModBlock.ACACIA_TRAPDOOR_PLATE.get());
                output.accept(ModBlock.HANGING_ACACIA_PLATE.get());
                output.accept(ModBlock.HANGING_ACACIA_TRAPDOOR_PLATE.get());
                output.accept(ModBlock.DARK_OAK_PLATE.get());
                output.accept(ModBlock.DARK_OAK_TRAPDOOR_PLATE.get());
                output.accept(ModBlock.HANGING_DARK_OAK_PLATE.get());
                output.accept(ModBlock.HANGING_DARK_OAK_TRAPDOOR_PLATE.get());
                output.accept(ModBlock.MANGROVE_PLATE.get());
                output.accept(ModBlock.MANGROVE_TRAPDOOR_PLATE.get());
                output.accept(ModBlock.HANGING_MANGROVE_PLATE.get());
                output.accept(ModBlock.HANGING_MANGROVE_TRAPDOOR_PLATE.get());
                output.accept(ModBlock.CHERRY_PLATE.get());
                output.accept(ModBlock.CHERRY_TRAPDOOR_PLATE.get());
                output.accept(ModBlock.HANGING_CHERRY_PLATE.get());
                output.accept(ModBlock.HANGING_CHERRY_TRAPDOOR_PLATE.get());
                output.accept(ModBlock.BAMBOO_PLATE.get());
                output.accept(ModBlock.BAMBOO_TRAPDOOR_PLATE.get());
                output.accept(ModBlock.HANGING_BAMBOO_PLATE.get());
                output.accept(ModBlock.HANGING_BAMBOO_TRAPDOOR_PLATE.get());
                output.accept(ModBlock.CRIMSON_PLATE.get());
                output.accept(ModBlock.CRIMSON_TRAPDOOR_PLATE.get());
                output.accept(ModBlock.HANGING_CRIMSON_PLATE.get());
                output.accept(ModBlock.HANGING_CRIMSON_TRAPDOOR_PLATE.get());
                output.accept(ModBlock.WARPED_PLATE.get());
                output.accept(ModBlock.WARPED_TRAPDOOR_PLATE.get());
                output.accept(ModBlock.HANGING_WARPED_PLATE.get());
                output.accept(ModBlock.HANGING_WARPED_TRAPDOOR_PLATE.get());

                output.accept(ModBlock.IRON_CARVED_PLATE.get());
            }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
