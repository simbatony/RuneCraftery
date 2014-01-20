package hatb0t.pictocraft.symbols;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Symbol extends Item{

	public Symbol(int par1) {
		super(par1);
		// TODO Auto-generated constructor stub
		setMaxStackSize(16);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister){
		this.itemIcon = par1IconRegister.registerIcon("pictocraft" + ":" +(this.getUnlocalizedName().substring(5)));
	}

}
