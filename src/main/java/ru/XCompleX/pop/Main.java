package ru.XCompleX.pop;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

@Mod(modid = "Pop", name = "Pop", version = "1.1.0")

public class Main {
	public static final CreativeTabs tabPop = new CreativeTabs("tabPop") {
		public Item getTabIconItem() {
			return Item.getItemFromBlock(Blocks.lava);
		}
	};
	
	@EventHandler
	public void preLoad(FMLPreInitializationEvent event) {
		
	}
}
