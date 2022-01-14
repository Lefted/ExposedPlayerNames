package me.lefted.exposedplayernames;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExposedPlayerNames implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger("exposedplayernames");

    @Override
    public void onInitialize() {
        LOGGER.info("Initialized ExposedPlayerNames");
    }
}
