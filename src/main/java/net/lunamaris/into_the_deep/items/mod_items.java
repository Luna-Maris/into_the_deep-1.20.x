package net.lunamaris.into_the_deep.items;

import net.lunamaris.into_the_deep.into_the_deep;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class mod_items {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, into_the_deep.MOD_ID);

    public static final RegistryObject<Item> heart_of_the_abyss = ITEMS.register("heart_of_the_abyss",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> bathysmal_shard = ITEMS.register("bathysmal_shard",
            () -> new Item(new Item.Properties()));
    public static void Register(IEventBus eventBus) {
        ITEMS.register(eventBus);
     }
}
