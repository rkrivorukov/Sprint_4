package samokat.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {


    WebDriver webDriver = null;
    private static String url = "https://qa-scooter.praktikum-services.ru/";

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void open(){
        webDriver.get(url);
    }

    public void clickCookieButton(){
        webDriver.findElement(By.id("rcc-confirm-button")).click(); // клик на кнопке куки
    }
    public void clickOrderButton(){
        webDriver.findElement(By.className("Button_Button__ra12g")).click();
    }

    public void clickQuestion1(){
        webDriver.findElement(By.id("accordion__heading-0")).click(); // клик на первый вопрос
    }
    public void clickQuestion2(){
        webDriver.findElement(By.id("accordion__heading-1")).click();
    }

    public String getAnswer1Text(){
        return webDriver.findElement(By.cssSelector("#accordion__panel-0 p")).getText();
    }
    public boolean isDisplayedAnswer1(){
        return webDriver.findElement(By.cssSelector("#accordion__panel-0 p")).isDisplayed();
    }
    public WebElement getAnswer1(){
        return webDriver.findElement(By.cssSelector("#accordion__panel-0 p"));
    }
    public WebElement getAnswer2(){
        return webDriver.findElement(By.cssSelector("#accordion__panel-1 p"));
    }

    public void clickQuestion3(){
        webDriver.findElement(By.id("accordion__heading-2")).click();
    }

    public WebElement getAnswer3(){
        return webDriver.findElement(By.cssSelector("#accordion__panel-2 p"));
    }

    public void clickQuestion4(){
        webDriver.findElement(By.id("accordion__heading-3")).click();
    }

    public WebElement getAnswer4(){
        return webDriver.findElement(By.cssSelector("#accordion__panel-3 p"));
    }

    public void clickQuestion5(){
        webDriver.findElement(By.id("accordion__heading-4")).click();
    }

    public WebElement getAnswer5(){
        return webDriver.findElement(By.cssSelector("#accordion__panel-4 p"));
    }
    public void clickQuestion6(){
        webDriver.findElement(By.id("accordion__heading-5")).click();
    }

    public WebElement getAnswer6(){
        return webDriver.findElement(By.cssSelector("#accordion__panel-5 p"));
    }

    public void clickQuestion7(){
        webDriver.findElement(By.id("accordion__heading-6")).click();
    }

    public WebElement getAnswer7(){
        return webDriver.findElement(By.cssSelector("#accordion__panel-6 p"));
    }

    public void clickQuestion8(){
        webDriver.findElement(By.id("accordion__heading-7")).click();
    }

    public WebElement getAnswer8(){
        return webDriver.findElement(By.cssSelector("#accordion__panel-7 p"));
    }
}
