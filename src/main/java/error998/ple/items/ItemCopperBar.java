package error998.ple.items;

import error998.ple.Reference;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemCopperBar extends Item
{
	public ItemCopperBar()
	{
		setUnlocalizedName(Reference.PLE_Items.COPPERBAR.getUnlocalizedName());
		setRegistryName(Reference.PLE_Items.COPPERBAR.getRegistryName());
				
		setMaxDamage(0);
		
		// setCreativeTab(tab)
		
		// Register Item
		GameRegistry.register(this);
	}
}
