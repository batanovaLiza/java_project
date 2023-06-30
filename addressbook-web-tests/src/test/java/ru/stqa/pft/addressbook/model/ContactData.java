package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String firstName;
    private final String lastName;
    private final String company;
    private final String address;
    private final String homePhoneNumb;
    private final String email;

    public ContactData(String firstName, String lastName, String company, String address, String homePhoneNumb, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.address = address;
        this.homePhoneNumb = homePhoneNumb;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getHomePhoneNumb() {
        return homePhoneNumb;
    }

    public String getEmail() {
        return email;
    }
}
