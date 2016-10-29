package error998.ple;

import org.apache.logging.log4j.Logger;

import error998.ple.init.ModItems;
import error998.ple.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.SidedProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSION)
public class PLE
{
	@Instance
	public static PLE instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	public static final CreativeTabs CREATIVE_TAB = new PLECreativeTab();
	
	public static Logger logger;
	
	
	@EventHandler
	public void preInit(FMLInitializationEvent event)
	{
		// Initialize stuff
		ModItems.init();
		proxy.preInit(event);
		
	}
	
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		// Register Renders
		proxy.init(event);
	}
	
	
	@EventHandler
	public void postInit(FMLInitializationEvent event)
	{
		proxy.postInit(event);
	}
}
