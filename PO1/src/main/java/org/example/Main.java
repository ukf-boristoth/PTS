package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static JavascriptExecutor js;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\boris\\Downloads\\chromedriver-win641\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://ais2.ukf.sk/ais/start.do");
        driver.manage().window().setSize(new Dimension(1112, 604));
        driver.findElement(By.id("accept-cookies")).click();
        driver.findElement(By.id("login")).click();
        driver.findElement(By.id("login")).click();
        driver.findElement(By.id("login")).sendKeys("name");
        driver.findElement(By.id("heslo")).sendKeys("pass");
        driver.findElement(By.id("login-form-submit-btn")).click();
        driver.get("https://ais2.ukf.sk/ais/apps/student/sk/");
        Thread.sleep(2000);
        driver.switchTo().frame(0);
        driver.findElement(By.cssSelector(".ytp-large-play-button")).click();
        Thread.sleep(7000);
        driver.findElement(By.cssSelector(".video-stream")).click();
        driver.switchTo().defaultContent();
        driver.findElement(By.cssSelector(".navbar-expand-sm")).click();
        driver.findElement(By.cssSelector(".nav-item:nth-child(6) > a > .mat-icon")).click();
        driver.findElement(By.cssSelector(".nav-item:nth-child(5)")).click();
        driver.findElement(By.cssSelector(".nav-item:nth-child(5)")).click();
        driver.findElement(By.cssSelector(".nav-item:nth-child(6) > a > .mat-icon")).click();
        driver.findElement(By.cssSelector(".ng-star-inserted:nth-child(10) .action")).click();
        driver.findElement(By.cssSelector(".button")).click();
        driver.quit();
    }
}
