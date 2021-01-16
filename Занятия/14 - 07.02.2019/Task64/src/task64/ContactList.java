package task64;

import java.util.*;

public class ContactList {
    private List<Contact> contacts = new ArrayList<Contact>();
    private SummarizingStrategy summarizer;

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public void setSummarizer(SummarizingStrategy summarizer) {
        this.summarizer = summarizer;
    }
    
    public void addContact(Contact element){
        if(!contacts.contains(element)){
            contacts.add(element);
        }
    }
    
    public void removeContact(Contact element){
        contacts.remove(element);
    }
    
    public String summerized(){
        return this.summarizer.summarize(getContacts());
    }
}
