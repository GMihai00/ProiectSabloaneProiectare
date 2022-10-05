package repository;

import baseTypes.NamedObject;

public class Table extends NamedObject {
    public Table(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Table{" +
                "name='" + name + '\'' +
                '}';
    }
}
