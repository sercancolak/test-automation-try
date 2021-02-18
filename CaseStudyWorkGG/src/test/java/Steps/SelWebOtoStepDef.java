package Steps;

import Pages.BaseMethods;
import Pages.PageFactory;
import io.cucumber.java.en.Given;

import java.net.MalformedURLException;

public class SelWebOtoStepDef extends PageFactory {

    public SelWebOtoStepDef() throws MalformedURLException {
    }

    @Given("www.gittigidiyor.com sitesi acilir")
    public void goOnGG() throws InterruptedException {
        methods.goOnGG();
    }
}
