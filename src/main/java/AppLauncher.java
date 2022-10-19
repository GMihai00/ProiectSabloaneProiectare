import repository.*;

public class AppLauncher {
    public static void main(String[] args)
    {
        Book book = new Book("Love and War");
        Author author = new Author("Speedy Gonzales");
        
        book.addAuthor(author);
        int indexChapterOne = book.addChapter(new Chapter("First chapter"));
        Chapter chapter1 = book.getChapter(indexChapterOne);
        int indexSubChapterOne =
            chapter1.addSubChapter(new SubChapter("Subchapter 1 of chapter 1"));
        SubChapter subChapterChapter1 = chapter1.getSubChapter(indexSubChapterOne);
        
        subChapterChapter1.addElement(new Paragraph("Pargraph 1"));
        subChapterChapter1.addElement(new Image("Image 1"));
        subChapterChapter1.addElement(new Paragraph("Pargraph 2"));
        subChapterChapter1.addElement(new Table("Table 1"));
        subChapterChapter1.addElement(new Paragraph("Pargraph 3"));
        subChapterChapter1.addElement(new Paragraph("Pargraph 4"));
        
        book.print();
    }
}
