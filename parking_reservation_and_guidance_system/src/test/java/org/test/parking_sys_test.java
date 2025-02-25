package org.test;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.event.MouseEvent;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class parking_sys_test {
    private static WebDriver driver;

    @BeforeClass
    public static void init(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public void homePage() throws InterruptedException {
        driver.get("http://localhost:3000");
        Thread.sleep(3000);
        String title = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/h1")).getText();
        Assert.assertTrue(title.equals("Welcome to SmartParking!!!"));
    }

    public void getStarted() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/button")).click();
        Thread.sleep(3000);
        String title = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/h1")).getText();
        Assert.assertTrue(title.equals("SIGNUP"));
    }

    public void HomeButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div/button[1]")).click();
        Thread.sleep(3000);
        String title = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/h1")).getText();
        Assert.assertTrue(title.equals("Welcome to SmartParking!!!"));
    }

    public void LoginButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div/button[2]")).click();
        Thread.sleep(3000);
        String title = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/h1")).getText();
        Assert.assertTrue(title.equals("LOGIN"));
    }

    public void SignupButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div/button[3]")).click();
        Thread.sleep(3000);
        String title = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/h1")).getText();
        Assert.assertTrue(title.equals("SIGNUP"));
    }

    public void SignUp() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/form/input[1]")).sendKeys("Uttej");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/form/input[2]")).sendKeys("uthumbal@gitam.in");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/form/input[3]")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/form/input[4]")).sendKeys("9908854104");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/form/input[5]")).sendKeys("KA19P8488");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/form/input[6]")).sendKeys("KA19EQ1316");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/form/input[7]")).sendKeys("KA09G8888");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div/button[2]")).click();

    }

    public void Login() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/form/input[1]")).sendKeys("tarunreddythota2004@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/form/input[2]")).sendKeys("Tarun@2004");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/form/button")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);
    }

    public void slotBooking() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div/button[2]")).click();
        Thread.sleep(3000);
        String title = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/h2")).getText();
        Assert.assertTrue(title.equals("SELECT YOUR LOCATION FOR SLOT BOOKING"));
        String location1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[1]/h3")).getText();
        Assert.assertTrue(location1.equals("GITAM BANGALORE"));
        String location2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/h3")).getText();
        Assert.assertTrue(location2.equals("GITAM VIZAG"));
        String location3 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[3]/h3")).getText();
        Assert.assertTrue(location3.equals("GITAM HYDERABAD"));
        String location4 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[4]/h3")).getText();
        Assert.assertTrue(location4.equals("Vikas Parking Area"));
    }

    public void History() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div/button[3]")).click();
        Thread.sleep(3000);
        String title = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/h2")).getText();
        Assert.assertTrue(title.equals("YOUR BOOKING HISTORY"));
    }

    public void ActiveBookings() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div/button[4]")).click();
        Thread.sleep(3000);
        String title = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/h2")).getText();
        Assert.assertTrue(title.equals("ACTIVE BOOKINGS"));
    }

    public void profile() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/div/button[1]"));
        Thread.sleep(5000);
        element.click();
    }

    public void backToHome() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/button[3]")).click();
        Assert.assertTrue(driver.getCurrentUrl().equals("http://localhost:3000/dashboard"));
    }

    public void slotBookingAndPayment() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div/button[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"vehicleNumber\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"vehicleNumber\"]/option[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/button")).click();
        Thread.sleep(3000);
        driver.get("http://localhost:3000/dashboard");
        Thread.sleep(3000);

    }

    public void logOut() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/div/button[2]"));
        Thread.sleep(5000);
        element.click();
    }
    @Test
    public void test() throws InterruptedException {
        homePage();
        getStarted();
        HomeButton();
        LoginButton();
        SignupButton();
        SignUp();
        Login();
        slotBooking();
        History();
        ActiveBookings();
        profile();
        backToHome();
        slotBookingAndPayment();
        logOut();
    }

    @AfterClass
    public static void close() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
