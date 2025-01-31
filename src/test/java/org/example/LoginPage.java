package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

public class LoginPage {
    /**
 * конструктор класса, занимающийся инициализацией полей класса
 */
    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;}

/**
 * определение локатора кнопки "войти"
 */
@FindBy(xpath = "//button[text()='Войти'])
private WebElement loginBtn;

/**
 * метод для осуществления нажатия кнопки "войти" после загрузки страницы
 */
    public void clickLoginBtn() {loginBtn.click();}

/**
 * определение локатора поля ввода логина
 */
@FindBy(xpath = "//*[@id="root"]/div/div/div/div[2]/div/form/div[2]/div[2]/div[1]/div/div/div/div/div/div[1]/div/input")
private WebElement loginField;

/**
* метод для ввода логина
*/
public void inputLogin(String login) {
loginField.sendKeys(login); }

/**
 * определение локатора кнопки "войти как User"
 */
@FindBy(xpath = "//*[@id="root"]/div/div/div/div[2]/div/form/div[2]/div[2]/div[3]/div/div/div[1]/button")
private WebElement loginBtn;

/**
* метод для осуществления нажатия кнопки "войти как User" после ввода логина
*/
public void clickLoginBtn() {
loginBtn.click(); } }





