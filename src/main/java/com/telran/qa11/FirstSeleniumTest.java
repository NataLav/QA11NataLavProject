package com.telran.qa11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    WebDriver wd;
    //befor - setUp(){}

    @BeforeMethod
    public void setUp() {
      //  System.setProperty("webdriver.chrome.driver", "/Users/natalialavrynenko/Desktop/ToolsQA/chromedriver");
        wd = new ChromeDriver();
        wd.get("https://www.google.com/");
    }

    //Test

    @Test
    public void openGoogleDrive(){
        System.out.println("site opened");
    }

    //after -tearDown(){{} закрывает
}
