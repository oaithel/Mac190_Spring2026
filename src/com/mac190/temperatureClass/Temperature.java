package com.mac190.temperatureClass;

public class Temperature {
    double inTemperature;

    public void toCelcius(){
        //inTemperature is supposed to be in Fahrenheit we turn it into celcius
        double celcius = (inTemperature - 32) * 5.0 / 9.0;
        System.out.println(inTemperature + " in fahenheit is " + celcius + " in celcius");
    }
    public void toFahrenheit(){
        double fahrenheit = inTemperature * 9.0 / 5.0 + 32;
        System.out.println(inTemperature + " in celcius is " + fahrenheit + " in fahrenheit");

    }

}
