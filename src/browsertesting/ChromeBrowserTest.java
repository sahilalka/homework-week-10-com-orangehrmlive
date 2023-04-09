package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {

        String baseUrl = " https://opensource-demo.orangehrmlive.com/";
        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();

        // open the Url into Browser
        driver.get(baseUrl);

        // get the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        // get the current url
        System.out.println("Current Url :" + driver.getCurrentUrl());

        // Get the page Source
        System.out.println("Page source  : " + driver.getPageSource());

        // Find the username field element
        WebElement userNameField = driver.findElement(By.name("username"));

        userNameField.sendKeys(" Admin");

        driver.findElement(By.name("password")).sendKeys(" admin123");

         // Close the browser
         driver.close();



}
}