package Chapter1;

public class TextbookTester {
    public static void main(String[] args) {
        Textbook textbook1 = new Textbook();
        System.out.println(textbook1);
        //modify for textbook2
        Textbook textbook2 = new Textbook();
        textbook2.setTitle("Anatomy");
        textbook2.setAuthor("Griselda Sanchez");
        textbook2.setNumOfPages(487);
        System.out.println(textbook2);
    }
}
