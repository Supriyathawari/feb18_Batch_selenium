package dataProvider;

import org.testng.annotations.DataProvider;

public class DataProviderUse {
	
	@DataProvider(name="myFBData")
	public static String[][] testdata()
	{
      String Data[][]= {{"Supriya","Thawari","7459950908"},{"Suppu","xyz","4567898765"},{"xyz","abc","78594"}};
      return Data;
	}
	

}
