import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleDemo {

    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("Y://Curso_Selenium//Selenium1//tablePage.html");

       // System.out.println(driver.findElement(By.xpath("/html/body/table/tbody[1]/tr[2]/td[1]")).getText());
        //System.out.println(driver.findElement(By.xpath("/html/body/table/tbody[1]/tr[1]/th[2]")).getText());

        List<WebElement> listaWeb = driver.findElements(By.xpath("/html/body/table/tbody[1]/tr"));
        for (WebElement element : listaWeb){
            System.out.println(element.getText());
        }


        driver.close();
    }
}
