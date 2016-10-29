package error998.ple.items;

import error998.ple.PLE;
import error998.ple.Reference;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemPlasticBar extends Item
{
	public ItemPlasticBar()
	{
		setUnlocalizedName(Reference.PLE_Items.PLASTICBAR.getUnlocalizedName());
		setRegistryName(Reference.PLE_Items.PLASTICBAR.getRegistryName());
				
		setMaxDamage(0);
		
		setCreativeTab(PLE.CREATIVE_TAB);
		
		// Register Item
		GameRegistry.register(this);
	}
}
