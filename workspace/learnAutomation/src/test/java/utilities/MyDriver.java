package utilities;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
///import config.Configuration;

public class MyDriver implements WebDriver {
	public static WebDriver driver;

	public MyDriver() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Roland\\workspace\\chromedriver_win32");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public void close() {
		driver.close();
	}

	public void quit() {
		driver.quit();
	}

	public WebElement findElement(By arg0) {
		// TODO Auto-generated method stub
		return driver.findElement(arg0);
	}

	public List<WebElement> findElements(By arg0) {
		// TODO Auto-generated method stub
		return driver.findElements(arg0);
	}

	public void get(String arg0) {
		// TODO Auto-generated method stub

	}

	public String getCurrentUrl() {
		// TODO Auto-generated method stub
		return driver.getCurrentUrl();
	}

	public String getPageSource() {
		// TODO Auto-generated method stub
		return driver.getPageSource();
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}

	public String getWindowHandle() {
		// TODO Auto-generated method stub
		return driver.getWindowHandle();
	}

	public Set<String> getWindowHandles() {
		// TODO Auto-generated method stub
		return driver.getWindowHandles();
	}

	public Options manage() {
		// TODO Auto-generated method stub
		return driver.manage();
	}

	public Navigation navigate() {
		// TODO Auto-generated method stub
		return driver.navigate();
	}

	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return driver.switchTo();
	}

}
