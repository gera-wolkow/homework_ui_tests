package appiumTests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.net.URL;

/**
 * Created by yuriyryndin on 10.04.2020
 */
public class Main {

    static  AppiumDriver <MobileElement> driver;

    @BeforeSuite
    public static void setupApplication () throws Exception {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "My Phone");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "9.0");

        cap.setCapability("appPackage", "com.android.calculator2");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver <MobileElement>(url, cap);

        System.out.println("Start ....");
    }

    @BeforeMethod
    public static void clearData () {
        TouchAction touch = new TouchAction(driver);
        touch.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(driver.findElementById("com.android.calculator2:id/pad_operator").findElementsByClassName("android.widget.Button").get(0)))).release().perform();
    }

    @AfterSuite
    public static void closeDriver () {
        driver.quit();
    }
}
