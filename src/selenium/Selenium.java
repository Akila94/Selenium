/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 *
 * @author kelumt
 */
public class Selenium {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException{
        // TODO code application logic here
        
        //System.setProperty("webdriver.chrome.driver", "F:\\slasscom\\webdriver\\chromedriver_win32\\chromedriver.exe");
        
        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("start-maximized");
        //options.addArguments("disable-infobars");
        //options.addArguments("--disable-extensions");
        //options.addArguments("--test-type");
        //options.addArguments("--ignore-certificate-errors");

        //WebDriver driver =new ChromeDriver(options);
        System.setProperty("webdriver.gecko.driver", "F:\\slasscom\\webdriver\\geckodriver-v0.21.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        
        //WebDriver driver =new InternetExplorerDriver();
        String baseUrl = "https://www.wikipedia.org/";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        
        //WebElement link = driver.findElement(By.linkText("English"));
        WebElement link = driver.findElement(By.id("js-link-box-en"));
        link.click();
        Thread.sleep(5000);
        
        WebElement searchBox = driver.findElement(By.id("searchInput"));
        searchBox.sendKeys("Software");
        searchBox.submit();
        Thread.sleep(5000);
        
        driver.quit();
    }
    
}
