package ga.mchorizons.semblance;

import net.fabricmc.api.ModInitializer;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Semblance implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Semblance");
	@Override
	public void onInitialize() {
		Config.createConfig();
		LOGGER.info("Rebranding server as \""+ Config.getServerBrand() +"\"");
	}
}
