package stepdefinitions;

import general.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.WebDriverRunner.url;
import static org.assertj.core.api.Assertions.assertThat;

public class SignupSteps {
    private TestContext test;
    public SignupSteps(TestContext testContext){
        this.test = testContext;
    }

    @And("I enter First name")
    public void iEnterFirstName() {
        test.getSignupPage().enterFirstName(test.getUsers().get(0).getFirstName());
    }

    @And("I enter Last name")
    public void iEnterLastName() {
        test.getSignupPage().enterLastName(test.getUsers().get(0).getLastName());
    }

    @And("I enter Mobile number")
    public void iEnterMobileNumber() {
        test.getSignupPage().enterMobileNumber(test.getUsers().get(0).getMobileNumber());
    }

    @And("I enter Email address")
    public void iEnterEmailAddress() {
        test.getSignupPage().enterEmail(test.getUsers().get(0).getEmailAddress());
    }

    @And("I enter Password")
    public void iEnterPassword() {
        test.getSignupPage().enterPassword(test.getUsers().get(0).getPassword());
    }

    @Then("user account page is opened")
    public void userAccountPageIsOpened() {
        System.out.println("ACCOUNT CREATED!");
    }

    @And("sign up page is opened")
    public void signUpPageIsOpened() {
        test.getSignupPage().waitUntilPageLoadingIsFinished();
        assertThat(url()).isEqualTo("https://phptravels.net/signup");
    }
}
