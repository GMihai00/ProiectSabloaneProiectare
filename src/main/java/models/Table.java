package models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Table implements Element{
    String title;
    
    public void print() {
        System.out.println("Table: " + title);
    }

    @Override
    public void add(Element element) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void remove(Element element) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Element get(int index) {
        // TODO Auto-generated method stub
        return null;
    }
}
