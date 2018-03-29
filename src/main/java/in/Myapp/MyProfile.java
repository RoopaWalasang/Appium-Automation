package in.Myapp;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class MyProfile
{

	
	public static String apkPath="D:\\Work\\Myapp\\Myapp\\app\\ort-licious-3216-217.apk";
	public static AndroidDriver driver;
	public static void main(String[] args)
	{

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
        
	    driver.findElement(By.className("android.widget.ImageButton")).click();
	    driver.findElement(By.xpath("//class[contains(text(),'My Account')]")).click();
	    WebElement name=driver.findElement(By.id("com.licious:id/tvName"));
	    WebElement email =driver.findElement(By.id("com.licious:id/tvEmail"));
        WebElement phone = driver.findElement(By.id("com.licious:id/tvMobile"));
        WebElement order= driver.findElement(By.className("android.widget.RelativeLayout"));
        WebElement liciouscash = driver.findElement(By.id("com.licious:id/tvLicousCash"));
        WebElement liciouscashp = driver.findElement(By.id("com.licious:id/tvLicousCashPlus"));
        
        
	    System.out.println(name);
	    System.out.println(email);
	    System.out.println(phone);
	    System.out.println("No. Of Orders Places" + "order");
	    System.out.println("Licious cash Balance is "+ liciouscash);
	    System.out.println("licious cash Plus balance is " + liciouscashp);
	    
	    
	}

}
