package models;

public class VisitorFactory {
    
    public Visitor createVisitor(String name)
    {
        switch(name)
        {
            case "BookStatistic":
                return new BookStatisticVisitor();
            case "BookSave":
                return new BookSaveVisitor();
            default:
                //SHOULD NOT GET HERE
                return null;
        }
    }
}
