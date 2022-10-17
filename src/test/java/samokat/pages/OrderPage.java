package samokat.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {

    WebDriver webDriver;
    private static final String url = "https://qa-scooter.praktikum-services.ru/order";

    public OrderPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void open(){
        webDriver.get(url);
    }

    private final By nameInput = By.xpath("(//*[contains(@class, 'Input_Input__1iN_Z')])[2]");
    public void enterName(String name){
        webDriver.findElement(nameInput)
                .sendKeys(name);
    }
    private final By surnameInput =By.xpath("(//*[contains(@class, 'Input_Input__1iN_Z')])[3]");

    public void enterSurname(String surname){
        webDriver.findElement(surnameInput)
                .sendKeys(surname);
    }
    private final By addressInput = By.xpath("(//*[contains(@class, 'Input_Input__1iN_Z')])[4]");
    public void enterAddress(String address){
        webDriver.findElement(addressInput)
                .sendKeys(address);
    }
    private final By phoneNumberInput = By.xpath("(//*[contains(@class, 'Input_Input__1iN_Z')])[5]");

    public void enterPhoneNumber(String phoneNumber){
        webDriver.findElement(phoneNumberInput)
                .sendKeys(phoneNumber);
    }

    private final By metroSearch = By.className("select-search__input");
    private final By metroOption = By.cssSelector(".select-search__select *");
    public void enterMetro(){
        webDriver.findElement(metroSearch) .click();
        webDriver.findElement(metroOption) .click();
    }

    private final By firstNextButton = By.cssSelector("[class*='Button_Middle__1CSJM']");
    public void clickFirstNextButton(){
        webDriver.findElement(firstNextButton).click();

    }

    private final By dateInput = By.cssSelector("[placeholder='* Когда привезти самокат']");
    private final By headerLabel = By.xpath("//*[@class = 'Header_Header__214zg']");
    public void enterDate(String date){
        webDriver.findElement(dateInput)
                .sendKeys(date);
        webDriver.findElement(headerLabel).click(); //закрытие дайтпикера

    }
    private final By rentalPeriodDropdown = By.className("Dropdown-control");
    public void enterRentalPeriod(String period){
        webDriver.findElement(rentalPeriodDropdown).click();
        webDriver.findElement(By.xpath("//*[@class='Dropdown-option'][text() = '"+period+"']")).click();

    }
    private final By checkboxBlack = By.xpath("//*[@for='black']");
    public void clickChooseBlack(){
        webDriver.findElement(checkboxBlack).click();

    }
    private final By commentInput = By.xpath("//*[@placeholder='Комментарий для курьера']");
    public void enterComment(String comment){
        webDriver.findElement(commentInput)
                .sendKeys(comment);

    }
    private final By finalOrderButton = By.xpath("(//button[text() = 'Заказать'])[2]");
    public void clickFinalOrderButton(){
        webDriver.findElement(finalOrderButton).click();

    }
    private final By yesButton = By.xpath("//*[@class='Order_Modal__YZ-d3']//button[text() = 'Да']");
    public boolean isDisplayedYesButtonInModel(){
        return webDriver.findElement(yesButton)
                .isDisplayed();

    }
    public void clickYesButtonInModel(){
        webDriver.findElement(yesButton)
                .click();


    }
    private final By lookStatusButtonInModal =By.xpath("//*[@class='Order_Modal__YZ-d3']//button[text() = 'Посмотреть статус']");

    public boolean isDisplayedLookStatusButtonInModel(){
        return  webDriver.findElement(lookStatusButtonInModal)
                        .isDisplayed();

    }
    private final By orderMadeStatus = By.xpath("//*[@class='Order_ModalHeader__3FDaJ'][contains(text(), 'Заказ оформлен')]");
    public boolean isDisplayedOrderMade() {
        return  webDriver.findElement(orderMadeStatus)
                .isDisplayed();
    }
}
