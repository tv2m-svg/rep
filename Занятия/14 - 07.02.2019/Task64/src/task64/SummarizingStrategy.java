package task64;

import java.util.List;

public interface SummarizingStrategy {
    
    public static final String EOL_STRING = "\n";
    public static final String DELIMITER = ":";
    public static final String COMMA = ",";
    public static final String SPACE = " ";

    public String summarize(List<Contact> contactList);
}
