import models.*;

public class AppLauncher {
    public static void main(String[] args)
    {
        Book book = new Book("Love and War");
        Author author = new Author("Speedy", "Gonzales");
        
        book.addAuthor(author);
        var section = new Section("First chapter");
        book.add( section);
        
        Paragraph p1 = new Paragraph("Pargraph 1", "text1");
        p1.setAlignStrategy(new AlignRight());
        section.add(p1);
        section.add(new ImageProxy("Image 1", "MYURL"));
        section.add( new Paragraph("Pargraph 2", "text2"));
        section.add(new Table("Table 1"));
        section.add(new Paragraph("Pargraph 3", "text3"));
        section.add(new Paragraph("Pargraph 4", "text4"));
        
        book.print();
    }
}
