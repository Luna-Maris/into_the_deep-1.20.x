package net.lunamaris.into_the_deep.items;

import net.lunamaris.into_the_deep.into_the_deep;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static  final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, into_the_deep.MOD_ID);
    public static final RegistryObject<CreativeModeTab> INTO_THE_DEEP = CREATIVE_MODE_TABS.register("into_the_deep",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(mod_items.heart_of_the_abyss.get()))
                    .title(Component.translatable("creativetab.into_the_deep"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(mod_items.heart_of_the_abyss.get());
                        output.accept(mod_items.bathysmal_shard.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
