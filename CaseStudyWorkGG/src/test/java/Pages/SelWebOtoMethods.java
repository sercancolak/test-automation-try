package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.net.MalformedURLException;

public class SelWebOtoMethods extends BasePage {

    @FindBy(how = How.XPATH, xpath = "//*[@id=\"form-item-list\"]/ul/li/div/div[1]/h4/a")
    private WebElement TEST;

    public SelWebOtoMethods() throws MalformedURLException {
    }

    public void goOnGG() throws InterruptedException {
        Thread.sleep(5000);
        goToUrl(Url);
    }
}
