package co.com.choucair.certification.Prueba_Tecnica1.tasks;

import co.com.choucair.certification.Prueba_Tecnica1.userinterface.createUnity;
import co.com.choucair.certification.Prueba_Tecnica1.userinterface.form;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CreateUnity implements Task {
    public static Performable CreateUnityBussines(){ return Tasks.instrumented(CreateUnity.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(createUnity.CreateUnityB),
                Enter.theValue("Development Choucair").into(createUnity.Names),
                Click.on(createUnity.tipoReunion),
                Enter.theValue("Acme Corp").into(createUnity.IngresaNombreUnidad),
                Click.on(createUnity.seleccionaNombre),
                Click.on(createUnity.guardarUnidad)

        );



    }
}
