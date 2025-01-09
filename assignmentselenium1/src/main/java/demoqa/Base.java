package demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
	WebDriver driver;
	
	public void initializeBrowser()
	{
		driver= new EdgeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
	}

	public static void main(String[] args) {
		Base base= new Base();
		base.initializeBrowser();
		// TODO Auto-generated method stub

	}

}
