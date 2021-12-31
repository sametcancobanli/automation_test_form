import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Setting_Name_Lastname_Email extends BaseTest {

    @Test
    public void setName(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setName("Samet");
        Assertions.assertEquals("Samet", practiceFormPage.getName(), "Name value is not correct!");
    }

    @Test
    public void setLastName(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setLastName("Çoban");
        Assertions.assertEquals("Çoban", practiceFormPage.getLastName(), "Last name value is not correct!");
    }

    @Test
    public void setEmail(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setEmail("sametcancobanliyt@gmail.com");
        Assertions.assertEquals("sametcancobanliyt@gmail.com", practiceFormPage.getEmail(), "Email value is not correct!");
    }
}
