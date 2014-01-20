package hatb0t.pictocraft.runes;

import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Air_Rune extends Rune {

	public Air_Rune(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister){
		this.itemIcon = par1IconRegister.registerIcon("pictocraft" + ":" +(this.getUnlocalizedName().substring(5)));
	}

}
