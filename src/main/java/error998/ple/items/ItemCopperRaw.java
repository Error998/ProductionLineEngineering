package error998.ple.items;

import error998.ple.Reference;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemCopperRaw extends Item
{
	public ItemCopperRaw()
	{
		setUnlocalizedName(Reference.PLE_Items.RAWCOPPER.getUnlocalizedName());
		setRegistryName(Reference.PLE_Items.RAWCOPPER.getRegistryName());
				
		setMaxDamage(0);
		
		// setCreativeTab(tab)
		
		// Register Item
		GameRegistry.register(this);
	}
}
