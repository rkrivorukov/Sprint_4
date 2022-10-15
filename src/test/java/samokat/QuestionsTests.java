package samokat;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import samokat.pages.MainPage;

import java.util.concurrent.TimeUnit;

public class QuestionsTests {

    MainPage mainPage = null;

    WebDriver webDriver = null;
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
    public void testQuestion1() throws InterruptedException {
        mainPage = new MainPage(webDriver);
        mainPage.open();

        mainPage.clickCookieButton();
        mainPage.clickQuestion1();

        Assert.assertTrue(mainPage.getAnswer1().isDisplayed());
        Assert.assertTrue((mainPage.getAnswer1().getText()
                .contains("Сутки — 400 рублей. Оплата курьеру — наличными или картой.")));

    }

    @Test
    public void testQuestion2() throws InterruptedException {
        mainPage = new MainPage(webDriver);
        mainPage.open();

        mainPage.clickCookieButton();
        mainPage.clickQuestion2();

        Assert.assertTrue(mainPage.getAnswer2().isDisplayed());
        Assert.assertTrue((mainPage.getAnswer2().getText()
                .contains("Пока что у нас так: один заказ — один самокат. Если хотите покататься с" +
                        " друзьями, можете просто сделать несколько заказов — один за другим.")));

    }
//
//    @Test
//    public void testQuestion2() throws InterruptedException {
//        webDriver.findElement(By.id("rcc-confirm-button")).click(); // клик на кнопке куки
//        webDriver.findElement(By.id("accordion__heading-1")).click();
//        String answer = webDriver.findElement(By.cssSelector("#accordion__panel-1 p")).getText();
//        //получение текста ответа
//        //System.out.println(answer);
//        Assert.assertTrue(answer.contains("Пока что у нас так: один заказ — один самокат. Если хотите покататься с" +
//                " друзьями, можете просто сделать несколько заказов — один за другим."));
//        // проверка ответа
//        //Thread.sleep(2000);
//    }

    @Test
    public void testQuestion3() throws InterruptedException {
        mainPage = new MainPage(webDriver);
        mainPage.open();

        mainPage.clickCookieButton();
        mainPage.clickQuestion3();

        Assert.assertTrue(mainPage.getAnswer3().isDisplayed());
        Assert.assertTrue((mainPage.getAnswer3().getText()
                .contains("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня." +
                        " Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат" +
                        " 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.")));

    }

//    @Test
//    public void testQuestion3() throws InterruptedException {
//        webDriver.findElement(By.id("rcc-confirm-button")).click(); // клик на кнопке куки
//        webDriver.findElement(By.id("accordion__heading-2")).click(); // клик на первый вопрос
//        String answer = webDriver.findElement(By.cssSelector("#accordion__panel-2 p")).getText();
//        //получение текста ответа
//        Assert.assertTrue(answer.contains("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня." +
//                " Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат" +
//                " 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."));
//        // проверка ответа
//        //Thread.sleep(2000);
//    }

    @Test
    public void testQuestion4() throws InterruptedException {
        mainPage = new MainPage(webDriver);
        mainPage.open();

        mainPage.clickCookieButton();
        mainPage.clickQuestion4();

        Assert.assertTrue(mainPage.getAnswer4().isDisplayed());
        Assert.assertTrue((mainPage.getAnswer4().getText()
                .contains("Только начиная с завтрашнего дня. Но скоро станем расторопнее.")));

    }
//    @Test
//    public void testQuestion4() throws InterruptedException {
//        webDriver.findElement(By.id("rcc-confirm-button")).click(); // клик на кнопке куки
//        webDriver.findElement(By.id("accordion__heading-3")).click(); // клик на первый вопрос
//        String answer = webDriver.findElement(By.cssSelector("#accordion__panel-3 p")).getText();
//        //получение текста ответа
//        //System.out.println(answer);
//        Assert.assertTrue(answer.contains("Только начиная с завтрашнего дня. Но скоро станем расторопнее."));
//        // проверка ответа
//        //Thread.sleep(2000);
//    }

    @Test
    public void testQuestion5() throws InterruptedException {
        mainPage = new MainPage(webDriver);
        mainPage.open();

        mainPage.clickCookieButton();
        mainPage.clickQuestion5();

        Assert.assertTrue(mainPage.getAnswer5().isDisplayed());
        Assert.assertTrue((mainPage.getAnswer5().getText()
                .contains("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по" +
                        " красивому номеру 1010.")));

    }
//    @Test
//    public void testQuestion5() throws InterruptedException {
//        webDriver.findElement(By.id("rcc-confirm-button")).click(); // клик на кнопке куки
//        webDriver.findElement(By.id("accordion__heading-4")).click(); // клик на первый вопрос
//        String answer = webDriver.findElement(By.cssSelector("#accordion__panel-4 p")).getText();
//        //получение текста ответа
//        //System.out.println(answer);
//        Assert.assertTrue(answer.contains("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по" +
//                " красивому номеру 1010."));
//        // проверка ответа
//        //Thread.sleep(2000);
//    }

    @Test
    public void testQuestion6() throws InterruptedException {
        mainPage = new MainPage(webDriver);
        mainPage.open();

        mainPage.clickCookieButton();
        mainPage.clickQuestion6();

        Assert.assertTrue(mainPage.getAnswer6().isDisplayed());
        Assert.assertTrue((mainPage.getAnswer6().getText()
                .contains("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток —" +
                        " даже если будете кататься без передышек и во сне. Зарядка не понадобится.")));

    }
//    @Test
//    public void testQuestion6() throws InterruptedException {
//        webDriver.findElement(By.id("rcc-confirm-button")).click(); // клик на кнопке куки
//        webDriver.findElement(By.id("accordion__heading-5")).click(); // клик на первый вопрос
//        String answer = webDriver.findElement(By.cssSelector("#accordion__panel-5 p")).getText();
//        //получение текста ответа
//        //System.out.println(answer);
//        Assert.assertTrue(answer.contains("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток —" +
//                " даже если будете кататься без передышек и во сне. Зарядка не понадобится."));
//        // проверка ответа
//        //Thread.sleep(2000);
//    }

    @Test
    public void testQuestion7() throws InterruptedException {
        mainPage = new MainPage(webDriver);
        mainPage.open();

        mainPage.clickCookieButton();
        mainPage.clickQuestion7();

        Assert.assertTrue(mainPage.getAnswer7().isDisplayed());
        Assert.assertTrue((mainPage.getAnswer7().getText()
                .contains("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже" +
                        " не попросим. Все же свои.")));

    }
//    @Test
//    public void testQuestion7() throws InterruptedException {
//        webDriver.findElement(By.id("rcc-confirm-button")).click(); // клик на кнопке куки
//        webDriver.findElement(By.id("accordion__heading-6")).click(); // клик на первый вопрос
//        String answer = webDriver.findElement(By.cssSelector("#accordion__panel-6 p")).getText();
//        //получение текста ответа
//        //System.out.println(answer);
//        Assert.assertTrue(answer.contains("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже" +
//                " не попросим. Все же свои."));
//        // проверка ответа
//        //Thread.sleep(2000);
//    }

    @Test
    public void testQuestion8() throws InterruptedException {
        mainPage = new MainPage(webDriver);
        mainPage.open();

        mainPage.clickCookieButton();
        mainPage.clickQuestion8();

        Assert.assertTrue(mainPage.getAnswer8().isDisplayed());
        Assert.assertTrue((mainPage.getAnswer8().getText()
                .contains("Да, обязательно. Всем самокатов! И Москве, и Московской области.")));

    }
//    @Test
//    public void testQuestion8() throws InterruptedException {
//        webDriver.findElement(By.id("rcc-confirm-button")).click(); // клик на кнопке куки
//        webDriver.findElement(By.id("accordion__heading-7")).click(); // клик на первый вопрос
//        String answer = webDriver.findElement(By.cssSelector("#accordion__panel-7 p")).getText();
//        //получение текста ответа
//        //System.out.println(answer);
//        Assert.assertTrue(answer.contains("Да, обязательно. Всем самокатов! И Москве, и Московской области."));
//        // проверка ответа
//        //Thread.sleep(2000);
//    }
}
