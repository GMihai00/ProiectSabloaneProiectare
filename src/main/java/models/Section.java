package models;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Section implements Element{
    
    private ArrayList<Element> elements;
    String title;
    
    public Section(String title)
    {
        this.title = title;
        elements = new ArrayList<Element>();
    }
    @Override
    public void print() {
        System.out.print(this);
        
    }

    @Override
    public void add(Element element) {
        elements.add(element);
        
    }

    @Override
    public void remove(Element element) {
        // TODO Auto-generated method stub
        elements.remove(element);
    }

    @Override
    public Element get(int index) {
        
        return elements.get(index);
    }
    
}
