package hatb0t.pictocraft.runes;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.*;
import net.minecraft.client.renderer.texture.IconRegister;

public class Rune extends Item{

	public Rune(int id) {
        super(id);
        // TODO Auto-generated constructor stub
        setMaxStackSize(16);
        
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister){
		this.itemIcon = par1IconRegister.registerIcon("pictocraft" + ":" +(this.getUnlocalizedName().substring(5)));
	}
	
}