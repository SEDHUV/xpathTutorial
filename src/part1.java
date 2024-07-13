import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class part1 {
	
	static WebDriver driver;
	static ChromeOptions options;

	
//		xml and html -> standard generalized  markup language
//		so we can xml to fetch html elements
// in xml we are writing our own tags , if it has the capability to find user defined tags e.g :<student/> then it will have the capacity to find html also like <div>
	// absolute xpath start from root node and it has (/) slash and relative xpath start from current node (//)
		
		//1.Locating elements with known attribute
	@Test(enabled=false)
		public void knownattribute() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SEDHU\\eclipse-workspace\\newbrowser\\drivers\\chromedriver.exe");
	      ChromeOptions options = new ChromeOptions();
	      options.setBinary("C:\\Users\\SEDHU\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
	     driver = new ChromeDriver(options);
	      driver.get("https://www.saucedemo.com/");
	 driver.findElements(By.xpath("//*[@class='input_error form_input']")).get(1).sendKeys("sedhu");
	String attvalue =  driver.findElements(By.xpath("//*[@class='input_error form_input']")).get(0).getAttribute("id");
	System.out.println(attvalue);
	driver.close();
		}
	//2.Locating elements with known attribute and known element
	@Test(enabled=false)
	public void method2() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SEDHU\\eclipse-workspace\\newbrowser\\drivers\\chromedriver.exe");
    options = new ChromeOptions();
    options.setBinary("C:\\Users\\SEDHU\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
   driver = new ChromeDriver(options);
    driver.get("https://www.saucedemo.com/");
driver.findElement(By.xpath("//input[@class='input_error form_input']")).sendKeys("sedhu");
	}
	
	//exact match 
	@Test(enabled = false)
	public void method3() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SEDHU\\eclipse-workspace\\newbrowser\\drivers\\chromedriver.exe");
	    options = new ChromeOptions();
	    options.setBinary("C:\\Users\\SEDHU\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
	   driver = new ChromeDriver(options);
	    driver.get("https://www.lambdatest.com/blog/using-link-text-and-partial-link-text-in-selenium/");
	    driver.findElement(By.xpath("//a[text()='Selenium Locators Tutorial']")).click();
		
		}
	//partial match
	@Test(enabled = false)
public void method4() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SEDHU\\eclipse-workspace\\newbrowser\\drivers\\chromedriver.exe");
	    options = new ChromeOptions();
	    options.setBinary("C:\\Users\\SEDHU\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
	   driver = new ChromeDriver(options);
	    driver.get("https://selectorshub.com/xpath-practice-page/");
	    driver.findElement(By.xpath("//*[contains(text(),' SelectorsHub Youtube')]")).click();
		
		}
	//multiple attributes in single xpath
	@Test(enabled = false)
	public void method5() {
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SEDHU\\eclipse-workspace\\newbrowser\\drivers\\chromedriver.exe");
	    options = new ChromeOptions();
	    options.setBinary("C:\\Users\\SEDHU\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
	   driver = new ChromeDriver(options);
	    driver.get("https://www.saucedemo.com/");
	driver.findElement(By.xpath("//*[@type=\"submit\"][@class=\"submit-button btn_action\"]")).click();
			}
	
	//starts with method for tagvalues(element) and also attributes
	@Test(enabled = true)
	public void method6() {
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SEDHU\\eclipse-workspace\\newbrowser\\drivers\\chromedriver.exe");
	    options = new ChromeOptions();
	    options.setBinary("C:\\Users\\SEDHU\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
	   driver = new ChromeDriver(options);
	    driver.get("https://demo.automationtesting.in/Register.html");
	//driver.findElement(By.xpath("//*[starts-with(text(),'Home')]")).click();// using to find any text with start with
	driver.findElement(By.xpath("//a[starts-with(@href,'Index')]")).click();//using to find attribute value start with
	
			}
		
	
	
	
}
