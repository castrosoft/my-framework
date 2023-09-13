package utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FrameworkProperties {

    private String result;

    public String getProperty(String key) {
        try {
            Properties properties = new Properties();
            String propertyFileName = "serenity.properties";

            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propertyFileName);

            if (inputStream != null) {
                properties.load(inputStream);
            } else {
                throw new FileNotFoundException("The property file has not been found");
            }
            this.result = properties.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
