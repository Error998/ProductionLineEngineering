package error998.ple.init;

import error998.ple.items.ItemCopperBar;
import error998.ple.items.ItemCopperRaw;
import error998.ple.items.ItemIronBar;
import error998.ple.items.ItemIronRaw;
import error998.ple.items.ItemPlasticBar;
import error998.ple.items.ItemPlasticRaw;
import error998.ple.items.ItemRubberRaw;
import error998.ple.items.ItemScrapRaw;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems 
{
	public static Item plasticRaw;
	public static Item plasticBar;
	public static Item copperBar;
	public static Item copperRaw;
	public static Item ironBar;
	public static Item ironRaw;
	public static Item rubberRaw;
	public static Item scrapRaw;
	
	
	
	public static void init()
	{
		// this Static Item = ItemClass()
		plasticRaw = new ItemPlasticRaw(); 
		plasticBar = new ItemPlasticBar();
		copperBar = new ItemCopperBar();
		copperRaw = new ItemCopperRaw();
		ironBar = new ItemIronBar();
		ironRaw = new ItemIronRaw();
		rubberRaw = new ItemRubberRaw();
		scrapRaw = new ItemScrapRaw();
	}
	
	
	// Only called from Client proxy
	public static void registerRenders()
	{
		registerBasicModelRender(plasticRaw);
		registerBasicModelRender(plasticBar);
		registerBasicModelRender(copperBar);
		registerBasicModelRender(copperRaw);
		registerBasicModelRender(ironBar);
		registerBasicModelRender(ironRaw);
		registerBasicModelRender(rubberRaw);
		registerBasicModelRender(scrapRaw);											
	}
	
	
	private static void registerBasicModelRender(Item item)
	{
		ModelResourceLocation location = new ModelResourceLocation(item.getRegistryName(), "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, location);
	}
}
