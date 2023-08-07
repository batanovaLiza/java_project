package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase{
    protected FirefoxDriver wd;

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }
    public void goToGroupPage() {
        getClick(By.linkText("groups"));
    }


    public void goToHomePage() {
        getClick(By.linkText("home"));
    }
}
