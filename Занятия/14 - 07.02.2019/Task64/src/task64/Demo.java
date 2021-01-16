
package task64;


public class Demo {

    
    public static void main(String[] args) {
        ContactList list = new ContactList();
        list.addContact(new Contact("David", "St. Hubbins", "The New Originals"));
        list.addContact(new Contact("Mick", "Shrimpton", "The New Originals"));
        list.addContact(new Contact("Nigel", "Tufnel", "The New Originals"));
        list.addContact(new Contact("Derek", "Smalls", "The New Originals"));
        list.addContact(new Contact("Viv", "Savage", "The New Originals"));
        list.addContact(new Contact("Nick", "Shrimpton", "Fishy Business, LTD"));
        list.addContact(new Contact("Nickolai", "Lobachevski", "Fishy Business, LTD"));
        list.addContact(new Contact("Alan", "Robertson", "Universal Exports"));
        list.addContact(new Contact("William", "Telle", "Universal Exports"));
        list.addContact(new Contact("Harvey", "Manfredjensenden", "Universal Imports"));
        list.addContact(new Contact("Deirdre", "Pine", "The Universal Joint"));
        list.addContact(new Contact("Martha", "Crump-Pinnett", "Avatar Inc."));
        list.addContact(new Contact("Bryan", "Basham", "IOVA"));
        
        list.setSummarizer(new OrganizationSummarizer());
        System.out.println(list.summerized());
    }
    
}
