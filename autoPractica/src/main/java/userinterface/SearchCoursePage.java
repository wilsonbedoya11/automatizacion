package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject
{
    public static final Target lINK_UNIVERSITY = Target.the("Enter button").located(By.xpath("//div[@id='universidad']//strong"));
    public static final Target CHECKBOX_SEARCH_COURSE = Target.the("Enter button").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Enter button").located(By.xpath("//button[contains(text(),'Ir')]"));
    public static final Target SELECT_COURSE = Target.the("Enter button").located(By.linkText("Automatización de Pruebas"));

    public static final Target NAME_COURSE = Target.the("Enter button").located(By.xpath("//h1[contains(text(),'Automatización de Pruebas')]"));


}
