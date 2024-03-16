package com.hepsiburada.base;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

public class ConfigHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigHandler.class);
    private static final Type CONFIG_TYPE = new com.google.gson.reflect.TypeToken<Map<String, String>>() {
    }.getType();
    private static final Gson GSON = new Gson();

    private JsonObject parseConfigJson() {
        try {
            return JsonParser.parseReader(new FileReader("src/test/resources/config.json")).getAsJsonObject();
        } catch (IOException e) {
            LOGGER.error("Config file could not be read.");
            Thread.currentThread().interrupt();
            return new JsonObject();
        }
    }


    public Map<String, String> getConfigs(String configKey) {
        return GSON.fromJson(parseConfigJson().getAsJsonObject("environments").getAsJsonObject(configKey), CONFIG_TYPE);
    }

    public String getEnvironment() {
        if (!(System.getenv("environment").isEmpty())) {
            return System.getenv("environment");
        }
        return "production";
    }
}