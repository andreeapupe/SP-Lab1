import java.util.ArrayList;

public class Book {
    private String name;

    private ArrayList<String> paragraphs = new ArrayList<String>();
    private ArrayList<String> images = new ArrayList<String>();
    private ArrayList<String> tables = new ArrayList<String>();

    public Book() {

    }

    public Book(String name) {
        this.name = name;
    }

    public void createNewParagraph(String paragraph)
    {
        paragraphs.add(paragraph);
    }

    public void createNewImage(String image)
    {
        images.add(image);
    }

    public void createNewTable(String table)
    {
        tables.add(table);
    }

    public void print()
    {
        System.out.println("Book Name: " + '\n' + name);

        //For design purposes
        System.out.println(" ");
        System.out.println("Paragraphs:");

        for (String p : paragraphs)
        {
            System.out.println("\t" + p);
        }

        System.out.println(" ");
        System.out.println("Images:");
        for (String i : images)
        {
            System.out.println("\t" + i);
        }

        System.out.println(" ");
        System.out.println("Tables:");
        for (String t : tables)
        {
            System.out.println("\t" + t);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getParagraphs() {
        return paragraphs;
    }
}