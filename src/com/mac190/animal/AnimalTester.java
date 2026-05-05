package com.mac190.animal;

public class AnimalTester {
    public static void main(String[] args) {
        Animal A = new Animal();
        A.setAge(3);
        A.setDiet("Omnivore");
        A.setSpecies("Canine");
        A.setColor("Gray");
        System.out.println("A: " + A);
        A.speak();

        //make a Dog similar the Animal above
        Dog D = new Dog("Gray", 3, "Shiwawa", "Milou");
        System.out.println("D: " + D);
        D.speak();
        //This will call equals of class Animal and the input is a Dog
        //which is an instance of Animal
        if(A.equals(D)){
            System.out.println("Animal is same as Dog");
        }else{
            System.out.println("Animal is not same as Dog");
        }
        //this will call equals of class Dog and the input is Animal
        //which is not an instance of Dog
        if(D.equals(A)){
            System.out.println("Dog is same as Animal");
        }else{
            System.out.println("Dog is not same as Animal");
        }

        Animal refAnimal = (Animal) D;
        System.out.println("RefAnimal: " + refAnimal);
        refAnimal.speak();
        Cat C = new Cat("Gray", 3, "ciamowa", "floppy");
        System.out.println("C: " + C);
        C.speak();
        refAnimal = (Animal)C;
        System.out.println("RefAnimal: " + refAnimal);
        refAnimal.speak();
        /*
        D = (Dog) refAnimal; //Illegal casting
        System.out.println("D: " + D);
        D.speak();
         */
        Cat C1 = (Cat) refAnimal;
        System.out.println("C1: " + C1);
        C1.speak();
        /*
        D = (Dog) A; //Illegal cast, cannot make a Dog out of Animal
        //but you can me Animal out of Dog
        System.out.println("A: " + A);
        A.speak();
         */

    }
}
