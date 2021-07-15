package ui;

public class EmailCreatorApp {

    public static void main(String[] args) {
        System.out.println("Email Creator");
        System.out.println();
        
        String[] csv = {"   james   ,butler,jbutler@gmail.com",
                        "Josephine,Darakjy,Josephine_Darakjy@darakjy.org",
                        "ART,VENERE,ART@VENERE.ORG"};
        
        String template = 
            "To:      {email}\n" +
            "From:    noreply@deals.com\n" +
            "Subject: Deals!\n\n" +
            "Hi {first_name},\n\n" +
            "We've got some great deals for you. Check our website!";

        // read each row of the data
        for (String line : csv) {
            // clean the data
            String[] row = line.split(",");

            String firstName = row[0].trim();
            firstName = StringUtil.toTitleCase(firstName);
            
            String email = row[2].trim().toLowerCase();

            String emailText = template.replace("{first_name}", firstName);
            emailText = emailText.replace("{email}", email);
            
            System.out.println(StringUtil.getLine(64));
            System.out.println(emailText);
        }

    }
}