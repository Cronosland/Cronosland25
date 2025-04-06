package net.wayrayuq.cronosland.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.wayrayuq.cronosland.Cronosland;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Cronosland.MOD_ID);

    public static final RegistryObject<Item> MARIPOSA_DIAMANTE = ITEMS.register("mariposa_diamante",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MARIPOSA_ORO = ITEMS.register("mariposa_oro",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MARIPOSA_COBRE = ITEMS.register("mariposa_cobre",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
