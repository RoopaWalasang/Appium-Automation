package in.Myapp;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Cart
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
	    
	    driver.findElement(By.className("android.widget.ImageView")).click();
	    driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
	    driver.findElement(By.xpath("//class[contains(text(),'Chicken')]")).click();
	    driver.findElement(By.xpath("//class[contains(text(),'ADD TO CART')]")).click();
	    driver.findElement(By.xpath("//class[contains(text(),'Checkout')]")).click();
	    
	    driver.findElement(By.xpath("//class[contains(text(),'Fish & Seafood')]")).click();
	    driver.findElement(By.id("com.licious:id/tvAddtoCart")).click();
	    driver.findElement(By.xpath("//class[contains(text(),'Checkout')]")).click();
	    
	    
	    // increase the quantity
        driver.findElement(By.id("com.licious:id/tvIncreaseQuantity")).click();

	    // decrease the quantity
	    driver.findElement(By.id("com.licious:id/tvReduceQuantity")).click();
	    
	    // delete the quantity 
	   // driver.findElement(By)
	   // Clear the cart
	   driver.findElement(By.id("com.licious:id/tvClearAll")).click();
	   //alert \
	   driver.findElement(By.id("com.licious:id/tvOK")).click();
	   //verify that cart is cleared and verify the text 
	   String clearcart = driver.findElement(By.id("com.licious:id/tvEmpty")).getText();
	   System.out.println(clearcart);
	   
	   driver.findElement(By.id("com.licious:id/tvContinueShopping")).click();

	   
	   
	}
	

}
