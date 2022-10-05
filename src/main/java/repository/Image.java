package repository;

import baseTypes.NamedObject;

public class Image extends NamedObject {
    public Image(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Image{" +
                "name='" + name + '\'' +
                '}';
    }
}
