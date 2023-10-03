package steps;

import models.setdata.AbrirPaginaLoombokData;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.assertj.core.api.SoftAssertions;
import utils.AccionesWeb;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AbrirPaginaStep extends UIInteractionSteps {
    Logger logger=Logger.getLogger("AbrirPaginaStep");
    SoftAssertions softAssertions = new SoftAssertions();
    AccionesWeb aw= new AccionesWeb();

    @Step
    public void abrirPagina(AbrirPaginaLoombokData data)
    {
        try
        {
            aw.abrirUrl(data.getUrl());
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