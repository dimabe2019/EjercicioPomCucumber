package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.ChoucairData;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^the diego wants to learn automation at the academy Choucair$")
    public void theDiegoWantsToLearnAutomationAtTheAcademyChoucair(List<ChoucairData> choucairData) {
      OnStage.theActorCalled("Diego").wasAbleTo(OpenUp.thePage(), (Login.onThePage(choucairData.get(0).getStrUser(),choucairData.get(0).getStrPassword())));
    }


    @When("^he search for the course Cucumber - SerenityBDD \\+ Screenplay \\(WEB\\) on the choucair academy platform$")
    public void heSearchForTheCourseCucumberSerenityBDDScreenplayWebOnTheChoucairAcademyPlatform(List<ChoucairData> choucairData) {
      OnStage.theActorInTheSpotlight().attemptsTo(Search.the(choucairData.get(0).getStrCourse()));
    }

    @Then("^he finds the course called resources Cucumber - SerenityBDD \\+ Screenplay \\(WEB\\)$")
    public void heFindsTheCourseCalledResourcesCucumberSerenityBDDScreenplayWeb(List<ChoucairData> choucairData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(choucairData.get(0).getStrCourse())));

    }
}
