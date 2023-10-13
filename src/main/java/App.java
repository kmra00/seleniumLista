import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://es.secure.imvu.com/welcome/ftux/");

        WebElement registroBoton = driver.findElement(By.cssSelector("#imvu > nav > ul.secondary-nav > button"));
        //
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",registroBoton);
        //settings timeouts
        ((JavascriptExecutor) driver).executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 1000);");
        //cambiando la web page

        //((JavascriptExecutor)driver).executeScript("window.location='https://wikipedia.com'");

        //scroll
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");
        //driver.close();


    }
}
