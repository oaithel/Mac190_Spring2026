package com.mac190.animal;

import java.util.Objects;

/*
Design a class Dog knowing that a Dog is an Animal in adition
a dog has breed and name as member variables.
setters/getters  toString equals
the method speak() make it display "Waf! waf!"
 */
public class Dog extends Animal{
    String breed, name;
    public Dog(String breed, String name) {
        super("Canine", "Omnivore", "N/A", 0);
        this.breed = breed;
        this.name = name;
    }

    public Dog(String color, int age, String breed, String name) {
        super("Canine", "Omnivore", color, age);
        this.breed = breed;
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Dog d)) return false;
        if (!super.equals(d)) return false;
        return Objects.equals(breed, d.breed) && Objects.equals(name, d.name);
    }
    public void speak(){
        System.out.println("Waf! Waf");
    }
}
