package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox extends Base{
	
	public void checkBox() 
	{
		driver.navigate().to("https://demoqa.com/checkbox");
		WebElement xpath1= driver.findElement(By.xpath("//span[@class='rct-title']"));
		xpath1.click();
	}

	public static void main(String[] args) {
		CheckBox checkbox= new CheckBox();
		checkbox.initializeBrowser();
		checkbox.checkBox();
		// TODO Auto-generated method stub

	}

}
