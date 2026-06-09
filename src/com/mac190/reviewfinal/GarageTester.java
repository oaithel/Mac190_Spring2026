package com.mac190.reviewfinal;

public class GarageTester {
    public static void main(String[] args) {
        //Create car1 a Toyota Corolla with 12 gallons tank and 30 mpg, display it
        Car car1 = new Car("Toyota", "Corolla", 12, 30);
        System.out.println("car1: " + car1);
        //Create car2 another Toyota Corolla with 8 gallons tank and 20 mpg, display it
        Car car2 = new Car("Toyota", "Corolla", 8, 20);
        System.out.println("car2: " + car2);
        //create a combined car that is a sum of the two previous cars, display it
        Car car3 = Car.add(car1, car2);
        System.out.println("car3: " + car3);
        //display the range of each car
        System.out.println("car3 range: " + car3.getRange());
        //create an electric scooter "Xiaomi", "Pro"with battery capacity 1.5 and efficiency of 18
        ElectricScooter E1 = null;
        try {
            E1 = new ElectricScooter("Xiaomi", "Pro", 1.5, 18);
        }catch(BatteryException e){
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("E1: " + E1);
        //create an electric scooter "Segway", "Ninebot"battery capacity 2.0 and efficiency of 22
        //display both
        ElectricScooter E2 = null;
        try {
            E2 = new ElectricScooter("Segway", "Ninebot", 2, 22);
        }catch(BatteryException e){
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("E2: " + E2);
        //create a combined (sum) of the two electric scooters, display it
        ElectricScooter E3 = ElectricScooter.add(E1, E2);
        System.out.println("E3: " + E3);
        //create an ElectricScooter that should trigger a checked BatteryException
        try{
            ElectricScooter E4 = new ElectricScooter("ssda", "sasaasd", -10, 23);
        } catch (BatteryException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        //create car3 a Toyota Camry with 15 gallon tank and 28mpg range
        car3 = new Car("Toyota", "Camry", 15, 28);
        System.out.println("car3: " + car3);
        //use an interface Addable to create a hybrid car that is a sum of car1 and car3, display it.
        Addable hybrid = car1.add(car3);
        System.out.println("hybrid: " + hybrid);
        //In a try-catch block, use the interface Addable to try to create a sum of two objects
        //which will trigger an IllegalArgumentException, catch the exception and show it.
        try{
            Addable hynrid2 = car1.add(E1);
        }catch (Exception e){
            System.out.println("Exception: " + e.getMessage());

        }
    }
}
