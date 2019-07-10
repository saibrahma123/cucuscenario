package scenarios;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:src/cucumber-reports"},features="src/test/resources/scenarios/scthree.feature"
/*tags= {"not @tag1","@tag2"}*/)
public class Runcucu 
{

}
