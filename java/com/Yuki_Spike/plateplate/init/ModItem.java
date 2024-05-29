package com.Yuki_Spike.plateplate.init;

import com.Yuki_Spike.plateplate.PlatePlate;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItem {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PlatePlate.MODID);

    public static final DeferredItem<Item> HACKSAW = ITEMS.register("hacksaw",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
