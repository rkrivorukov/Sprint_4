package samokat.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {

    WebDriver webDriver = null;
    private static final String url = "https://qa-scooter.praktikum-services.ru/order";

    public OrderPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void open(){
        webDriver.get(url);
    }
    public void enterName(String name){
        webDriver.findElement(By.xpath("(//*[contains(@class, 'Input_Input__1iN_Z')])[2]"))
                .sendKeys(name);
    }

    public void enterSurname(String surname){
        webDriver.findElement(By.xpath("(//*[contains(@class, 'Input_Input__1iN_Z')])[3]"))
                .sendKeys(surname);
    }

    public void enterAddress(String address){
        webDriver.findElement(By.xpath("(//*[contains(@class, 'Input_Input__1iN_Z')])[4]"))
                .sendKeys(address);
    }

    public void enterPhoneNumber(String phoneNumber){
        webDriver.findElement(By.xpath("(//*[contains(@class, 'Input_Input__1iN_Z')])[5]"))
                .sendKeys(phoneNumber);
    }

    public void enterMetro(){
        webDriver.findElement(By.className("select-search__input")) .click();
        webDriver.findElement(By.cssSelector(".select-search__select *")) .click();
    }

    public void clickFirstNextButton(){
        webDriver.findElement(By.cssSelector("[class*='Button_Middle__1CSJM']")).click();

    }

    public void enterDate(String date){
        webDriver.findElement(By.cssSelector("[placeholder='* Когда привезти самокат']"))
                .sendKeys(date);
        webDriver.findElement(By.className("Order_Header__BZXOb")).click(); //закрытие дайтпикера

    }

    public void enterRentalPeriod(String period){
        webDriver.findElement(By.className("Dropdown-control")).click();
        webDriver.findElement(By.xpath("//*[@class='Dropdown-option'][text() = '"+period+"']")).click();

    }

    public void clickChooseBlack(){
        webDriver.findElement(By.xpath("//*[@for='black']")).click();

    }

    public void enterComment(String comment){
        webDriver.findElement(By.xpath("//*[@placeholder='Комментарий для курьера']"))
                .sendKeys(comment);

    }

    public void clickFinalOrderButton(){
        webDriver.findElement(By.xpath("(//button[text() = 'Заказать'])[2]")).click();

    }

    public boolean isDisplayedYesButtonInModel(){
        return webDriver.findElement(By.xpath("//*[@class='Order_Modal__YZ-d3']//button[text() = 'Да']"))
                .isDisplayed();

    }
    public void clickYesButtonInModel(){
        webDriver.findElement(By.xpath("//*[@class='Order_Modal__YZ-d3']//button[text() = 'Да']"))
                .click();


    }

    public boolean isDisplayedLookStatusButtonInModel(){
        return  webDriver.findElement(
                        By.xpath("//*[@class='Order_Modal__YZ-d3']//button[text() = 'Посмотреть статус']"))
                        .isDisplayed();

    }
}
