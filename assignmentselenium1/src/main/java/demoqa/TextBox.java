package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TextBox extends Base{
	
	public void textBox()
	{
		driver.navigate().to("https://demoqa.com/text-box");
		WebElement xpath1= driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
		xpath1.sendKeys("SHINY LESLIE");
		WebElement xpath2= driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
		xpath2.sendKeys("abcd@gmail.com");
		WebElement xpath3= driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
		xpath3.sendKeys("XYZ, Tvpm");
		WebElement xpath4= driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		xpath4.sendKeys("LMNO, Tvpm");
		
	}

	public static void main(String[] args) {
		TextBox textbox= new TextBox();
		textbox.initializeBrowser();
		textbox.textBox();
		// TODO Auto-generated method stub

	}

}
