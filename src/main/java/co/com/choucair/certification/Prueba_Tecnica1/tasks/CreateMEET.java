package co.com.choucair.certification.Prueba_Tecnica1.tasks;

import co.com.choucair.certification.Prueba_Tecnica1.userinterface.createMEET;
import co.com.choucair.certification.Prueba_Tecnica1.userinterface.createUnity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CreateMEET implements Task {
    public static Performable CreateMEETS(){ return Tasks.instrumented(CreateMEET.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(createMEET.CreateMeet),

                Click.on(createMEET.Meet),

                Click.on(createMEET.NewMeet),

                Enter.theValue("Progress Review").into(createMEET.IngresaNombreReunion),

                Click.on(createMEET.MeetingType),

                Enter.theValue("General").into(createMEET.TextoNombreReunion),

                Click.on(createMEET.MeetingTypeSelect),

                Enter.theValue("24").into(createMEET.MeetingNumber),

                Enter.theValue("02/11/2022").into(createMEET.StartDate),

                Click.on(createMEET.SelectDate),

                Click.on(createMEET.SelectTime),

                Click.on(createMEET.SelectTimeHour),

                Enter.theValue("4/11/2022").into(createMEET.EndDateTime),

                Click.on(createMEET.SelectTimeEnd),

                Click.on(createMEET.SelectTimeEndHour),

                Click.on(createMEET.OpenUnit),

                Enter.theValue("Development Choucair").into(createMEET.TextoNombreUnit),

                Click.on(createMEET.UnitSelect),


                Click.on(createMEET.OpenLocation),

                Enter.theValue("HQ-01").into(createMEET.TextoLocation),

                Click.on(createMEET.LocationSelect),

                Click.on(createMEET.OpenReporter),

                Enter.theValue("Aaron Taylor").into(createMEET.TextoReporte),

                Click.on(createMEET.SelectReporter),

                Click.on(createMEET.OpenOrganized),

                Enter.theValue("Aaron Taylor").into(createMEET.TextoOrganized),

                Click.on(createMEET.SelectOrganized),

                Click.on(createMEET.OpenContact),

                Enter.theValue("Aaron Taylor").into(createMEET.TextoContact),

                Click.on(createMEET.ClickContact),

                Click.on(createMEET.SaveMeet),

                Click.on(createMEET.goToMeet)





        );



    }
}
