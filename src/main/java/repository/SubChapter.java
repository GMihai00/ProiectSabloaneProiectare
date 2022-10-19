package repository;

import java.util.ArrayList;

public class SubChapter {
    protected ArrayList<Element> elements;
    String name;

    public SubChapter(String name) {
        elements = new ArrayList<Element>();
        this.name = name;
    }
    
    public int addElement(Element element)
    {
        elements.add(element);
        return elements.size() - 1;
    }
    
    public Element getElement(int index)
    {
        return elements.get(index);
    }

    public void print() {
        System.out.print(this);
    }

    @Override
    public String toString() {
        return "{" +
            " elements='" + elements + "'" +
            ", name='" + name + "'" +
            "}";
    }
    
}
