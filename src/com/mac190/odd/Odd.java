package com.mac190.odd;
/*
Design an class Odd that has the following properties:
- One integer member variable num that is odd at all times.
- getter to return the value of num
- setter that accepts a value and sets num to that value if it's odd otherwise it sets
it to the next odd.
- toString that returns the object in the form "num: value"
- method int add(int a) that returns the sum of num and a
- method int add(Odd d) that returns the sum of num and the num of d
 */
public class Odd {
    private int num =1;

    //A constructor is a method without a return type that allows
    //to construct objects with initial attributes/values
    //It's a public method with the same name as the class
    //The default constructor is the constructor that does not has any input paremater
    public Odd(){
        num = 1;
    }
    public Odd(int n){
        this.setNum(n);
    }
    public int getNum(){
        return num;
    }
    public void setNum(int n){
        if(n % 2 == 0){
            n++;
        }
        //n is odd here
        num = n;
    }
    public String toString(){
        return "num: " + num;
    }
    /*
    Overlading is using the same name for two different methods. In this case
    the two add methods are different but they have the same name. You can do that
    as long as the type of the input parameters is different or the number of
    parameters is different. You cannot overload solely on the return type.
     */
    public int add(int a){
        return a + num;
    }
    //public int add(int a) is not allowed because the difference is only the return typ
    public int add(Odd a){
        return a.num + num;
    }

    //design a method sum that returns an Odd Object that is a sum of this object
    //and the input Odd object
    public Odd sum(Odd input){
        //We have three Odd objects: input, this and the returned object as the sum
        Odd result = new Odd(this.num + input.num);
        return result;
    }
    public Odd sum(int a){

    }
}

