package models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Author {
    protected String name;
    protected String surName;
    
    void print()
    {
        System.out.println(name + " " + surName);
    }
}
