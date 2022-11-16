package models;

import java.util.Optional;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ImageProxy implements Element{
    final String name;
    final String url;
    // final Long dimension;
    Image image;
    
    private void loadImage()
    {
        if (image == null)
        {
            image = new Image(name, url);
        }
    }
    
    @Override
    public void print() {
        // TODO Auto-generated method stub
        loadImage();
        image.print();
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
