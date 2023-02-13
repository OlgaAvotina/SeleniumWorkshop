package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class Hooks {
    @Before
    public void launchBrowser(){
        System.setProperty("selenide.browser", CHROME);
    }

    @Before
    public void openHomePage() {
        open("https://www.phptravels.net/");
    }

    @After
    public void closeBrowser(){
        closeWebDriver();
    }
}
