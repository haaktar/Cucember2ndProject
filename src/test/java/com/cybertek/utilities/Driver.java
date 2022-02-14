package com.cybertek.utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jshell.spi.ExecutionControl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static WebDriver driver;

    private Driver(){}

    public static WebDriver getDriver(){
        if (driver !=null){
            String browser = ConfigurationReader.getProperties("browser");
            switch (browser){
                case "Chrome" :
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firework":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                default:
                    throw new RuntimeException("No Such a Browser");
            }
        }

        return driver;

    }

    public static void closeDriver(){
        if(driver != null){
            driver.quit();
            driver=null;
        }
    }
}