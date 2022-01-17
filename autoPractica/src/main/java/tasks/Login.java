package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.ChoucairLoginPage;

public class Login implements Task
{

    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Click.on(ChoucairLoginPage.START_BUTTON),
        Enter.theValue("wbedoya").into(ChoucairLoginPage.INPUT_USER),
        Enter.theValue("Octubre2021*0611").into(ChoucairLoginPage.INPUT_PASS),
        Click.on(ChoucairLoginPage.ENTER_BUTTON)
        );
    }
}
