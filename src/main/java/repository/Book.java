package repository;

import baseTypes.NamedObject;

import java.util.List;

public class Book extends NamedObject {
    protected List<Paragraph> paragraphs;
    protected List<Table> tables;
    protected List<Image> images;

    public Book(String name) {
        super(name);
    }

    public void createParagraph(String name) {

    }

    public void createTable(String name) {

    }

    public void createImage(String name) {

    }
}
