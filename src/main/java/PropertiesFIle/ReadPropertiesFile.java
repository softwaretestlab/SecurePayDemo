package PropertiesFIle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class ReadPropertiesFile {

	public static String PropFile(String PropName) throws IOException{
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\PropertiesFIle\\ProjectProperties.properties");
		Properties property = new Properties();
		property.load(fs);
			return property.getProperty(PropName);
}
}
