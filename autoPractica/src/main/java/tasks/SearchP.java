package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.SearchCoursePage;

public class SearchP implements Task {

    private String course;

    public SearchP(String course) {
        this.course = course;
    }

    public static SearchP the(String course)
    {
        return Tasks.instrumented(SearchP.class, course);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Click.on(SearchCoursePage.lINK_UNIVERSITY),
                Enter.theValue(course).into(SearchCoursePage.CHECKBOX_SEARCH_COURSE),
                Click.on(SearchCoursePage.BUTTON_GO),
                Click.on(SearchCoursePage.SELECT_COURSE));
    }
}
