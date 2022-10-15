package samokat;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import samokat.pages.MainPage;
import samokat.pages.OrderPage;

import java.util.concurrent.TimeUnit;


@RunWith(Parameterized.class)
public class ParameterizedOrderTests {

    private final String name;
    private final String surname;
    private final String address;
    private final String phoneNumber;
    private final String date;
    private final String rentalPeriod;
    private final String comment;


    public ParameterizedOrderTests(String name, String surname, String address, String phoneNumber
        , String date, String rentalPeriod, String comment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.rentalPeriod = rentalPeriod;
        this.comment = comment;

    }

    @Override
    public String toString() {
        return "OrderTests3Parametrized{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", date='" + date + '\'' +
                ", rentalPeriod='" + rentalPeriod + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }

    @Parameterized.Parameters
    public static Object[][] getSamokatData() {
        //Сгенерируй тестовые данные (нам нужно название городов и результат поиска)
        return new Object[][]{
                {"Роман", "Криворуков", "Москва, Кутузовский пр-т, д. 34","+79150719999",
                        "13.10.2022","сутки","Прошу перезвонить за 10 минут до прибытия" },
                {"Илья", "Иванов", "Серпухов, Стадионная, д. 34","+79175459999",
                        "15.10.2022","двое суток","Прошу перезвонить за 30 минут" }
        };

    }
    WebDriver webDriver = null;
    MainPage mainPage = null;
    OrderPage orderPage = null;
    WebDriverWait webDriverWait;
    @Before
    public void setUp() throws Exception
    {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

        webDriver =new ChromeDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriverWait = new WebDriverWait(webDriver, 5);


    }

    @After
    public void endActions(){
        webDriver.quit();
    }

    @Test
    public void testOrder() throws InterruptedException {

        mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.clickOrderButton();

        orderPage = new OrderPage(webDriver);
        orderPage.enterName(this.name);
        orderPage.enterSurname(this.surname);
        orderPage.enterAddress(this.address);
        orderPage.enterPhoneNumber(this.phoneNumber);
        orderPage.enterMetro();
        orderPage.clickFirstNextButton();

        orderPage.enterDate(this.date);
        orderPage.enterRentalPeriod(this.rentalPeriod);

        orderPage.clickChooseBlack();
        orderPage.enterComment(this.comment);

        orderPage.clickFinalOrderButton();

        Assert.assertTrue("кнопка да не отобразилась",  orderPage.isDisplayedYesButtonInModel() );

        orderPage.clickYesButtonInModel();

        Assert.assertTrue("кнопка да не отобразилась",
                orderPage.isDisplayedLookStatusButtonInModel());

    }

}
