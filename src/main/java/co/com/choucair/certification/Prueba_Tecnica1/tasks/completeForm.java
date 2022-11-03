package co.com.choucair.certification.Prueba_Tecnica1.tasks;


import co.com.choucair.certification.Prueba_Tecnica1.userinterface.form;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class completeForm implements Task {
    public static Performable the() {
        return Tasks.instrumented(completeForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(" admin").into(form.Nombres),
                Enter.theValue("serenity").into(form.Password),
                Click.on(form.BotonLogeo),
                Click.on(form.DesplegarOrganizacion),
                Click.on(form.UnidadesDeNegocio)

        );
    }
}
