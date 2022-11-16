package models;

import java.util.concurrent.TimeUnit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class Image implements Element{
    final String name;
    final String url;
    private Long[][] content;
    
    public Image(String name, String url)
    {
        this.name = name;
        this.url = url;
        try {
            //load image based on url and save in content simulation
            TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.println(this);
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

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", url='" + getUrl() + "'" +
            ", content='" + getContent() + "'" +
            "}";
    }
    
}
