package co.com.choucair.certification.latam.stepdefinitions;

import co.com.choucair.certification.proyectobase.tasks.OpenOpencart;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class StepdefsOpencart {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que se ingresa a la pagina opencart$")
    public void queSeIngresaALaPaginaOpencart() {
        OnStage.theActorCalled("").wasAbleTo(OpenOpencart.page());
    }

    @Cuando("^se ingresa credenciales de logeo$")
    public void seIngresaCredencialesDeLogeo() {
    }

    @Entonces("^valida que el logeo sea exitoso$")
    public void validaQueElLogeoSeaExitoso() {
    }

    @Dado("^que el usuario de la pagina$")
    public void queElUsuarioDeLaPagina() {
    }

    @Cuando("^agrega productos al carro$")
    public void agregaProductosAlCarro() {
    }

    @Entonces("^el usuario ve los productos en el carro de compras$")
    public void elUsuarioVeLosProductosEnElCarroDeCompras() {
    }
}
