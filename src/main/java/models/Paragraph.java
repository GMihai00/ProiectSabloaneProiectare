package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Paragraph implements Element{
    final String title;
    String text;
    private AlignStrategy alignStrategy;
    
    public Paragraph(String title, String text)
    {
        this.title = title;
        this.text = text;
        //by default align left 
        alignStrategy = new AlignLeft();
    }

    void setAlignment(AlignStrategy alignStrategy)
    {
        this.alignStrategy = alignStrategy;
        //'ALIGN' text we do this in print
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
    
    public void print() {
        alignStrategy.render(this);
    }
}
