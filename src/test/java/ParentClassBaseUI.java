import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class ParentClassBaseUI {

    // Declare the instance variables.

    static WebDriver driver;
    WebDriverWait wait;

    IronSpiderPage ironSpiderPage;

    @BeforeMethod
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");

        //Create an object of the class.
        //ex.:Marks mk=new Marks();

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
        driver.get(Data.mainUrl);

        ironSpiderPage = new IronSpiderPage(driver, wait);   // --->> Initialize after drivers/ driver-chrome, wait
    }
    //CHECKER ALWAYS IN PARENT TEST CLASS

    public static void checkAssertExpectedUrl(String expectedUrl) {
        String findedUrl = driver.getCurrentUrl();
        Assert.assertEquals(findedUrl, expectedUrl);
    }

    public static void checkAssertTitle(String expectedTitle) {
        String findedTitle = driver.getTitle();
        Assert.assertEquals(findedTitle, expectedTitle);
    }

//Universalnyi checker words dlya webelementa

    public static boolean checkIsContains(WebElement webElement, String words) {
        if (webElement.getText().contains(words)) {
            return true;
        }

        Assert.fail("Can't find " + words);
        return false;
    }

    public static boolean checkIsDisplayed(WebElement webElement) {
        if (webElement.isDisplayed()) {
            return true;
        }
        Assert.fail("Can't find ");
        return false;
    }

    public boolean checkIsSelected(WebElement webElement) {

        if (webElement.isSelected()) {
            System.out.println(webElement.getText() + " already Selected");
            return false;
        } else {
            return true;
        }
    }

    @AfterMethod
    public void afterActions() {
        //      driver.quit();
    }

}