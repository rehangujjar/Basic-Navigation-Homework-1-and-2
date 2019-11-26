package com.cbt;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class NavigationTests {

    public static void main (String[] args){
        chrome1();
        firefox();
       EdgeDriver();
    }
    public static void chrome1(){
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        String title1=driver.getTitle();
        driver.get("https://etsy.com");
        String title2=driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(title1,title1);
        driver.navigate().forward();
        String title3=driver.getTitle();
        StringUtility.verifyEquals(title1,title3);
        driver.close();
    }

    public static void EdgeDriver(){
        WebDriver driver= BrowserFactory.getDriver("EdgeDriver");
        driver.get("https://google.com");
        String title1=driver.getTitle();
        driver.get("https://etsy.com");
        String title2=driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(title1,title1);
        driver.navigate().forward();
        String title3=driver.getTitle();
        StringUtility.verifyEquals(title1,title3);
        driver.close();
    }
    public static void firefox(){
        WebDriver driver= BrowserFactory.getDriver("firefox");
        driver.get("https://google.com");
        String title1=driver.getTitle();
        driver.get("https://etsy.com");
        String title2=driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(title1,title1);
        driver.navigate().forward();
        String title3=driver.getTitle();
        StringUtility.verifyEquals(title1,title3);
        driver.close();
    }

}
