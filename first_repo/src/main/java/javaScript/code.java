package javaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.messages.types.Duration;

public class code
{

	public static void main(String[] args) throws InterruptedException
	{
		
		
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		d.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor)d;
	
js.executeScript("window.scrollTo(0,500)");
		Thread.sleep(3000);
//		js.executeScript("windows.scrollTo(0,500)");
//	Thread.sleep(3000);
//		js.executeAsyncScript("window.scrollBy(0,500)");
		//js.executeScript("document.getElementByid('tyfooter').scrollintoView()");
	}
	}
	


