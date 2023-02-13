package stepdefinitions;

import general.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import static org.assertj.core.api.Assertions.assertThat;

public class HomepageSteps {
    private TestContext test;
    public HomepageSteps(TestContext testContext){
        this.test = testContext;
    }
    @Given("I have opened homepage")
    public void iHaveOpenedHomepage() {
        test.getHomepage().waitUntilPageLoadingIsFinished();
        assertThat(test.getHomepage().isLogoVisible()).isTrue();
        assertThat(test.getHomepage().isMyAccountButtonVisible()).isTrue();
    }

    @When("I select My account menu")
    public void iSelectMyAccountMenu() {
        test.getHomepage().selectMyAccountButton();
    }

    @And("I select Sign up button")
    public void iSelectSignUpButton() {
        test.getHomepage().selectSignUpButton();
    }
}
