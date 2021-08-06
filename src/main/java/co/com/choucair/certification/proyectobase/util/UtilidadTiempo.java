package co.com.choucair.certification.proyectobase.util;

import java.util.concurrent.Callable;

public class UtilidadTiempo {

    public static Callable<Boolean> condicionExitosa() {
        return new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                Boolean allMessagesProcessed = true;
                return allMessagesProcessed;
            }
        };
    }
}
