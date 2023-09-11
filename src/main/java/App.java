import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.wikipedia.org");
        //driver.close();
        //id
        Long start = System.currentTimeMillis();
        driver.findElement(By.id("js-link-box-es"));
        Long end = System.currentTimeMillis();
        System.out.println("the time needed to get a id locator es:"+(end - start));
        //xpath
        start = System.currentTimeMillis();
        driver.findElement(By.xpath("//*[@id=\"js-link-box-en\"]"));
        end = System.currentTimeMillis();
        System.out.println("the time needed to get a xpath locator es:"+(end - start));

        //css
        start = System.currentTimeMillis();
        driver.findElement(By.cssSelector("#www-wikipedia-org > div.central-featured > div.central-featured-lang.lang2"));
        end = System.currentTimeMillis();
        System.out.println("the time needed to get a css locator es:"+(end - start));

    }
}
