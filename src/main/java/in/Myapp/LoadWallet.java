package in.Myapp;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class LoadWallet 
{	
	
	public static String apkPath="D:\\Work\\Myapp\\Myapp\\app\\ort-licious-3216-217.apk";
    public static AndroidDriver driver;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "6.0");
		cap.setCapability("deviceName","T03850AX3R");
		cap.setCapability("app", apkPath);
    	cap.setCapability("appPackage", "com.licious");
	    // cap.setCapability("appActivity", "com.licious.intro.activity.SplashActivity");
		//cap.setCapability("noReset", false);
		//cap.setCapability("fullReset", true);
		//cap.setCapability("browserName", "Chrome");
		try {
			driver=new AndroidDriver(new  URL("http://127.0.0.1:4723/wd/hub"),cap);
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    
		//verify the header of the screen 
		
		WebElement header = driver.findElement(By.id("com.licious:id/tvToolbarTitle"));
		System.out.println(header);
		WebElement cash = driver.findElement(By.id("com.licious:id/tvLiciousCash"));
	    WebElement cashp = driver.findElement(By.id("com.licious:id/tvLiciousCash"));
	    System.out.println("Licious Wallet Balance is" + "cash" + "cashp");
	    driver.findElement(By.id("com.licious:id/tvUploadMoney")).click();
	    driver.findElement(By.id("com.licious:id/rbAmount100")).click();
	    
	    //driver.findElement(By.id("com.licious:id/etAddAmount")).sendKeys("100");
	    driver.findElement(By.id("com.licious:id/rdbNetBanking")).click();
	    driver.findElement(By.xpath("//class[contains(text(),'Axis Bank')]")).click();
	    driver.findElement(By.id("com.licious:id/tvSubmit")).submit();
	    driver.findElement(By.xpath("//class[contains(text(),'Success')]")).click();
	    //alert message 
	    
	    driver.findElement(By.id("com.licious:id/tvOK")).click();
	    
	    
	    
	}

}
