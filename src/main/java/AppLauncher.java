import repository.*;

public class AppLauncher {
    public static void main(String[] args)
    {
        Book book = new Book("Love and War");
        Author author = new Author("Speedy Gonzales");
        
        book.addAuthor(author);
        int indexChapterOne = book.addChapter("First chapter");
        Chapter chapter1 = book.getChapter(indexChapterOne);
        int indexSubChapterOne =
            chapter1.addSubChapter("Subchapter 1 of chapter 1");
        SubChapter subChapterChapter1 = chapter1.getSubChapter(indexSubChapterOne);
        
        subChapterChapter1.addParagraph("Pargraph 1");
        subChapterChapter1.addImage("Image 1");
        subChapterChapter1.addParagraph("Pargraph 2");
        subChapterChapter1.addTable("Table 1");
        subChapterChapter1.addParagraph("Pargraph 3");
        subChapterChapter1.addParagraph("Pargraph 4");
        
        book.print();
    }
}
