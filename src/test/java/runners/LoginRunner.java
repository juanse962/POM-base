package runners;


import io.cucumber.junit.CucumberOptions;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import utils.BeforeSuite;
import utils.DataToFeature;
import utils.RunnerPersonalizado;

import java.io.IOException;

@CucumberOptions(features = {"src/test/resources/features/Login.feature"},
        tags = "@Login",
        glue = "definitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE )


@RunWith(RunnerPersonalizado.class)
public class LoginRunner
{
    private LoginRunner() {}
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException
    {
        DataToFeature.overrideFeatureFiles("src/test/resources/features/Login.feature");
    }
}