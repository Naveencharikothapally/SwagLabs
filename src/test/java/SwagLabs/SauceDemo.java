package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SauceDemo {
	WebDriver driver;
	@Test(priority=1)
	void OpenApp() {
		driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
	    driver.manage().window().maximize();
	}
	@Test(priority=2)
	void Login() throws InterruptedException {
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.name("login-button")).click();
	}
	@Test(priority=3)
	void AddToCart() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
		Thread.sleep(3000);
		}
	@Test(priority=4)
	void ViewCart() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
		Thread.sleep(3000);
	}
	@Test(priority=5)
	void CheckOut() throws InterruptedException {
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(3000);
	}
	@Test(priority=6)
	void Adress() {
		driver.findElement(By.name("firstName")).sendKeys("Navi");
		//Last name
		driver.findElement(By.name("lastName")).sendKeys("kothapally");
		//pin code
		driver.findElement(By.name("postalCode")).sendKeys("500080");
		//continue
		driver.findElement(By.name("continue")).click();
	}
	@Test(priority=7)
	void Finish() {
		driver.findElement(By.name("finish")).click();
	}
	@Test(priority=8)
	void BackToHome() {
		driver.findElement(By.name("back-to-products")).click();
	}
	@Test(priority=9)
	void Menu() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
		Thread.sleep(3000);
	}
	@Test(priority=10)
	void Logout() {
		driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
	}
	
}
