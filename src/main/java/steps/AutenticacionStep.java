package steps;

import models.setdata.AutenticacionLoombokData;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.assertj.core.api.SoftAssertions;
import pages.DemotoolsqaLoginPage;
import utils.AccionesWeb;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AutenticacionStep extends UIInteractionSteps {
    Logger logger=Logger.getLogger("AutenticacionStep");
    SoftAssertions softAssertions = new SoftAssertions();
    AccionesWeb aw= new AccionesWeb();
    
    @Step
    public void autenticacion(AutenticacionLoombokData data)
    {
        try
        {
            aw.escribir(DemotoolsqaLoginPage.TXT_USER, data.getUser());
            aw.escribir(DemotoolsqaLoginPage.TXT_PASS, data.getPass());
            aw.cliquear(DemotoolsqaLoginPage.BTN_LOGIN);
        }
        catch (Exception e)
        {
            logger.log(Level.INFO, "OCURRIO UN ERROR: ",e);
            softAssertions.fail(e.getMessage());
            softAssertions.assertAll();
            getDriver().quit();
        }
    }
}