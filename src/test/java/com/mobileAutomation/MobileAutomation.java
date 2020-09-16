package com.mobileAutomation;
//package com.appium.practice.Appium;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.mobile.NetworkConnection.ConnectionType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.connection.ConnectionState;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class MobileAutomation {

	//public static void main(String[] args) throws MalformedURLException, InterruptedException {
	static AndroidDriver<WebElement> driver;
	@Test(priority=1)
		public void launchApp() throws IOException {
		
		// TODO Auto-generated method stub
		
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "ZF6223D8QM");
		//caps.setCapability(MobileCapabilityType.DEVICE_NAME, "A68FA8E0");
		
		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "subathrainfotech.healthcare");
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "subathrainfotech.healthcare.MainActivity");
		
		 
		// To invoke chrome browser
		//caps.setCapability(AndroidMobileCapabilityType.BROWSER_NAME,"Chrome");
		//caps.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "c:\\Selenium\\chromedriver.exe");
		
		/*
		//caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		//caps.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "D:\\Webdrivers\\chromedriver.exe");
		*/
		
		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get("http://www.google.com");
	/*	TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshots/LaunchApp.png"));
		*/
		//driver.toggleWifi();
	}
//	@Test(priority=2,enabled=false)
	@Test(priority=2)
     public void saveData() throws IOException, InterruptedException {
		

		driver.findElement(By.id("subathrainfotech.healthcare:id/Enter_button")).click();
		driver.navigate().back();
		driver.findElement(By.id("subathrainfotech.healthcare:id/Date")).sendKeys("31/05/2020");
		driver.findElement(By.id("subathrainfotech.healthcare:id/Name")).sendKeys("TestUser");
		driver.findElement(By.id("subathrainfotech.healthcare:id/Height")).sendKeys("72");
		driver.findElement(By.id("subathrainfotech.healthcare:id/Weight")).sendKeys("45");
		driver.findElement(By.id("subathrainfotech.healthcare:id/BPLow")).sendKeys("70");
		driver.findElement(By.id("subathrainfotech.healthcare:id/BPHigh")).sendKeys("240");
		driver.findElement(By.id("subathrainfotech.healthcare:id/DoctorName")).sendKeys("Dr.Raja");
		driver.findElement(By.id("subathrainfotech.healthcare:id/Diagnosis")).sendKeys("Fever");
		driver.findElement(By.id("subathrainfotech.healthcare:id/Medicine01")).sendKeys("Paracetamol");
		driver.findElement(By.id("subathrainfotech.healthcare:id/Medicine02")).sendKeys("Crocin");
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshots/Datafeed.png"));
		//verticalSwipeByPercentages(driver, 0.3, 0.7);
		Thread.sleep(2000);
		
		/*
		MobileElement element = (MobileElement) driver.findElement(By.id("subathrainfotech.healthcare:id/Diagnosis"));
		//WebElement element = driver.findElement(By.id("subathrainfotech.healthcare:id/Medicine03"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		Thread.sleep(5000);
*/
		//driver = new ChromeDriver();
       // JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1000)");
       // js.executeScript("arguments[0].scrollIntoView();",Element);
		//ByPixel();
		
		driver.findElement(By.id("subathrainfotech.healthcare:id/Medicine03")).sendKeys("Fepanil");
		driver.findElement(By.id("subathrainfotech.healthcare:id/Medicine04")).sendKeys("Oxalgin");
		driver.findElement(By.id("subathrainfotech.healthcare:id/Medicine05")).sendKeys("Crocin Syrup");
		driver.findElement(By.id("subathrainfotech.healthcare:id/Comments")).sendKeys("Next visit after 2 days");
		driver.findElement(By.id("subathrainfotech.healthcare:id/Save_button")).click();
		
		
		//driver.
		//driver.findElement(By.id("subathrainfotech.healthcare:id/Save_button")).click();
		TakesScreenshot ts1 = (TakesScreenshot)driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source1, new File("./Screenshots/SaveData.png"));
		
		/*
		driver.findElement(By.id("subathrainfotech.healthcare:id/Home_button")).click();
		TakesScreenshot ts2 = (TakesScreenshot)driver;
		File source2 = ts2.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source2, new File("./Screenshots/Home.png"));
		
		driver.findElement(By.id("subathrainfotech.healthcare:id/Prescription_button")).click();
		driver.findElement(By.id("subathrainfotech.healthcare:id/Read_button_Display")).click();
		driver.findElement(By.id("subathrainfotech.healthcare:id/Home_button_Display")).click();
		*/
		//driver.closeApp();
		
		/*
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setCapability("fullReset", false); 
		caps.setCapability("noReset", true);
*/		
		
		/*
		 driver.setConnection(new ConnectionState(ConnectionState.AIRPLANE_MODE_MASK));
		 
;		driver.toggleAirplaneMode();
		
		Thread.sleep(6000);
		
		driver.toggleData();
		Thread.sleep(6000);
		
		driver.toggleWifi();
		Thread.sleep(6000);
		
		driver.toggleLocationServices();
		*/
		/*driver.findElement(By.xpath("//android.widget.TextView[@text='Alarm']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.google.android.deskclock:id/fab"))).isDisplayed();
		driver.findElement(By.id("com.google.android.deskclock:id/fab")).click();
		
		driver.findElementByAccessibilityId("subathrainfotech.healthcare:id/Prescription_button").click();
		
		driver.findElementByAccessibilityId("45").click();
				
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
		
		String vibrate=driver.findElement(By.id("com.google.android.deskclock:id/vibrate_onoff")).getAttribute("checked");
		System.out.println("Vibrate: "+vibrate);

		
		driver.findElement(By.id("com.google.android.deskclock:id/delete")).click();
*/	}
//	private void verticalSwipeByPercentages(AndroidDriver<WebElement> driver2, double d, double e) {
		// TODO Auto-generated method stub
		
	//}
	
	@Test(priority=3)
	public void CloseApp() throws IOException {
		driver.closeApp();
		
	}
	
	
	@Test(priority=4)
	public void launchBrowser() throws IOException {
	
	// TODO Auto-generated method stub
	
	DesiredCapabilities caps= new DesiredCapabilities();
	caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	caps.setCapability(MobileCapabilityType.DEVICE_NAME, "ZF6223D8QM");
	//caps.setCapability(MobileCapabilityType.DEVICE_NAME, "A68FA8E0");
	//caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.star.customer_app");
	//caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.star.customer_app.MainActivity");
	//caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
	caps.setCapability(AndroidMobileCapabilityType.BROWSER_NAME,"Chrome");
	caps.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "c:\\Selenium\\chromedriver.exe");
	
	//caps.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "D:\\Webdrivers\\chromedriver.exe");
	
	
	driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://www.google.com");
	TakesScreenshot ts3 = (TakesScreenshot)driver;
	File source = ts3.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File("./Screenshots/LaunchApp1.png"));
	//driver.toggleWifi();
}
	/*
	@Test
    public void ByPixel() {
        
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Launch the application		
     
        // This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,1000)");
    }
*/
	
	public static void verticalSwipeByPercentages(AndroidDriver driver,double startPercentage, double endPercentage) {
        Dimension size = driver.manage().window().getSize();
        int x = (int) (size.width)/2;
        int y_startPoint = (int) (size.height * startPercentage);
        int y_endPoint = (int) (size.height * endPercentage);
 
        		TouchAction touchAction=new TouchAction(driver);
                touchAction.press(PointOption.point(x, y_startPoint))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(x, y_endPoint))
                .release().perform();
    }
}




