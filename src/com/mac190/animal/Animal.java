package com.mac190.animal;

import java.util.Objects;

/*
Design and code class Animal that has the following;
species, diet, color and age.
setter/getters, toString and equals.
a method speak() that display "don't know how to speak yet"
 */
abstract class Animal {
    private String species, diet, color;
    private int age;

    public Animal() {
        this.species = "N/A";
        this.diet = "N/A";
        this.color = "N/A";
        this.age = 0;
    }

    public Animal(String species, String diet, String color, int age) {
        this.species = species;
        this.diet = diet;
        this.color = color;
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", diet='" + diet + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Animal animal)) return false;
        return age == animal.age && Objects.equals(species, animal.species) && Objects.equals(diet, animal.diet) && Objects.equals(color, animal.color);
    }
/*
Very often we want to force inherited class to implement a certain
method but we have no idea how to implement it in a base class.
Such methods are defined as abstract in the base class.
we use abstract key word to define them.
If you have one abstract method in a class, the whole needs to be
declared abstract.
You cannot instanciate (make objects out of) an abstract.
 */
    //Example: I don't know how to implement method spean in Animal
    //class but I want every inherited class to implement that method
    //therefore speak needs to be abstract

    abstract void speak();
}
