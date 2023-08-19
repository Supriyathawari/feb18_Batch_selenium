package testNGpolicybazaarusingXMLfile;

import org.testng.annotations.DataProvider;

public class PolicyDataProvider
{  
	@DataProvider(name="policybazaardata")
	public static String[][] datatest()
	{
		String data[][]= {{"9552439884","Ashu@1234","Kamini Harde"},{"9623153925","raju@2811","Rajashri Kadam"},{"9405888174","pallu12345","Pallavi Chaudhari"}};
		return data;
		
		
	}

}
