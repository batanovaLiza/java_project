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
        type(contactData.getFirstName(),"first name");
        type(contactData.getLastName(),"last name");
        type(contactData.getCompany(),"company");
        type(contactData.getAddress(),"address");
        type(contactData.getHomePhoneNumb(),"0909090");
        type(contactData.getEmail(),"asjn@ddj.com");
    }
    public void goToNewContactPage() {
        getClick(By.linkText("add new"));
    }

}
