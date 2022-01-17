package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.fluentlenium.core.search.Search;
import questions.Answer;
import tasks.Login;
import tasks.OpenUp;
import tasks.SearchP;

public class ChoucairAcademyStepDefintions
{
    @Before
    public void setStage()
    {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than MainActor wants to learn automation at the academy Ch$")
    public void thanMainActorWantsToLearnAutomationAtTheAcademyCh()
    {
        OnStage.theActorCalled("MainActor").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
    }

    @When("^he searches for the course (.*) on the choucair academy platform$")
    public void heSearchesForTheCourseRecursosAutomatizacionBancoOnTheChoucairAcademyPlatform(String course)//
    {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchP.the(course));
    }

    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesAutomatizacióndePruebas(String question) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
