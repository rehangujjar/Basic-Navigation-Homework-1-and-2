package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[]args){
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");
        WebDriver driver=BrowserFactory.getDriver("chrome");
        driver.get(urls.get(0));
        String Title1=driver.getTitle();
        String Url1=driver.getCurrentUrl();

        driver.navigate().back();
        driver.get(urls.get(1));
        String Title2=driver.getTitle();
        String Url2=driver.getCurrentUrl();
        driver.navigate().back();
        //StringUtility.verifyEquals(Title1,Title2);
        driver.get(urls.get(2));
        String Title3=driver.getTitle();
        String url3=driver.getCurrentUrl();
        driver.navigate().back();
      //  StringUtility.verifyEquals(Title1,Title3);
        String expected="http://practice.cybertekschool.com";
        if(Title1.equals(Title2) && Title1.equals(Title3) ){
            System.out.println("Pass: All Titles are same");
        }
        else{
            System.out.println("Fail: Titles are not same");
        }

        if(Url1.contains(expected)&&Url2.contains(expected)&&Url1.contains(expected)){
            System.out.println("Pass All Urls are same");
        }
        else{
            System.out.println("Fail! Maybe one aur more are not same");
        }
    driver.close();
    }
}
