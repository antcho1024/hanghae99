package com.sparta.week01_homework;

public enum Category {
    Study(0),
    Game(1),
    Play(2);

    private int id;
//    private String name;

    Category(int id){
        this.id = id;
    }
    public String getKey() {
        return name();
    }

    public int getId() {
        return id;
    }
}
