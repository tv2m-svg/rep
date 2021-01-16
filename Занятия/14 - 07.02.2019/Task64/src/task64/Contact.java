package task64;

public class Contact {

    private String firstName;
    private String lastName;
    private String organization;

    public Contact(String firstName, String lastName, String organization) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.organization = organization;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOrganization() {
        return organization;
    }

}
