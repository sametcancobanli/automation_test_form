import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Translate extends BasePage {

    private final By text_1_locator = By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[3]/c-wiz[1]/span/span/div/textarea");
    //private final By text_switch_locator = By.xpath("//*[@id=\"ow23\"]/div/span/button/div[2]");

    public Translate(WebDriver driver){
        super(driver);
        driver.get(baseUrl_2.concat("?hl=tr&sl=tr&tl=en&op=translate"));
    }

    public void set_text_1(String text_1){
        type(text_1_locator, text_1);
    }

    //public void set_text_switch(){ click(text_switch_locator); }

    public String get_text_1(){
        return find(text_1_locator).getAttribute("value");
    }
}
