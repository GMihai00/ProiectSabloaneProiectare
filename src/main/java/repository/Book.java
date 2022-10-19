package repository;


import java.util.ArrayList;

public class Book{
    protected ArrayList<Chapter> chapters;
    protected ArrayList<Author> authors;
    protected TableOfContents tableOfContents;
    String title;

    public Book(String title) {
        this.title = title;
        this.chapters = new ArrayList<Chapter>();
        this.authors = new ArrayList<Author>();
    }
    
    public int addChapter(Chapter chapter)
    {
        chapters.add(chapter);
        return chapters.size() - 1;
    }
    
    public Chapter getChapter(int index)
    {
        return chapters.get(index);
    }

    public int addAuthor(Author author)
    {
        authors.add(author);
        return authors.size() - 1;
    }
    
    public Author getAuthor(int index)
    {
        return authors.get(index);
    }

    public void setTableOfContent(TableOfContents tableOfContents)
    {
        this.tableOfContents = tableOfContents;
    }

    public void print() {
        System.out.print(this);
    }
    
    @Override
    public String toString() {
        return "{" +
            " chapters='" + chapters + "'" +
            ", authors='" + authors + "'" +
            ", tableOfContents='" + tableOfContents + "'" +
            ", title='" + title + "'" +
            "}";
    }
    
}
