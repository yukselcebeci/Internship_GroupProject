package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class Utkucan_POM extends MyMethods {
    public Utkucan_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}
