package hatb0t.pictocraft.talismans;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Chain extends Item {

	public Chain(int par1) {
		super(par1);
		// TODO Auto-generated constructor stub
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister){
		this.itemIcon = par1IconRegister.registerIcon("pictocraft" + ":" +(this.getUnlocalizedName().substring(5)));
	}

}
