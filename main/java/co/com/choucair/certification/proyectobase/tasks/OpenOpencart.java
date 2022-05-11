package co.com.choucair.certification.proyectobase.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class OpenOpencart extends PageObject implements Task {
    private OpenOpencart openOpencart;
    public  static  OpenOpencart page(){

        return Tasks.instrumented(OpenOpencart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
