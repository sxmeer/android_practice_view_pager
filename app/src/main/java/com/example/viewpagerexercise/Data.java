package com.example.viewpagerexercise;

public class Data {
    int id;
    String name;

    Count[] count;

    public Data(int id, String name, Count[] count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }

    public Count[] getCount() {
        return count;
    }

    public void setCount(Count[] count) {
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
