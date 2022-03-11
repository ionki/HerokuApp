import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class InputsTest extends BaseTest{

    @Test
    public void InputsArrowUp(){
        driver.get("http://the-internet.herokuapp.com/inputs");
        driver.findElement(By.tagName("input")).sendKeys("3");
        String elementVal = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(elementVal,"3","isn't correct");

        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_DOWN);
        elementVal = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(elementVal,"2","isn't correct");

        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_UP);
        elementVal = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(elementVal,"3","isn't correct");

        driver.findElement(By.tagName("input")).clear();
        driver.findElement(By.tagName("input")).sendKeys("h");
        elementVal = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(elementVal,"h","isn't correct");
    }

}
