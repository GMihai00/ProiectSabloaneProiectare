package repository;

import baseTypes.NamedObject;

import java.util.ArrayList;

public class Book extends NamedObject {
    protected ArrayList<Paragraph> paragraphs;
    protected ArrayList<Table> tables;
    protected ArrayList<Image> images;

    public Book(String name) {
        super(name);
        tables = new ArrayList<Table>();
        images = new ArrayList<Image>();
        paragraphs = new ArrayList<Paragraph>();
    }

    public void createParagraph(String name) {
        paragraphs.add(new Paragraph(name));
    }

    public void createTable(String name) {
        tables.add(new Table(name));
    }

    public void createImage(String name) {
        images.add(new Image(name));
    }

    public void print() {
        System.out.print(this);
    }
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", paragraphs=" + paragraphs +
                ", tables=" + tables +
                ", images=" + images +
                '}';
    }
}
