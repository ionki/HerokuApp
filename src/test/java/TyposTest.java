import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class TyposTest extends BaseTest{
    @Test
    public void Spelling(){
        driver.get("http://the-internet.herokuapp.com/typos");
        String elementVal = driver.findElements(By.tagName("p")).get(1).getText();
        assertEquals(elementVal,"Sometimes you'll see a typo, other times you won't.","isn't true" );
    }
}
