package appiumTests;



import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by yuriyryndin on 10.04.2020
 */
public class interfaceTest extends Main {

        @Test
        public static void buttonsValuesTest () {
            String buttonOne = driver.findElementById("com.android.calculator2:id/digit_1").getText();
            Assert.assertEquals(buttonOne, "1");
            String buttonTwo = driver.findElementById("com.android.calculator2:id/digit_2").getText();
            Assert.assertEquals(buttonTwo, "2");
            String buttonThree = driver.findElementById("com.android.calculator2:id/digit_3").getText();
            Assert.assertEquals(buttonThree, "3");
            String buttonFour = driver.findElementById("com.android.calculator2:id/digit_4").getText();
            Assert.assertEquals(buttonFour, "4");
            String buttonFive  = driver.findElementById("com.android.calculator2:id/digit_5").getText();
            Assert.assertEquals(buttonFive, "5");
            String buttonSix = driver.findElementById("com.android.calculator2:id/digit_6").getText();
            Assert.assertEquals(buttonSix, "6");
            String buttonSeven = driver.findElementById("com.android.calculator2:id/digit_7").getText();
            Assert.assertEquals(buttonSeven, "7");
            String buttonEight = driver.findElementById("com.android.calculator2:id/digit_8").getText();
            Assert.assertEquals(buttonEight, "8");
            String buttonNine = driver.findElementById("com.android.calculator2:id/digit_9").getText();
            Assert.assertEquals(buttonNine, "9");
            String buttonZero = driver.findElementById("com.android.calculator2:id/digit_0").getText();
            Assert.assertEquals(buttonZero, "0");
            String buttonPoint = driver.findElementById("com.android.calculator2:id/dec_point").getText();
            Assert.assertEquals(buttonPoint, ".");
        }
}
