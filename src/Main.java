
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;

public class Main {
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver", "./chromedriver");
		if(args[0].equals("-f")){
			WebDriver driver = new FirefoxDriver();    //Firefoxをフック
			driver.get(args[1]); //ページ遷移

			//driver.close(); //Firefoxを閉じる
		} else{
			WebDriver driver = new ChromeDriver();    //Firefoxをフック
			driver.get(args[1]); //ページ遷移

			//driver.close(); //Firefoxを閉じる
			
		}
		
		System.exit(0);
	}
}
