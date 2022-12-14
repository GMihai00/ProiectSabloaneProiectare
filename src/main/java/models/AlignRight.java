package models;

import java.io.Serializable;

import javax.naming.Context;

public class AlignRight implements AlignStrategy, Serializable{

    @Override
    public void render(Paragraph paragraph) {
        System.out.println(paragraph.getTitle());
        System.out.println("                 " + paragraph.getText());
    }
    
}
