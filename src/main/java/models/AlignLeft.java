package models;

import javax.naming.Context;

public class AlignLeft implements AlignStrategy{

    @Override
    public void render(Paragraph paragraph) {
        System.out.println(paragraph.getTitle());
        System.out.println(paragraph.getText());
    }
    
}
