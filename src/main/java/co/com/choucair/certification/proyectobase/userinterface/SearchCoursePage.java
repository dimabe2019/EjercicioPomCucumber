package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Selecciona Universidad Choucair").located(By.xpath("//div[@id='universidad']//strong"));
    ////strong[contains(text(),'Universidad ')]
    public static final Target INPUT_COURSE = Target.the("Campo para ingresar el curso").located(By.id("coursesearchbox"));
    public static final Target BUTTON_IR = Target.the("Dar click para buscar curso").locatedBy("//button[contains(text(),'Ir')]");
    public static final Target SELECT_COURSE = Target.the("Seleccionar curso").located(By.linkText("Cucumber - SerenityBDD + Screenplay (WEB)"));
    public static final Target NAME_COURSE = Target.the("Extraer nombre del curso").locatedBy("//h1[contains(text(),'Cucumber - SerenityBDD + Screenplay (WEB)')]");
    //a[contains(text(),'Cucumber - SerenityBDD + Screenplay (WEB)')]//ancestor::li[@class='breadcrumb-item']
}
