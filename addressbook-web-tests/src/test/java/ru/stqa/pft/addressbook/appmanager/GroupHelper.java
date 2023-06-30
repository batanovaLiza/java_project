package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupHelper extends HelperBase
{

    public GroupHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void returnToGroupPage() {
        getClick(By.linkText("group page"));
    }

    public void submitGroupCreation() {
        getClick(By.name("submit"));
    }

    public void fillGroupForm(GroupData groupData) {
        type("group_name", groupData.getName());
        type("group_header", groupData.getHeader());
        type("group_footer", groupData.getFooter());
    }

    public void initGroupCreation() {
        getClick(By.name("new"));
    }

    public void deleteSelectedGroups() {
        getClick(By.name("delete"));
    }

    public void selectGroup() {
        getClick(By.name("selected[]"));
    }
}
