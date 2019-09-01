import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseActions {

    protected WebDriver driver;
    protected WebDriverWait wait;

    //constructor

    public BaseActions(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public void getDropDownListByIndex(By Locators, int index) {
        Select select = new Select(driver.findElement(Locators));
        select.selectByIndex(index);
    }

    public void getDropDownListByText(By Locators, String text) {
        Select select = new Select(driver.findElement(Locators));
        select.selectByVisibleText(text);
    }


    public void getDropDownListByValue(By Locators, String value) {
        Select select = new Select(driver.findElement(Locators));
        select.selectByValue(value);
    }

}