package testsuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserinvocation {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
        driver.get("http://www.qaclickacademy.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        driver.close();
        
	}

}