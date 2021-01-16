
package task64;

import java.util.*;



public class OrganizationSummarizer implements SummarizingStrategy{
    
    private final Comparator comparator = new OrganizationComparator(); 

    @Override
    public String summarize(List<Contact> contactList) {
        StringBuffer product = new StringBuffer();
        contactList.sort(comparator);
        for (Contact contact : contactList){
            product.append(contact.getOrganization());
            product.append(DELIMITER);
            product.append(SPACE);
            product.append(contact.getLastName());
            product.append(COMMA);
            product.append(SPACE);
            product.append(contact.getFirstName());
            product.append(EOL_STRING);
        }
        return product.toString();
    }
    
    private class OrganizationComparator implements Comparator<Contact>{

        @Override
        public int compare(Contact c1, Contact c2) {
            return c1.getOrganization().compareTo(c2.getOrganization());
        }
        
    }
    
}
