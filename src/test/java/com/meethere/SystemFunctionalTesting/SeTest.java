package com.meethere.SystemFunctionalTesting;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");

//浏览器的webdriver 和浏览器的安装路径

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.baidu.com/");

//打开百度

        WebElement search_text =driver.findElement(By.id("kw"));

//定位到百度搜索

        search_text.sendKeys("博客园");//搜索关键字

        search_text.submit();

//driver.quit();//关闭浏览器

    }

}
