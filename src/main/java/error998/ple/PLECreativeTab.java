package error998.ple;

import error998.ple.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PLECreativeTab extends CreativeTabs{

	public PLECreativeTab()
	{
		super("creativeTab");
	}

	// Creative Tab Icon
	@Override
	public Item getTabIconItem()
	{
		return ModItems.plasticRaw;
	}
	
}
