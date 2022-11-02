package repository;

public class Table extends Element{
    String title;
    public Table(String title) {
        this.title = title;
    }
    
    public void print() {
        System.out.print(this);
    }

    @Override
    public String toString() {
        return "{" +
            " title='" + title + "'" +
            "}";
    }
    
}
