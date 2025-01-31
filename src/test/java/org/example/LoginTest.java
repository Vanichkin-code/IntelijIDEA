import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;



public class Main {
    public static void main(String[] args) {
        //определение пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
        //создание экземпляра драйвера
        WebDriver driver=new ChromeDriver();
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //переход на желаемый сайт
        driver.get("https://mail.ru");
    }
}
/**
 * тестовый метод для осуществления аутентификации
 */
@Test
public void loginTest() {
    //получение доступа к методам класса LoginPage для взаимодействия с элементами страницы
    //значение login берется из файла настроек по аналогии с chromedriver
    //и loginpage

    //нажимаем на кнопку войти
    loginPage.clickLoginBtn();

    //вводим логин
    loginPage.inputLogin(ConfProperties.getProperty("login"));

    //получаем отображаемый логин
    String user = profilePage.getUserName();

    //и сравниваем его с логином из файла настроек
    Assert.assertEquals(ConfProperties.getProperty("login"), user);

    //нажимаем кнопку войти как User
    loginPage.clickLoginBtn();
}

сегодня пятница)
