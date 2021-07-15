package ui;

public class StringUtil {  
    
    public static String getLine(int length) {
        StringBuilder sb = new StringBuilder(length);
        while (sb.length() < length) {
            sb.append("=");
        }
        return sb.toString();
    }
    
    public static String toTitleCase(String name) {
        String nameTitleCase = 
                name.substring(0, 1).toUpperCase() +
                name.substring(1).toLowerCase();
        return nameTitleCase;
    }    
}