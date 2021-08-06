package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.interactions.Esperar;
import co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class Search implements Task {

    private String strCourse;

    public Search(String strCourse) {
        this.strCourse = strCourse;
    }

    public static Search the(String strCourse) {
        return Tasks.instrumented(Search.class,strCourse);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
     actor.attemptsTo(
             Click.on(SearchCoursePage.BUTTON_UC),
             Enter.theValue(strCourse).into(SearchCoursePage.INPUT_COURSE),
             Click.on(SearchCoursePage.BUTTON_IR),
             Click.on(SearchCoursePage.SELECT_COURSE)
     );
    }
}
