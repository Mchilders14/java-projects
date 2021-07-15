package ui;

public class HTMLConverterApp {

    public static void main(String[] args) {

        System.out.println("HTML Converter\n");

        System.out.println("INPUT");
        String html = "<h1>Grocery List</h1>\n" +
                      "<ul>\n" +
                      "    <li>Eggs</li>\n" +
                      "    <li>Milk</li>\n" +
                      "    <li>Butter</li>\n" +
                      "</ul>";
        System.out.println(html);
        System.out.println();

        // process input
        String[] lines = html.split("\n");
        String text = "";
        for (String line : lines) {
            text += line.trim() + "\n";
        }

        text = text.replace("<h1>", "")
        	.replace("</h1>", "")
            .replace("<ul>", "")
            .replace("</ul>", "")
            .replace("<li>", "* ")
            .replace("</li>", "")
            .replace("\n\n", "\n");

        // display output
        System.out.println("OUTPUT");
        System.out.println(text);        
    }
}