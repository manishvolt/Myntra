package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
          features="classpath:feature",
          glue="StepDef",
          dryRun=false,
          monochrome=true,
          plugin={"pretty", "html:target/report/report.html", "json:target/json/file.json",}
          
		)



public class TestRunner {

}
