package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupHelper extends HelperBase
{

    public GroupHelper(WebDriver wd) {
        super(wd);
    }

    public void returnToGroupPage() {
        getClick(By.linkText("group page"));
    }

    public void submitGroupCreation() {
        getClick(By.name("submit"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(groupData.getName(), "group_name");
        type(groupData.getHeader(), "group_header");
        type(groupData.getFooter(), "group_footer");
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

    public void initGroupModification() {
        getClick(By.name("edit"));
    }

    public void submitGroupModification() {
        getClick(By.name("update"));
    }
}
