package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static final Properties properties = new Properties();

    static {


        try (InputStream in = new FileInputStream("Configuration.properties")) {

            properties.load(in);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to load properties file");

        }
    }

    public static String getProperties(String key) {
       
        return properties.getProperty(key);

    }

}
