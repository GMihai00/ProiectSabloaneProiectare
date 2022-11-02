package repository;


public class Image extends Element{
    String name;
    public Image(String name) {
        this.name = name;
    }

    public void print() {
        System.out.print(this);
    }
    
    @Override
    public String toString() {
        return "{" +
            " name='" + name + "'" +
            "}";
    }
    
}
