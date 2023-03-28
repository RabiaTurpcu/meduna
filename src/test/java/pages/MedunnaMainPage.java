package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.lang.model.element.Element;

public class MedunnaMainPage {

    public MedunnaMainPage() {  // ctrl-enter kisayolu
         PageFactory.initElements(Driver.getDriver(),this);}
   // @FindBy(xpath="//a[@class='appointment-btn scrollto']")  ////a[@class='appointment-btn scrollto']
    //public WebElement makeAnAppointment;

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement registerbutton;


    @FindBy (xpath = "//span[@class='//a[2]//span[1]']")
        public WebElement registerButtonClick;

}
