package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {
    public static void main(String[] args){




        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com/", "https://walmart.com",
                "https://westelm.com/");
        WebDriver driver=BrowserFactory.getDriver("chrome");
        //first
        driver.get(urls.get(0));
        String Title=driver.getTitle();
        Title+=Title.toLowerCase();
        Title=Title.replace(" ","");
        //Titlea=Title.replace(" ","");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        StringUtility.verifyEquals(urls.get(0),Title);
        /*//Second
        driver.navigate().back();
        driver.get(urls.get(1));
        String Title1=driver.getTitle();
        Title1=Title1.toLowerCase();
        Title1=Title1.replace(" ","");
        System.out.println(driver.getCurrentUrl());
        System.out.println(Title1);
        StringUtility.verifyEquals(Title1,urls.get(1));
        driver.navigate().back();
        //third
        driver.get(urls.get(2));
        String Title2=driver.getTitle();
        Title2=Title2.toLowerCase();
        Title2=Title2.replace(" ","");
        System.out.println(driver.getCurrentUrl());
        System.out.println(Title2);
        StringUtility.verifyEquals(Title2,urls.get(2));

        driver.navigate().back();
        //Fourth
        driver.get(urls.get(3));
        String Title3=driver.getTitle();
        Title3=Title3.toLowerCase();
        Title3=Title3.replace(" ","");
        System.out.println(driver.getCurrentUrl());
        System.out.println(Title3);
        StringUtility.verifyEquals(Title3,urls.get(3));

        driver.navigate().back();
*/
     driver.close();
    }
}
