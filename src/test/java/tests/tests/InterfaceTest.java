package tests.tests;



import org.testng.Assert;
import org.testng.annotations.Test;
import tests.Main;
import tests.pages.CalculatorPage;

/**
 * Created by yuriyryndin on 10.04.2020
 */
public class InterfaceTest extends Main {

        @Test
        public static void buttonsValuesTest () {
            String buttonOne = CalculatorPage.BUTTON_ONE.getText();
            Assert.assertEquals(buttonOne, "1");
            String buttonTwo = CalculatorPage.BUTTON_TWO.getText();
            Assert.assertEquals(buttonTwo, "2");
            String buttonThree = CalculatorPage.BUTTON_THREE.getText();
            Assert.assertEquals(buttonThree, "3");
            String buttonFour = CalculatorPage.BUTTON_FOUR.getText();
            Assert.assertEquals(buttonFour, "4");
            String buttonFive  = CalculatorPage.BUTTON_FIVE.getText();
            Assert.assertEquals(buttonFive, "5");
            String buttonSix = CalculatorPage.BUTTON_SIX.getText();
            Assert.assertEquals(buttonSix, "6");
            String buttonSeven = CalculatorPage.BUTTON_SEVEN.getText();
            Assert.assertEquals(buttonSeven, "7");
            String buttonEight = CalculatorPage.BUTTON_EIGHT.getText();
            Assert.assertEquals(buttonEight, "8");
            String buttonNine = CalculatorPage.BUTTON_NINE.getText();
            Assert.assertEquals(buttonNine, "9");
            String buttonZero = CalculatorPage.BUTTON_ZERO.getText();
            Assert.assertEquals(buttonZero, "0");
            String buttonPoint = CalculatorPage.BUTTON_POINT.getText();
            Assert.assertEquals(buttonPoint, ".");
        }
}
