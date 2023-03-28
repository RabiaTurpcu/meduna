package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configreader {

    public static Properties properties;

    static {

        String path = "configuration.properties";

        try {
            FileInputStream fis = new FileInputStream(path);// dosyayi okumasi icin bunu yazdik icine path gonderrdik
            properties = new Properties();//properties atamasi yaptik
            properties.load(fis);
            fis.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getProperty(String key) {

    return properties.getProperty(key);
    }


}

