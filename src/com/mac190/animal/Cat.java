package com.mac190.animal;
/*Design a class Cat knowing that a Cat is an Animal in addition
 a Cat has breed and name as member variables.
setters/getters  toString equals
the method speak() make it display "Miaou! miaou!"
   */

import java.util.Objects;

public class Cat extends Animal{
    String breed, name;

    public Cat(String breed, String name) {
        super("Cats", "Carnivore", "N/A", 0);
        this.breed = breed;
        this.name = name;
    }

    public Cat(String color, int age, String breed, String name) {
        super("Cats", "Carnivore", color, age);
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
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cat cat)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(breed, cat.breed) && Objects.equals(name, cat.name);
    }
    public void speak(){
        System.out.println("Miaou! miaou");
    }
}
