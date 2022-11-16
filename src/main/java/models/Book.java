package models;


import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Book extends Section{
    protected ArrayList<Author> authors;
    public Book(String title)
    {
        super(title);
        authors = new ArrayList<Author>();
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
    @Override
    public void print() {
        System.out.println("Book:");
        System.out.println("Authors:");
        for (var author : authors)
            author.print();
        super.print();
        
    }
}
