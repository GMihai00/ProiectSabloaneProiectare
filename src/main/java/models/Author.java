package models;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Author implements Serializable{
    protected String name;
    protected String surName;
    
    void print()
    {
        System.out.println(name + " " + surName);
    }
}
