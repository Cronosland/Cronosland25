package net.wayrayuq.cronosland.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.wayrayuq.cronosland.Cronosland;
import net.wayrayuq.cronosland.block.custom.FunkoBlock;
import net.wayrayuq.cronosland.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Cronosland.MOD_ID);

    public static final RegistryObject<Block> LIBRERIA = registerBlock("libreria",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_BOOKSHELF)
                    .destroyTime(-1).explosionResistance(4), UniformInt.of(6,12)));

    public static final RegistryObject<Block> FUNKO = registerBlock("funko",
            ()-> new FunkoBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).noOcclusion()));

    private  static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private  static <T extends  Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
