import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class complicatedxpaths {
	
	WebDriver driver;
	ChromeOptions options;
	
	//locating parent element
	@Test(enabled = false)
	public void method1() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SEDHU\\eclipse-workspace\\newbrowser\\drivers\\chromedriver.exe");
	    options = new ChromeOptions();
	    options.setBinary("C:\\Users\\SEDHU\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
	   driver = new ChromeDriver(options);
	    driver.get("https://www.saucedemo.com/");
	  driver.findElement(By.xpath("//*[@id='password']/parent::div"));
	  driver.findElement(By.xpath("//*[@id='password']/parent::*"));
	    
	}
	
	//locating child element
	@Test(enabled = false)
	public void method2() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SEDHU\\eclipse-workspace\\newbrowser\\drivers\\chromedriver.exe");
	    options = new ChromeOptions();
	    options.setBinary("C:\\Users\\SEDHU\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
	   driver = new ChromeDriver(options);
	    driver.get("https://www.saucedemo.com/");
//	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
//	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
//	    driver.findElement(By.id("login-button")).click();
//	    driver.findElement(By.id("react-burger-menu-btn")).click();
//	    Thread.sleep(4000);
//	    driver.findElement(By.xpath("//a[text()='Logout']")).click();
//	    
	    
	  //two methods are there-> giving child and then :: or directly giving/  
	// driver.findElement(By.xpath("//*[@class='form_group']/child::input[@id='password']")).sendKeys("dcdcececec");
	 //driver.findElement(By.xpath("//nav[@class='bm-item-list']/a[contains(text(),'About')]"));
	    
	}
	//ancestor 
	@Test(enabled = true)
	public void method3() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SEDHU\\eclipse-workspace\\newbrowser\\drivers\\chromedriver.exe");
	    options = new ChromeOptions();
	    options.setBinary("C:\\Users\\SEDHU\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
	   driver = new ChromeDriver(options);
	    driver.get("https://www.saucedemo.com/");
//	    
	// driver.findElement(By.xpath("//nav[@class='bm-item-list']/ancestor::div")).sendKeys("dcdcececec");
	 //driver.findElement(By.xpath("driver.findElement(By.xpath("//nav[@class='bm-item-list']/ancestor::*")).sendKeys("dcdcececec");")).sendKeys("dcdcececec");
	    
	}
	
	//following  and preceding
		@Test(enabled = true)
		public void method4and5() {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\SEDHU\\eclipse-workspace\\newbrowser\\drivers\\chromedriver.exe");
		    options = new ChromeOptions();
		    options.setBinary("C:\\Users\\SEDHU\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		   driver = new ChromeDriver(options);
		    driver.get("https://www.saucedemo.com/");
//		   
		    
		  //two methods are there-> giving child and then :: or directly giving/  
		// driver.findElement(By.xpath("//a[@id='inventory_sidebar_link']/following::a[contains(text(),'Logout')]")).sendKeys("dcdcececec");
		 //driver.findElement(By.xpath("driver.findElement(By.xpath("//a[@id='inventory_sidebar_link']/following::a[3]")).sendKeys("dcdcececec");")).sendKeys("dcdcececec");
	//	preceding    //driver.findElement(By.xpath("driver.findElement(By.xpath("//a[@id='inventory_sidebar_link']/following::a[3]/preceding::a[1]")).sendKeys("dcdcececec");")).sendKeys("dcdcececec"); 
		}
		
		
		//following-sibling:: means only next elements in particular parent (method6)
		//preceding-sibling:: means only previous elements in particular parent (method7)
		
	
	

}
