package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButton extends Base{
	
	public void radioButton()
	{
		driver.navigate().to("https://demoqa.com/radio-button");
	 // WebElement xpath1= driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
	 // xpath1.click();
		WebElement xpath2= driver.findElement(By.xpath("//label[@for='yesRadio']"));
		 xpath2.click();
		
	}

	public static void main(String[] args) {
		RadioButton radiobutton= new RadioButton();
		radiobutton.initializeBrowser();
		radiobutton.radioButton();
		// TODO Auto-generated method stub

	}

}
