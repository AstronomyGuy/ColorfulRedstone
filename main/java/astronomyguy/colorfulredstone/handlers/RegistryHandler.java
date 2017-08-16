package astronomyguy.colorfulredstone.handlers;

import astronomyguy.colorfulredstone.init.BlockInit;
import astronomyguy.colorfulredstone.init.ItemInit;

public class RegistryHandler {
	
	public static void Client() {
		ItemInit.register();
		BlockInit.registerRenders();
	}
	
	public static void Common() {
			ItemInit.init();
			ItemInit.register();
			BlockInit.init();
			BlockInit.register();
	}
	
}
