package in.Myapp;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.annotations.Test;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class App
{
	public static String apkPath="D:\\Work\\Myapp\\Myapp\\app\\ort-licious-3216-217.apk";
	static WebDriver driver;
    
	public static void main(String[] args) throws Exception 
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "6.0");
		cap.setCapability("deviceName","T03850AX3R");
		cap.setCapability("app", apkPath);
    	cap.setCapability("appPackage", "com.licious");
	    // cap.setCapability("appActivity", "com.licious.intro.activity.SplashActivity");
		cap.setCapability("noReset", true);
		//cap.setCapability("fullReset", true);
		//cap.setCapability("browserName", "Chrome");
		//Instantiate Appium Driver
		try {
			driver=new AndroidDriver(new  URL("http://127.0.0.1:4723/wd/hub"),cap);
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   

	    // using swipe method
	  /*  public void rightLeftSwipe(int timeduration) {

	    	  size = driver.manage().window().getSize();
	    	  System.out.println(size);
	    	  startx = (int) (size.width * 0.70);
	    	  endx = (int) (size.width * 0.30);
	    	  starty = size.height / 2;
	    	  System.out.println("Start swipe operation");
	    	  driver.swipe(startx, starty, endx, starty, timeduration);

	    	 } */
  	    
	    
	  //  while ( driver.findElement(MobileBy.xpath("//*[@class='android.widget.Button'][1]")) != null)
	    //	{//
	        	//driver.findElement(MobileBy.xpath("//*[@class='android.widget.Button'][1]")).click();
	    	//}*/
	 
     //   driver.findElementByAndroidUIAutomator
       // ("new UiSelector().resourceId(\"com.licious:id/etEmail\")").sendKeys("roopa@licious.in");
	    driver.findElement(By.id("etEmail")).sendKeys("roopa@licious.in");
	    driver.findElement(By.id("etPassword")).sendKeys("licious");
	    driver.findElement(By.id("tvLogin")).click();
	     
	}
 	
	}
    


  
	