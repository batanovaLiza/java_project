package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelperBase {
    protected WebDriver wd;

    public HelperBase(FirefoxDriver wd) {
        this.wd=wd;
    }

    protected void getClick(By locator) {
        wd.findElement(locator).click();
    }

    protected void type(String group_name, String groupData) {
        getClick(By.name(group_name));
        wd.findElement(By.name(group_name)).clear();
        wd.findElement(By.name(group_name)).sendKeys(groupData);
    }
    public boolean isAlertPresent() {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
