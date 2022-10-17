package samokat.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {


    WebDriver webDriver;
    private static final String url = "https://qa-scooter.praktikum-services.ru/";

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void open(){
        webDriver.get(url);
    }

    private final By cookieButton = By.id("rcc-confirm-button");
    public void clickCookieButton(){
        webDriver.findElement(cookieButton).click(); // клик на кнопке куки
    }

    public void clickOrderButtonByPosition(String position){
        webDriver.findElement(By.xpath("(//button[text() = 'Заказать'])["+position+"]")).click();
    }
    private final By orderButton = By.xpath("(//button[text() = 'Заказать'])[1]");
    public void clickOrderButton(){
        webDriver.findElement(orderButton).click();
    }
    private final By question1 = By.id("accordion__heading-0");
    public void clickQuestion1(){
        webDriver.findElement(question1).click(); // клик на первый вопрос
    }
    private final By answer1 = By.cssSelector("#accordion__panel-0 p");
    public String getAnswer1Text(){
        return webDriver.findElement(answer1).getText();
    }
    public boolean isDisplayedAnswer1(){
        return webDriver.findElement(answer1).isDisplayed();
    }
    public WebElement getAnswer1(){
        return webDriver.findElement(answer1);
    }
    private final By question2 = By.id("accordion__heading-1");
    public void clickQuestion2(){
        webDriver.findElement(question2).click();
    }

    private final By answer2 = By.cssSelector("#accordion__panel-1 p");
    public WebElement getAnswer2(){
        return webDriver.findElement(answer2);
    }
    private final By question3 = By.id("accordion__heading-2");
    public void clickQuestion3(){
        webDriver.findElement(question3).click();
    }
    private final By answer3 = By.cssSelector("#accordion__panel-2 p");
    public WebElement getAnswer3(){
        return webDriver.findElement(answer3);
    }

    private final By question4 = By.id("accordion__heading-3");
    public void clickQuestion4(){
        webDriver.findElement(question4).click();
    }
    private final By answer4 = By.cssSelector("#accordion__panel-3 p");
    public WebElement getAnswer4(){
        return webDriver.findElement(answer4);
    }
    private final By question5 = By.id("accordion__heading-4");
    public void clickQuestion5(){
        webDriver.findElement(question5).click();
    }
    private final By answer5 = By.cssSelector("#accordion__panel-4 p");
    public WebElement getAnswer5(){
        return webDriver.findElement(answer5);
    }
    private final By question6 = By.id("accordion__heading-5");
    public void clickQuestion6(){
        webDriver.findElement(question6).click();
    }
    private final By answer6 = By.cssSelector("#accordion__panel-5 p");
    public WebElement getAnswer6(){
        return webDriver.findElement(answer6);
    }
    private final By question7 = By.id("accordion__heading-6");
    public void clickQuestion7(){
        webDriver.findElement(question7).click();
    }
    private final By answer7 = By.cssSelector("#accordion__panel-6 p");
    public WebElement getAnswer7(){
        return webDriver.findElement(answer7);
    }
    private final By question8 = By.id("accordion__heading-7");
    public void clickQuestion8(){
        webDriver.findElement(question8).click();
    }
    private final By answer8 = By.cssSelector("#accordion__panel-7 p");
    public WebElement getAnswer8(){
        return webDriver.findElement(answer8);
    }
}
