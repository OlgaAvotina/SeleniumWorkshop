package pages.homepage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.signup.SignupPageObject;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class HomepagePageObject {

    private SelenideElement getMyAccountButton() {
        return $("#ACCOUNT");
    }

    private SelenideElement getSignUpButton() {
        return $("a[href='https://phptravels.net/signup']");
    }

    private SelenideElement getLogo() {
        return $(".logo");
    }

    private SelenideElement getLoadingIndicator() {
        return $("#preloader");
    }

    public boolean isLogoVisible() {
        return getLogo().isDisplayed();
    }

    public void waitUntilPageLoadingIsFinished() {
        getLoadingIndicator().shouldNotBe(Condition.visible, Duration.ofMillis(5000));
    }

    public boolean isMyAccountButtonVisible () {
        return getMyAccountButton().isDisplayed();
    }

    public void selectMyAccountButton(){
        getMyAccountButton().click();
    }

    public SignupPageObject selectSignUpButton() {
        getSignUpButton().click();
        return page(SignupPageObject.class);
    }
}
