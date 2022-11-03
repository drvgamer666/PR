package co.com.choucair.certification.Prueba_Tecnica1.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.Click;
import  net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class createUnity extends PageObject {
    /* clic en botón Join to Day con localizador*/
    public static final Target CreateUnityB = Target.the("botón creación reunion").located(By.xpath("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]/div/span"));
    public static final Target Names = Target.the("Input Nombre").located(By.xpath("//*[@id=\"Serenity_Pro_Organization_BusinessUnitDialog3_Name\"]"));

    public static final Target tipoReunion = Target.the("Selecciona ").located(By.xpath("//*[@id=\"select2-chosen-1\"]"));

    public static final Target IngresaNombreUnidad = Target.the("Selecciona tip reunion").located(By.xpath("//*[@id=\"s2id_autogen1_search\"]"));

    public static final Target seleccionaNombre = Target.the("Selecciona tipo").located(By.xpath("/html/body/div[7]/ul/li[1]/div"));
    public static final Target guardarUnidad = Target.the("Guardar unidad").located(By.xpath("//*[@id=\"Serenity_Pro_Organization_BusinessUnitDialog3_Toolbar\"]/div/div/div/div[1]/div/span"));



}