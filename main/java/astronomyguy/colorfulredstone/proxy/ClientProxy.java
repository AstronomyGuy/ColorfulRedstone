package astronomyguy.colorfulredstone.proxy;

import astronomyguy.colorfulredstone.handlers.RegistryHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	 public void preInit(FMLPreInitializationEvent event) {
		 super.preInit(event);
		 RegistryHandler.Client();
	 }

	 public void Init(FMLInitializationEvent event) {
		 super.Init(event);
	 }

	 public void postInit(FMLPostInitializationEvent event) {
		 super.postInit(event);
	 }
	
}
