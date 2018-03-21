package starter;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.ThucydidesSystemProperty;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features",
        tags = "@Connected_Flight"
)
public class CucumberTestSuite {
	
	static EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
	public static String URL;

	@BeforeClass
	public static void getBuildEcomVersion() {
	
		URL = variables.getProperty(ThucydidesSystemProperty.WEBDRIVER_BASE_URL) + "/build.txt";
		
		System.out.println(URL);
		
	}
	
}
