import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestIronSpider extends ParentClassBaseUI {

    @Test
    public void test1() {

        if (checkIsContains(IronSpiderPage.webPageForms, "Web Page Forms")) {

            ironSpiderPage.clickWebPageForms();
        }

        if (checkIsContains(IronSpiderPage.webTextFields, "Text Fields")) {
            ironSpiderPage.clickWebTextFields();
        }
        ironSpiderPage.writeCommentToTextArea();

        ironSpiderPage.clickNextButton();

        if (checkIsSelected(IronSpiderPage.checkBoxYellow)) {
            ironSpiderPage.selectYellowCheckBox();
        }
        ironSpiderPage.clickNextButton2();

        ironSpiderPage.selectCoffeeType();
    }
    @Test
    public void testWithLoops(){

        ironSpiderPage.goToMainPage();
        ironSpiderPage.findChildWithForLoop("Web Page Forms");
        checkAssertTitle("HTML Tutorials & Codes - Free Web Design Resources");
        ironSpiderPage.clickWebPageChild();
        ironSpiderPage.selectAllColorCheckBoxesLoop();
    }

}
