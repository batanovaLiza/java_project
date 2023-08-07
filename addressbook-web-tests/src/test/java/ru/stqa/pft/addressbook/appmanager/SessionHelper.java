package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase{
    public SessionHelper(WebDriver wd) {
        super(wd);
    }
    public void login(String username, String password) {
        type(username, "user");
        type(password, "pass");
        getClick(By.xpath("//input[@value='Login']"));
    }
}
