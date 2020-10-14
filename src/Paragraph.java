public class Paragraph extends Element {
    private String text;

    public void print()
    {
        System.out.println("Paragraph: " + this.text);
    }

    public Paragraph(String text) {
        this.text = text;
    }
}
