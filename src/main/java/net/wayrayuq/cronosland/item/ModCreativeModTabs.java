package net.wayrayuq.cronosland.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.wayrayuq.cronosland.Cronosland;
import net.wayrayuq.cronosland.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Cronosland.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CRONOSLAND_TAB = CREATIVE_MODE_TABS.register("cronosland_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MARIPOSA_DIAMANTE.get()))
                    .title(Component.translatable("creativetab.cronosland_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.MARIPOSA_DIAMANTE.get());
                        output.accept(ModItems.MARIPOSA_ORO.get());
                        output.accept(ModItems.MARIPOSA_HIERRO.get());
                        output.accept(ModItems.MARIPOSA_COBRE.get());
                        output.accept(ModItems.MANZANA_PERFORADA.get());

                        output.accept(ModBlocks.LIBRERIA.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
