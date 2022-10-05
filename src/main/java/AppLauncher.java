import repository.Book;

public class AppLauncher {
    public static void main(String[] args)
    {
        Book book = new Book("Love and War");
        book.createParagraph("First Para");
        book.createParagraph("Second Para");
        book.createImage("First photo");
        book.print();
    }
}
