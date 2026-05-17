package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    public static Properties loadProjectConfigurations() {

        Properties frameworkProperties =
                new Properties();

        try {

            FileInputStream file =
                    new FileInputStream(
                    "src/test/resources/config.properties");

            frameworkProperties.load(file);
        }

        catch(Exception exceptionObject) {

            System.out.println(exceptionObject);
        }

        return frameworkProperties;
    }
}