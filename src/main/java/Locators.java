import org.openqa.selenium.By;

public class Locators {
    public static final By WEB_PAGE_FORMS = By.xpath("//div[@class='MenuHeadingOff'][text()='Web Page Forms']");
    public static final By WEB_TEXT_FILEDS = By.xpath("//a[@href='forms/textfields.htm']");
    public static final By TEXT_AREA = By.xpath("//textarea[@name='comments']");
    public static final By NEXT_BUTTON = By.xpath("//a[contains(text(),'NEXT ~>')]");
    public static final By CHECK_BOX_YELLOW = By.xpath("//input[@value='yellow']");
    public static final By SELECT_COFFEE = By.xpath("//select[@name='coffee']");
    public static final By DIV_MENU = By.xpath("//div[@id='Menu']//div");
    public static final By checkBoxRadioButtonPage = By.xpath("//a[contains(text(),'Checkboxes & Radio Buttons')]");

}
