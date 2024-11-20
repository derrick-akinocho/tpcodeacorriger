package com.harrypotter.actors;

public class NameAge {
    private final String name;
    private final byte age;

    public NameAge(String name, byte age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "NameAge{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
