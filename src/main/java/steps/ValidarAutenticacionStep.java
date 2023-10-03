package steps;

import models.setdata.ValidarAutenticacionLoombokData;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.assertj.core.api.SoftAssertions;
import pages.DemotoolsqaHomePage;
import utils.AccionesWeb;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ValidarAutenticacionStep extends UIInteractionSteps {
    Logger logger=Logger.getLogger("ValidarAutenticacionStep");
    SoftAssertions softAssertions = new SoftAssertions();
    AccionesWeb aw= new AccionesWeb();
    
    @Step
    public void validarAutenticacion(ValidarAutenticacionLoombokData data)
    {
        try
        {
            aw.validarMensajeElemento(DemotoolsqaHomePage.LBL_USERNAME,data.getUsername());
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