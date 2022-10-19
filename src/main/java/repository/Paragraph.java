package repository;
    

public class Paragraph extends Element{
    String text;
    public Paragraph(String text) {
        this.text = text;
    }
    
    public void print() {
        System.out.print(this);
    }

    @Override
    public String toString() {
        return "{" +
            " text='" + text + "'" +
            "}";
    }
    
}
