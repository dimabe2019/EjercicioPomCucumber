package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.interactions.Esperar;
import co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private String strCourse;

    public Answer(String strCourse) {
        this.strCourse = strCourse;
    }

    public static Answer toThe(String strCourse) {
        return new Answer(strCourse);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse = Text.of(SearchCoursePage.NAME_COURSE).viewedBy(actor).asString();

        if (strCourse.equals(nameCourse)) {
            result = true;

        } else {
            result = false;
        }
        return result;
    }
}
