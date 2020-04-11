package appiumTests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by yuriyryndin on 11.04.2020
 */
public class functionalityTestNegative  extends Main {
    @Test
    public static void testingDividingByZero () throws InterruptedException {
        driver.findElementById("com.android.calculator2:id/digit_6").click();
        driver.findElementById("com.android.calculator2:id/op_div").click();
        driver.findElementById("com.android.calculator2:id/digit_0").click();
        driver.findElementById("com.android.calculator2:id/eq").click();
        Thread.sleep(1000);
        String screenAfter = driver.findElementById("com.android.calculator2:id/result").getText();
        Assert.assertEquals(screenAfter, "Can't divide by 0");
    }

    @Test
    public static void testingSeveralPoints () throws InterruptedException {
        int n = 0;
        driver.findElementById("com.android.calculator2:id/digit_5").click();
        while (n <20) {
            driver.findElementById("com.android.calculator2:id/dec_point").click();
            n++;
        }
        driver.findElementById("com.android.calculator2:id/digit_3").click();
        String screenFirstPart = driver.findElementById("com.android.calculator2:id/formula").getText();
        Assert.assertEquals(screenFirstPart, "5.3");
    }
}
