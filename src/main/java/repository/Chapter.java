package repository;

import java.util.ArrayList;

public class Chapter {
    protected ArrayList<SubChapter> subChapters;
    String name;
    
    public Chapter(String name) {
        this.name = name;
        subChapters = new ArrayList<SubChapter>();
    }
    
    public int addSubChapter(SubChapter subChapter)
    {
        subChapters.add(subChapter);
        return subChapters.size() - 1;
    }
    
    public SubChapter getSubChapter(int index)
    {
        return subChapters.get(index);
    }

    public void print() {
        System.out.print(this);
    }
    
    @Override
    public String toString() {
        return "{" +
            " subChapters='" + subChapters + "'" +
            ", name='" + name + "'" +
            "}";
    }
    
}
