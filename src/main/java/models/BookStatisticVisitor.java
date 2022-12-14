package models;

public class BookStatisticVisitor implements Visitor{

    int nrSections = 0;
    int nrTableOfContents = 0;
    int nrParagraph = 0;
    int nrImage = 0;
    int nrTable = 0;
    @Override
    public void visitBook(Book book) {
        nrSections = 0;
        nrTableOfContents = 0;
        nrParagraph = 0;
        nrImage = 0;
        nrTable = 0;
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
        nrSections = 0;
        nrTableOfContents = 0;
        nrParagraph = 0;
        nrImage = 0;
        nrTable = 0;
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
        nrSections++;
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {
        nrTableOfContents++;
        
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        nrParagraph++;
        
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        nrImage++;
        
    }

    @Override
    public void visitImage(Image image) {
        nrImage++;
        
    }

    @Override
    public void visitTable(Table table) {
        nrTable++;
        
    }
    
}
