package error998.ple.items;

import error998.ple.Reference;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemIronBar extends Item
{
	public ItemIronBar()
	{
		setUnlocalizedName(Reference.PLE_Items.IRONBAR.getUnlocalizedName());
		setRegistryName(Reference.PLE_Items.IRONBAR.getRegistryName());
				
		setMaxDamage(0);
		
		// setCreativeTab(tab)
		
		// Register Item
		GameRegistry.register(this);
	}
}
