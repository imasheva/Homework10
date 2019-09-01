import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IronSpiderPage extends BaseActions {

    static WebElement webPageForms, webTextFields, textAreaElement, nextButtonElement, checkBoxYellow, dropDownSelectCoffee;  //declare 1st part

    public IronSpiderPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        webPageForms = driver.findElement(Locators.WEB_PAGE_FORMS);
    }
    public void goToMainPage(){
        driver.get(Data.mainUrl);
    }
    public void clickWebPageForms() {
        webPageForms.click();
        webTextFields = driver.findElement(Locators.WEB_TEXT_FILEDS);
    }

    public void clickWebTextFields() {
        webTextFields.click();
        textAreaElement = driver.findElement(Locators.TEXT_AREA);
    }

    public void writeCommentToTextArea() {
        textAreaElement.sendKeys(Data.commentText);
        nextButtonElement = driver.findElement(Locators.NEXT_BUTTON);
    }

    public void clickNextButton() {
        nextButtonElement.click();
        checkBoxYellow = driver.findElement(Locators.CHECK_BOX_YELLOW);
    }

    public void selectYellowCheckBox() {
        checkBoxYellow.click();
        nextButtonElement = driver.findElement(Locators.NEXT_BUTTON);
    }

    public void clickNextButton2() {
        nextButtonElement.click();
    }

    public void selectCoffeeType() {
        getDropDownListByValue(Locators.SELECT_COFFEE, "regular");
    }


    public void findChildWithForLoop(String word) {

        List<WebElement> divParent = driver.findElements(Locators.DIV_MENU);

        for (int i = 0; i < divParent.size(); i++) {
            String childName = divParent.get(i).getText();

            if (childName.contains(word)) {
                divParent.get(i).click();
            }
        }
    }
    public void clickWebPageChild(){

     WebElement checkBoxRadioButtonElement = driver.findElement(Locators.checkBoxRadioButtonPage);
     if (checkBoxRadioButtonElement.isDisplayed()){
         checkBoxRadioButtonElement.click();
        }
    }
    public void selectAllColorCheckBoxesLoop(){
        List<String> colors = new ArrayList<String>(Arrays.asList("red", "yellow", "blue", "orange","green", "purple"));

        for(int i = 0; i < colors.size(); i++){
            String currentColor = colors.get(i);
            WebElement colorCheckBox = driver.findElement(By.xpath("//input[@value='"+currentColor+"']"));
            if (!colorCheckBox.isSelected()){
                colorCheckBox.click();
            }
        }
    }
}