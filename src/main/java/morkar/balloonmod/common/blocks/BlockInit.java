package morkar.balloonmod.common.blocks;

import morkar.balloonmod.BalloonMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(BalloonMod.MOD_ID)
@Mod.EventBusSubscriber(modid = BalloonMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockInit {

    public static final Block example_block = null;
    public static final Block mokka_block = null;

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
       event.getRegistry().register(new Block(Block.Properties.create(Material.WOOL).lightValue(15).tickRandomly().sound(SoundType.ANVIL)).setRegistryName("example_block"));
       event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).lightValue(255).sound(SoundType.GLASS)).setRegistryName("mokka_block"));
    }

    @SubscribeEvent
    public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
      event.getRegistry().register(new BlockItem(example_block, new Item.Properties().maxStackSize(42).group(ItemGroup.DECORATIONS)).setRegistryName("example_block"));
      event.getRegistry().register(new BlockItem(mokka_block, new Item.Properties().maxStackSize(42).group(ItemGroup.DECORATIONS)).setRegistryName("mokka_block"));
    }
}
