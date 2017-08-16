package astronomyguy.colorfulredstone;

import astronomyguy.colorfulredstone.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	 public static void preInit(FMLPreInitializationEvent event) {
		 proxy.preInit(event);
	 }
	@EventHandler
	 public static void Init(FMLInitializationEvent event) {
		 System.out.println("[" + Reference.MODID + "] Colorful Redstone Mod Exists!");
		 proxy.Init(event);
	 }
	@EventHandler
	 public static void postInit(FMLPostInitializationEvent event) {
		 proxy.postInit(event);
	 }
	
}
