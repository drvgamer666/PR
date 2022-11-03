package co.com.choucair.certification.Prueba_Tecnica1.userinterface;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class form extends PageObject {

    /*Mapeo de las páginas, descripción de los inputs y localizadores por medio de ID o Path completo*/

    public static final Target Nombres = Target.the("Input primer nombres").located(By.xpath("//*[@id=\'LoginPanel0_Username\']"));

    public static final Target Password = Target.the("Input contraseña").located(By.xpath("//*[@id=\'LoginPanel0_Password\']"));

    public static final Target BotonLogeo = Target.the("Boton Logearse").located(By.xpath("//*[@id=\"LoginPanel0_LoginButton\"]"));

    public static final Target DesplegarOrganizacion = Target.the("Menu desplegable de organización").located(By.xpath("//*[@id=\"nav_menu1_3\"]/li[1]/a/span"));

    public static final Target UnidadesDeNegocio = Target.the("Menu desplegable Ingreso").located(By.xpath("//*[@id=\"nav_menu1_3_1\"]/li[1]/a/span"));



}
