package com.testinium.methods;
import com.testinium.driver.Base_Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Methods {
    WebDriver driver;
    FluentWait<WebDriver> wait;
    JavascriptExecutor jsdriver;

    public Methods (){
        driver = Base_Test.driver;
        wait = new FluentWait<WebDriver>(driver);
        wait.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofMillis(300)).ignoring(NoSuchElementException.class);
        jsdriver=(JavascriptExecutor) driver;
    }

    public WebElement findElement(By by){

        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
    public void click(By by){
        findElement(by).click();
    }
    public void waitBySeconds(long seconds) {
        try {
            Thread.sleep(seconds*1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void sendKeys(By by, String text){

        findElement(by).sendKeys(text);


    }
    public void scrollWithAction(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();

    }
    public Select getSelect(By by){ return new Select(findElement(by));}

    public void selectByText(By by, String text){
        getSelect(by).selectByVisibleText(text);

    }
    public String getAttribute(By by, String attributeName){
        return findElement(by).getAttribute(attributeName);
    }

    public String getText(By by){
        return findElement(by).getText();
    }

    public String getValue(By by){
        return jsdriver.executeScript("return arguments[0].value"
                ,findElement(by)).toString();
    }
    public boolean isElementVisible(By by){
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        }catch (Exception e){
            return false;
        }
    }
    public WebElement randomElement(By by){

        List<WebElement> productList = driver.findElements(by);

// Ürün listesi boyutunu al
        int listSize = productList.size();

// Rastgele bir sayı oluştur
        Random random = new Random();
        int randomNumber = random.nextInt(listSize);

// Rastgele bir ürün seç
        WebElement randomProduct = productList.get(randomNumber);

        randomProduct.click();
// Seçilen ürüne tıkla
        return randomProduct;

    }

}