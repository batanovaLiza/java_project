package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class newContactCreationTest extends TestBase{
    @Test
    public void testNewContactCreation() throws Exception{
        app.getContactHepler().goToNewContactPage();
        app.getContactHepler().fillNewContactForm(new ContactData("Benedict", "Kunberbatch", "Dirol", "NizhnyNovgorod", "laefbaljef@fjnd.com"));
        app.getContactHepler().submitNewContactCreation();
        app.returnToHomePage();
    }


}
