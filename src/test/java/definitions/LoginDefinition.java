package definitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.setdata.*;
import net.thucydides.core.annotations.Steps;
import steps.AbrirPaginaStep;
import steps.AutenticacionStep;
import steps.ValidarAutenticacionStep;

public class LoginDefinition {

    @Steps
    AbrirPaginaStep abrirPaginaStep;
    AutenticacionStep autenticacionStep;
    ValidarAutenticacionStep validarAutenticacionStep;

    @Given("^Ingreso A La Web$")
    public void ingresoALaWeb(DataTable table) {
        abrirPaginaStep.abrirPagina(AbrirPaginaLoombokData.setData(table).get(0));
    }

    @When("^Me Autentico$")
    public void meAutentico(DataTable table) {
          autenticacionStep.autenticacion(AutenticacionLoombokData.setData(table).get(0));
    }

    @Then("^Valido El Ingreso Exitoso$")
    public void validoElIngresoExitoso(DataTable table) {
        validarAutenticacionStep.validarAutenticacion(ValidarAutenticacionLoombokData.setData(table).get(0));
    }
}