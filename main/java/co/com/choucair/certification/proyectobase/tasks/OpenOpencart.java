package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ValidCargueURL;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenOpencart implements Task {

    private ValidCargueURL validCargueURL;
    public  static  OpenOpencart page(){

        return Tasks.instrumented(OpenOpencart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(validCargueURL));

    }
}
