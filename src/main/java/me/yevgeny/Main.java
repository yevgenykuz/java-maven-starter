package me.yevgeny;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main class template.
 *
 * @author Yevgeny Kuznetsov
 * @since 1.0.0, 19 August 2019
 **/
public class Main {

    static final String TEMP_PROPERTIES_FILE_NAME = "temp.properties";
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Properties properties = loadPropertiesFromFile(TEMP_PROPERTIES_FILE_NAME);
        properties.forEach((k, v) -> logger.info(k + "=" + v));
    }

    static Properties loadPropertiesFromFile(String fileName) {
        Properties properties = new Properties();

        try (InputStream resourceAsStream = Main.class.getClassLoader().getResourceAsStream(fileName)) {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            logger.error("Unable to load properties file1: " + fileName);
        }

        return properties;
    }
}
