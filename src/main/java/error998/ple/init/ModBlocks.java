package error998.ple.init;

import error998.ple.blocks.BlockFactoryFloor;
import error998.ple.blocks.BlockFactoryWall;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	public static Block floor;
	public static Block wall;
	
	
	public static void init()
	{
		floor = new BlockFactoryFloor();
		wall = new BlockFactoryWall();
		
	}
	
	
	public static void register()
	{
		registerBlock(floor);
		registerBlock(wall);
		
	}
	
	
	private static void registerBlock(Block block)
	{
		// Register Block
		GameRegistry.register(block);
		
		// Create new item of block and register it
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		item.setUnlocalizedName(block.getUnlocalizedName());
		GameRegistry.register(item);
	}
	
	
	public static void registerRenders()
	{
		registerRender(floor);
		registerRender(wall);
		
	}
	
	
	private static void registerRender(Block block)
	{
		ModelResourceLocation location = new ModelResourceLocation(block.getRegistryName(), "inventory");
		final int DEFAULT_ITEM_SUBTYPE = 0;
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), DEFAULT_ITEM_SUBTYPE, location);		
	}
}
