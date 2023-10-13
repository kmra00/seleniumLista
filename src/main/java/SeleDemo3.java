import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SeleDemo3 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("file:///Y://Curso_Selenium//Selenium1/alerts.html");
        WebElement basicAlertBoton = driver.findElement(By.cssSelector("body > button:nth-child(2)"));
        WebElement confirmationAlertBoton = driver.findElement(By.cssSelector("body > button:nth-child(5)"));
        WebElement prompAlertBoton = driver.findElement(By.cssSelector("body > button:nth-child(8)"));
        basicAlertBoton.click();
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alertaBasica = driver.switchTo().alert();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        alertaBasica.accept();

        confirmationAlertBoton.click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert confirmacionAlert = driver.switchTo().alert();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        confirmacionAlert.dismiss();

        prompAlertBoton.click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert prompAlert = driver.switchTo().alert();
        System.out.println(prompAlert.getText());
        prompAlert.sendKeys("Kevshiro");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        prompAlert.accept();


    }
}
