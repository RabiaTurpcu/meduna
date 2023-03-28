package stepdefinations;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MedunnaMainPage;
import utilities.Configreader;
import utilities.Driver;

public class US001 {
    MedunnaMainPage mainPage = new MedunnaMainPage();
    Faker faker = new Faker();
    @Given("medunna ana sayfasina gider")
    public void medunnaAnaSayfasinaGider() {

        Driver.getDriver().get(Configreader.getProperty("medunnaUrl"));
    }

    @And("ana sayfa giris ikonuna tiklar")
    public void anaSayfaGirisIkonunaTiklar() {
        mainPage.registerbutton.click();
            Driver.bekle(1);
        
    }

    @And("Register butonuna tiklar")
    public void registerButonunaTiklar() {
        
    }

    @And("SNN kutusuna uygun ssn girer")
    public void snnKutusunaUygunSsnGirer() {

        
    }

    @Then("hata mesajinin cikmadigini test eder")
    public void hataMesajininCikmadiginiTestEder() {
        //Assert.assertTrue(mainPage.ssnDogrulama);
        
    }

    @And("tarayiciyi kapatir.")
    public void tarayiciyiKapatir() {
        Driver.closeDriver();
    }
}



