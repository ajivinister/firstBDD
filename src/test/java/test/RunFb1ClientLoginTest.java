package test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
        features = "scr/test/java/test",
        glue    = "scr/test/java/test"
        )

public class RunFb1ClientLoginTest {

}
