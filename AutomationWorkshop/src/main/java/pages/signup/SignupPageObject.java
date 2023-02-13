package pages.signup;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class SignupPageObject {
    private SelenideElement getFirstNameField() {
        return $("input[name='first_name']");
    }

    private SelenideElement getLastNameField() {
        return $("input[name='last_name']");
    }

    private SelenideElement getMobileNumberField() {
        return $("input[name='phone']");
    }

    private SelenideElement getEmailField() {
        return $("input[name='email']");
    }

    private SelenideElement getPasswordField() {
        return $("input[name='password']");
    }

    private SelenideElement getSignUpButton() {
        return $("#button");
    }

    private SelenideElement getLoadingIndicator() {
        return $("#preloader");
    }

    public void waitUntilPageLoadingIsFinished() {
        getLoadingIndicator().shouldNotBe(Condition.visible, Duration.ofMillis(5000));
    }

    public void enterFirstName(String firstname){
        getFirstNameField().sendKeys(firstname);
    }

    public void enterLastName(String lastname){
        getLastNameField().sendKeys(lastname);
    }

    public void enterMobileNumber(String number){
        getMobileNumberField().sendKeys(number);
    }

    public void enterEmail(String email){
        getEmailField().sendKeys(email);
    }

    public void enterPassword(String password){
        getPasswordField().sendKeys(password);
    }

}
