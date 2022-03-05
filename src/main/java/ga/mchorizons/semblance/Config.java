package ga.mchorizons.semblance;

import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Properties;

public class Config {

    public static final Logger LOGGER = LoggerFactory.getLogger("Semblance");

    public static void createConfig() {
        try {
            File config = new File(String.valueOf(FabricLoader.getInstance().getConfigDir().resolve("semblance.properties")));
            if (config.createNewFile()) {
                writeDefault();
            }
        } catch (IOException e) {
            LOGGER.warn("An error occurred while creating the config!");
            e.printStackTrace();
        }
    }

    private static void writeDefault() {
        try {
            FileWriter configWriter = new FileWriter(String.valueOf(FabricLoader.getInstance().getConfigDir().resolve("semblance.properties")));
            configWriter.write("#Semblance Config\n");
            configWriter.write("brand=TaterMC");
            configWriter.close();
        } catch (IOException e) {
            LOGGER.warn("An error occurred while creating the config!");
            e.printStackTrace();
        }
    }

    public static String getServerBrand() {
        Properties properties = new Properties();
        String brand;
        try {
            properties.load(Files.newInputStream(FabricLoader.getInstance().getConfigDir().resolve("semblance.properties")));
        } catch (IOException e) {
            LOGGER.warn("An error occurred while reading the config!");
            e.printStackTrace();
        }
        if (!properties.getProperty("brand").equals("vanilla") & !properties.getProperty("brand").equals("forge")) {
            brand = properties.getProperty("brand");
        } else {
            LOGGER.warn("Server can't be rebranded to \"" + properties.getProperty("brand") + "\"");
            throw new SecurityException("Server can't be rebranded to a valid name");
        }
        return brand;
    }
}
