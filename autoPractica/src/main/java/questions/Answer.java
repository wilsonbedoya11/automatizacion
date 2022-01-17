package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.SearchCoursePage;

public class Answer implements Question<Boolean>
{
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question)
    {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result= false;
        System.out.println(question);
        String nameCourse = Text.of(SearchCoursePage.NAME_COURSE).viewedBy(actor).asString();
        if(question.equals(nameCourse))
        {
            result= true;
        }
        System.out.println(nameCourse);
        return  result;
    }
}
