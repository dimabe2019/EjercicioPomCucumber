package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("Boton para iniciar sesion").locatedBy("//div[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar')]");
    ////strong[contains(text(),'Ingresar')]//ancestor::div[@class='d-none d-lg-block']
    public static final Target INPUT_USER = Target.the("Campo para ingresar usuario").located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("Campo para ingresar la contraseña").located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the("Boton de accder").locatedBy("//button[contains(text(),'Acceder')]");
}
