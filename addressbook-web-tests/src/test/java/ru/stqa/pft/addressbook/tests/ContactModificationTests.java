package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{
    @Test
    public void testContactModification(){
         app.getNavigationHelper().goToHomePage();
         app.getContactHepler().selectContact();
         app.getContactHepler().editContact();
         app.getContactHepler().fillContactForm(new ContactData("Mads","Mikkelsen","Peterochka","Kiev","fjnfdjk@skjdnf.com"));
         app.getContactHepler().updateModification();
        app.getNavigationHelper().goToHomePage();
    }

}
