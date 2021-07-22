package ga.mchorizons.semblance;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Semblance implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("Semblance");
	@Override
	public void onInitialize() {
		Config.createConfig();
		LOGGER.info("Rebranding server as \""+ Config.getServerBrand() +"\"");
	}
}
