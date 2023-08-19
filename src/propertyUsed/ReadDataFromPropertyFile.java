package propertyUsed;

import java.io.FileInputStream;
import java.io.IOException;
//import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException
	{
		//1.Create Object of Properties
		
		Properties prop=new Properties();
		
		//2. create object of FileInputStrem
		
		FileInputStream myfile=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\feb18_2023_selenium\\Myproperty.properties");
	
		//load property file
		
		prop.load(myfile);
		
		//get the property by calling key
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("mobNum"));
		
		
		

	}

}
