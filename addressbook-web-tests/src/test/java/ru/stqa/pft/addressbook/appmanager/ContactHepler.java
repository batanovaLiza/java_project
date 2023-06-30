package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHepler extends HelperBase{

    public ContactHepler(FirefoxDriver wd) {
        super(wd);
    }
    public void submitNewContactCreation() {
        getClick(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillNewContactForm(ContactData contactData) {
        type(contactData.getFirstName(),"firstname");
        type(contactData.getLastName(),"lastname");
        type(contactData.getCompany(),"company");
        type(contactData.getAddress(), "address");
        type(contactData.getEmail(),"email");
    }
    public void goToNewContactPage() {
        getClick(By.linkText("add new"));
    }

}
