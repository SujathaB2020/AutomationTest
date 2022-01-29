package Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	WebDriver driver;

	public static void main(String[] args) {
		TestClass obj = new TestClass();
		obj.launchWebsite();
		obj.signIn();
		obj.registration();
	}

	// To set and instantiate ChromeDriver
	public void launchWebsite() {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\vinod\\OneDrive\\Desktop\\Pinky\\Testing Softwares\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://arstechnica.com/");
			Thread.sleep(2000);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	// Locate elements and perform actions
	public void signIn() {
		try {
			WebElement sign_in_btn = driver.findElement(By.id("header-account"));
			sign_in_btn.click();
			Thread.sleep(2000);
			WebElement sign_up_btn = driver.findElement(By.xpath("//a[@class=\"signup-btn button button-wide\"]"));
			sign_up_btn.click();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	// Locate elements and perform actions
	public void registration() {
		try {
			WebElement Username = driver.findElement(By.id("username"));
			Username.sendKeys("adkfmjem");
			driver.findElement(By.id("new_password")).sendKeys("John@2020");
			driver.findElement(By.id("password_confirm")).sendKeys("John@2020");
			driver.findElement(By.id("email")).sendKeys("sujatha.com");
			driver.findElement(By.id("email_confirm")).sendKeys("sujatha.com");
			driver.findElement(By.name("submit")).click();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
