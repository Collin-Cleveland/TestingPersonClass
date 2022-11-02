package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String hairColor;
    private String eyeColor;
    private int height;
    private int weight;
    private String favColor;
    public String getFavColor() {
        return favColor;
    }
    public void setFavColor(String favColor) {
        this.favColor = favColor;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public String getEyeColor() {
        return eyeColor;
    }
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
    public String getHairColor() {
        return hairColor;
    }
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
        this.hairColor = "Brown";
        this.eyeColor = "Brown";
        this.height = 75;
        this.weight = 190;
        this.favColor = "Green";
    }
    public Person(int age) {
        this.age = age;
    }
    public Person(String name) {
        this.name = name;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {

        this.age = age;
    }
    public String getName() {

        return name;
    }

    public Integer getAge() {

        return age;
    }
}
