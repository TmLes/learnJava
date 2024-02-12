package com.walking.lesson17.task;

public class MyFile {
    String name;
    int size;
    DataTypes infoType;

    public MyFile(String name, int size, DataTypes infoType) {
        this.name = name;
        this.size = size;
        this.infoType = infoType;
    }

    @Override
    public String toString() {
        return "MyFile{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", infoType=" + infoType +
                '}';
    }
}
