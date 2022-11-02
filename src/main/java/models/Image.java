package models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Image implements Element{
    final String name;

    @Override
    public void print() {
        // TODO Auto-generated method stub
        
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
