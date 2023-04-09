package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String browser = "Chrome";
    static String baseUrl = " https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong browser name");

            String title = driver.getTitle();
            System.out.println(title);
            // get the current url
            System.out.println("Current URL :" + driver.getCurrentUrl());
            // Get the page Source
            System.out.println("Page source  : " + driver.getPageSource());
            // Find the username field element
            WebElement userNameField = driver.findElement(By.name("username"));
            userNameField.sendKeys("prime");

            driver.findElement(By.name("password")).sendKeys("prime123");
            driver.close();



        }
    }




}
