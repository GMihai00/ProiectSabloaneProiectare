import models.*;

public class AppLauncher {
    public static void main(String[] args)
    {
        Book book = new Book("Love and War");
        Author author = new Author("Speedy", "Gonzales");
        
        book.addAuthor(author);
        var section = new Section("First chapter");
        book.add( section);
        
        section.add(new Paragraph("Pargraph 1"));
        section.add(new Image("Image 1"));
        section.add( new Paragraph("Pargraph 2"));
        section.add(new Table("Table 1"));
        section.add(new Paragraph("Pargraph 3"));
        section.add(new Paragraph("Pargraph 4"));
        
        book.print();
    }
}
