package com.ruscello.storage;

public class ConfigurationConstants {

    // TODO: does this need to change based on linux distro?
    public static String DEFAULT_DATA_DIR = "/var/lib/ruscello/data";
    public static String DEFAULT_LOGGING_DIR = "/var/log/ruscello";
    public static String DEFAULT_ENGINE = "rocksdb";

    private ConfigurationConstants() {
        // statics only
    }

}
