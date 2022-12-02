package com.example.swiftmoney;

import static org.openqa.selenium.remote.CapabilityType.*;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SMSignIn {
    WebDriver driver;
    @Before
    public void setUp() throws MalformedURLException {
        // Created object of DesiredCapabilities class.
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Automation 1");
        capabilities.setCapability(BROWSER_NAME, "Android");
        capabilities.setCapability(VERSION, "13");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.infinity.ajo_android");
        capabilities.setCapability("appActivity", "com.infinity.ajo_android.features.auth.AuthActivity");
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


    }
}
