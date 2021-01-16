package task64;

import java.util.*;


public class NameSummarizer implements SummarizingStrategy{
    
    private final Comparator comparator = new NameComparator(); 

    @Override
    public String summarize(List<Contact> contactList) {
        StringBuffer product = new StringBuffer();
        contactList.sort(comparator);
        for (Contact contact : contactList){
            product.append(contact.getLastName());
            product.append(COMMA);
            product.append(SPACE);
            product.append(contact.getFirstName());
            product.append(EOL_STRING);
        }
        return product.toString();
    }
    
    private class NameComparator implements Comparator<Contact>{

        @Override
        public int compare(Contact c1, Contact c2) {
            if (c1.getLastName().equals(c2.getLastName()))
                return c1.getFirstName().compareTo(c2.getFirstName());
            return c1.getLastName().compareTo(c2.getLastName());
        }
        
    }

}
