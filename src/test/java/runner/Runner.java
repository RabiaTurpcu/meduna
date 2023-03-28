package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        plugin={  //olusturalacak dosyalarin yollari yazilir.dosyalari olusturur.
                "json:target/cucumber.json",
                "html:target/cucumber-default-report",
                "rerun:target/failed.txt"},

        features = "src/test/resources/UI_Features",//feature lar burada
        glue ="stepdefinations", // feature larin adimlarinin yazili oldugu methodlar buraya yazilir
        tags = "@Demo",
        dryRun =false

)





public class Runner {
}
