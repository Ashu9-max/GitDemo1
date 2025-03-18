package practiceagain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashutosh\\Documents\\chromedriver-win64/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.saucedemo.com/");
		

		d.findElement(By.id("user-name")).sendKeys("standard_user");
		d.findElement(By.id("password")).sendKeys("secret_sauce");
		d.findElement(By.id("login-button")).click();
		
	}

}
