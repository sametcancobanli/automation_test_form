import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Translate extends BaseTest {

    @Test
    public void set_text_1() throws InterruptedException {
        Translate translate = new Translate(driver);
        translate.set_text_1("kalem");
        Assertions.assertEquals("kalem", translate.get_text_1(), "Name value is not correct!");
        Thread.sleep(5000);
    }

    //@Test
    //public void set_text_switch(){
    //    Translate translate = new Translate(driver);
    //    translate.set_text_switch();
    //}

    @Test
    public void set_text_2(){
        Translate translate = new Translate(driver);
        String result = translate.get_text_1();
        System.out.print("Value is: " +result);
    }
}