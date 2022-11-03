package co.com.choucair.certification.Prueba_Tecnica1.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class createMEET extends PageObject {
    /* clic en botón Join to Day con localizador*/
    public static final Target CreateMeet = Target.the("desplegar meet").located(By.xpath("//*[@id=\"nav_menu1_3\"]/li[2]/a/span"));
    public static final Target Meet = Target.the("click meet").located(By.xpath("//*[@id=\"nav_menu1_3_2\"]/li[1]/a/span"));
    public static final Target NewMeet = Target.the("click new meet").located(By.xpath("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]/div/span"));
    public static final Target IngresaNombreReunion = Target.the("Ingreso nombre de la reunion").located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_MeetingName\"]"));
    public static final Target MeetingType = Target.the("Ingreso tipo reunion").located(By.xpath("//*[@id=\"select2-chosen-6\"]"));
    public static final Target TextoNombreReunion = Target.the("Ingreso Texto reunion").located(By.xpath("//*[@id=\"s2id_autogen6_search\"]"));
    public static final Target MeetingTypeSelect = Target.the("Ingreso tipo reunion").located(By.xpath("/html/body/div[6]/ul/li/div"));
    public static final Target MeetingNumber = Target.the("Ingreso tipo reunion").located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber\"]"));
    public static final Target StartDate = Target.the("Ingreso fecha de inicio").located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_StartDate\"]"));
    public static final Target SelectDate = Target.the("fecha de inicio").located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid\"]/div/div/div[4]/select"));
    public static final Target SelectTime = Target.the("fecha de inicio seleccion").located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid\"]/div/div/div[4]/select"));
    public static final Target SelectTimeHour = Target.the("fecha de inicio").located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[4]/select/option[85]"));
    public static final Target EndDateTime = Target.the("fecha de de cierre").located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_EndDate\"]"));
    public static final Target SelectTimeEnd = Target.the("hora de de cierre").located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid\"]/div/div/div[5]/select"));
    public static final Target SelectTimeEndHour = Target.the(" seleccion fecha de de cierre").located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[5]/select/option[110]"));
    public static final Target OpenUnit = Target.the(" Abre unit").located(By.xpath("//*[@id=\"select2-chosen-8\"]"));
    public static final Target TextoNombreUnit = Target.the(" Busca Unit").located(By.xpath("//*[@id=\"s2id_autogen8_search\"]"));
    public static final Target UnitSelect = Target.the(" Selecciona unit").located(By.xpath("(//span[@class='select2-match'])[1]"));


    public static final Target OpenLocation = Target.the("Abre locacion").located(By.xpath("//*[@id=\"select2-chosen-7\"]"));
    public static final Target TextoLocation = Target.the("ingresa texto location").located(By.xpath("//*[@id=\"s2id_autogen7_search\"]"));
    public static final Target LocationSelect = Target.the("Click en location").located(By.xpath("(//div[@class='select2-result-label'])[1]"));
    public static final Target OpenReporter = Target.the("abrir reportes").located(By.xpath("//*[@id=\"select2-chosen-10\"]"));
    public static final Target TextoReporte = Target.the("Texto reportes").located(By.xpath("//*[@id=\"s2id_autogen10_search\"]"));
    public static final Target SelectReporter = Target.the("selección reportes").located(By.xpath("(//div[@class='select2-result-label'])[1]"));
    public static final Target OpenOrganized = Target.the("abrir organized").located(By.xpath("//*[@id=\"select2-chosen-9\"]"));
    public static final Target TextoOrganized = Target.the("Texto organized").located(By.xpath("//*[@id=\"s2id_autogen9_search\"]"));
    public static final Target SelectOrganized = Target.the("Texto organized").located(By.xpath("(//div[@class='select2-result-label'])[1]"));
    public static final Target OpenContact = Target.the("Abrir contacto").located(By.xpath("//*[@id=\"select2-chosen-12\"]"));
    public static final Target TextoContact = Target.the("Abrir contacto").located(By.xpath("//*[@id=\"s2id_autogen12_search\"]"));
    public static final Target ClickContact = Target.the("click contacto").located(By.xpath("(//div[@class='select2-result-label'])[1]"));
    public static final Target SaveMeet = Target.the("Abrir contacto").located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_Toolbar\"]/div/div/div/div[1]/div/span"));
    public static final Target goToMeet = Target.the("ir a meets").located(By.xpath("//*[@id=\"nav_menu1_3\"]/li[2]/a/span"));



}