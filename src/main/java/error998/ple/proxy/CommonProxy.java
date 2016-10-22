package error998.ple.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public interface CommonProxy
{
	public void preInit(FMLInitializationEvent event);
	public void init(FMLInitializationEvent event);
	public void postInit(FMLInitializationEvent event);
}
