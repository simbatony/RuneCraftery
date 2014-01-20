package hatb0t.pictocraft.talismans;

import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Air_Talisman extends Talisman {

	public Air_Talisman(int par1) {
		super(par1);
		// TODO Auto-generated constructor stub
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister){
		this.itemIcon = par1IconRegister.registerIcon("pictocraft" + ":" +(this.getUnlocalizedName().substring(5)));
	}

}
