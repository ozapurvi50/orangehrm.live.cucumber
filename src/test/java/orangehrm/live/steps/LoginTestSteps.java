package orangehrm.live.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import orangehrm.live.pages.DashBoardPage;
import orangehrm.live.pages.HomePage;
import orangehrm.live.pages.LoginPage;
import org.junit.Assert;
public class LoginTestSteps {

    @Then("^I see Welcome message$")
    public void iSeeWelcomeMessage() {
        Assert.assertEquals("Not displayed:", "Dashboard", new LoginPage().verifyLogin());
    }

    @Then("^I see the Orange HRM Logo$")
    public void iSeeTheOrangeHRMLogo() {
        Assert.assertEquals("Not Displayed", "", new DashBoardPage().verifyOrangeLogo());
    }

    @When("^I click on user profile logo$")
    public void iClickOnUserProfileLogo() throws InterruptedException {
        new HomePage().userProfileLogoClick();
    }

    @And("^I mouse hover and click on logout$")
    public void iMouseHoverAndClickOnLogout() throws InterruptedException {
        new HomePage().MouseHoverLogo();
    }

    @Then("^I am logged out and see text Login Panel$")
    public void iAmLoggedOutAndSeeTextLoginPanel() {
        Assert.assertEquals("Not Displayed.", "Login", new LoginPage().getVerifyLogin());
    }
}
