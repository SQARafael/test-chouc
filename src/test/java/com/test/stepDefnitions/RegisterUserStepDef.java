package com.test.stepDefnitions;

import com.test.interactions.OpenBrowser;
import io.cucumber.java.en.*;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class RegisterUserStepDef {
    @Given("user open the url demoPage.com")
    public void userOpenTheUrlDemoPageCom() {
        theActorCalled("user")
                .attemptsTo(
                        OpenBrowser.cargarNavegador()
                );


    }
    @When("user send the credentials username {string} and password {string}")
    public void userSendTheCredentialsUsernameAndPassword(String string, String string2) {

    }
    @When("user user click on button PIM and check button create login details")
    public void userUserClickOnButtonPIMAndCheckButtonCreateLoginDetails() {

    }
    @When("send data on fills and click on button save")
    public void sendDataOnFillsAndClickOnButtonSave() {

    }
    @Then("user can see the username on display")
    public void userCanSeeTheUsernameOnDisplay() {

    }
}
