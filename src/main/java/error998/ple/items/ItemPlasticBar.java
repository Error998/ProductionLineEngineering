package error998.ple.items;

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
		
		// setCreativeTab(tab)
		
		// Register Item
		GameRegistry.register(this);
	}
}
