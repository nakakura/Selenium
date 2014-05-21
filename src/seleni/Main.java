package seleni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.CapabilityType;

public class Main {
	public static void main(String args[]){
		if(args.length == 0){
			WebDriver driver = new FirefoxDriver();    //Firefoxをフック
			driver.get("https://www.google.co.jp"); //ページ遷移
		}
		else if(args[0].equals("-f")){
			WebDriver driver = new FirefoxDriver();    //Firefoxをフック
			driver.get(args[1]); //ページ遷移
			//driver.close(); //Firefoxを閉じる
		} else{
			System.out.println(args[1]);
			System.setProperty("webdriver.chrome.driver", "./chromedriver");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);  
			WebDriver driver = new ChromeDriver(capabilities);
			driver.get(args[1]); //ページ遷移

			//driver.close(); //Firefoxを閉じる
			
		}
		
		System.exit(0);
	}
}
