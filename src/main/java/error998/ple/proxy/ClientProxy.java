package error998.ple.proxy;

import error998.ple.init.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public class ClientProxy implements CommonProxy 
{
	@Override
	public void preInit(FMLInitializationEvent event)
	{
		// Initialize stuff 
		ModItems.registerRenders();
		
	}
	
	
	@Override
	public void init(FMLInitializationEvent event)
	{
		// Register Renders
		
	}
	
	
	@Override
	public void postInit(FMLInitializationEvent event)
	{
		
	}
}
