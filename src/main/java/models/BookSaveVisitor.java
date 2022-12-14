package models;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BookSaveVisitor implements Visitor {
    FileOutputStream fos;
    ObjectOutputStream out;
    BookSaveVisitor()
    {
        try
        {
            fos = new FileOutputStream("save.json");
            out = new ObjectOutputStream(fos);
        }
        catch(IOException e)
        {
            System.out.println("Couldn't open json file");
            System.exit(1);
        }
    }
    @Override
    public void visitBook(Book book) {
        // TODO Auto-generated method stub
        try {
            out.writeObject(book);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        for (var element : book.elements)
        {
            if (element instanceof Section)
                visitSection((Section) element);
            else if (element instanceof TableOfContents)
                visitTableOfContents((TableOfContents) element);
            else if (element instanceof Paragraph)
                visitParagraph((Paragraph) element);
            else if (element instanceof ImageProxy)
                visitImageProxy((ImageProxy) element);
            else if (element instanceof Image)
                visitImage((Image) element);
            else if (element instanceof Table)
                visitTable((Table) element);
        }
    }

    @Override
    public void visitSection(Section section) {
        // TODO Auto-generated method stub
        try {
            out.writeObject(section);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        for (var element : section.elements)
        {
            if (element instanceof Section)
                visitSection((Section) element);
            else if (element instanceof TableOfContents)
                visitTableOfContents((TableOfContents) element);
            else if (element instanceof Paragraph)
                visitParagraph((Paragraph) element);
            else if (element instanceof ImageProxy)
                visitImageProxy((ImageProxy) element);
            else if (element instanceof Image)
                visitImage((Image) element);
            else if (element instanceof Table)
                visitTable((Table) element);
        }
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {
        // TODO Auto-generated method stub
        try {
            out.writeObject(tableOfContents);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        // TODO Auto-generated method stub
        try {
            out.writeObject(paragraph);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        // TODO Auto-generated method stub
        try {
            out.writeObject(imageProxy);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void visitImage(Image image) {
        // TODO Auto-generated method stub
        try {
            out.writeObject(image);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void visitTable(Table table) {
        // TODO Auto-generated method stub
        try {
            out.writeObject(table);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
