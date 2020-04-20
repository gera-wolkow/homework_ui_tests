package appiumTests;



import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by yuriyryndin on 10.04.2020
 */
public class interfaceTest extends Main {

        @Test
        public static void buttonsValuesTest () {
            String buttonOne = calculatorPage.buttonOne.getText();
            Assert.assertEquals(buttonOne, "1");
            String buttonTwo = calculatorPage.buttonTwo.getText();
            Assert.assertEquals(buttonTwo, "2");
            String buttonThree = calculatorPage.buttonThree.getText();
            Assert.assertEquals(buttonThree, "3");
            String buttonFour = calculatorPage.buttonFour.getText();
            Assert.assertEquals(buttonFour, "4");
            String buttonFive  = calculatorPage.buttonFive.getText();
            Assert.assertEquals(buttonFive, "5");
            String buttonSix = calculatorPage.buttonSix.getText();
            Assert.assertEquals(buttonSix, "6");
            String buttonSeven = calculatorPage.buttonSeven.getText();
            Assert.assertEquals(buttonSeven, "7");
            String buttonEight = calculatorPage.buttonEight.getText();
            Assert.assertEquals(buttonEight, "8");
            String buttonNine = calculatorPage.buttonNine.getText();
            Assert.assertEquals(buttonNine, "9");
            String buttonZero = calculatorPage.buttonZero.getText();
            Assert.assertEquals(buttonZero, "0");
            String buttonPoint = calculatorPage.buttonPoint.getText();
            Assert.assertEquals(buttonPoint, ".");
        }
}
