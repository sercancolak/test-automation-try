package Pages;

import org.openqa.selenium.WebDriver;

public class BasePage extends BaseMethods{

    public final WebDriver driver;
    protected static String Url = "https://www.gittigidiyor.com";

    public BasePage(){

        this.driver = PageFactory.driver;
    }
}
