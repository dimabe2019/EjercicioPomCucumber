package co.com.choucair.certification.proyectobase.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.awaitility.Awaitility;
import static co.com.choucair.certification.proyectobase.util.UtilidadTiempo.condicionExitosa;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Esperar implements Interaction {

   private int seconds;

    public Esperar(int seconds) {
        this.seconds = seconds;
    }

    public static Esperar estosSegundos(int seconds) {
        return Instrumented.instanceOf(Esperar.class).withProperties(seconds);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
       // try {
            Awaitility.await().forever().pollInterval(seconds, TimeUnit.SECONDS).until(condicionExitosa());
       // } catch (Exception e) {
        //    e.getMessage();
        //}
    }
}