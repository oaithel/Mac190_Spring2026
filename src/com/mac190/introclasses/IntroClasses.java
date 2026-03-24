package com.mac190.introclasses;
/*
 A class is a blueprint or a description of objects in terms of data
 and behavior. Data (attributes in case of objects) describe the state of the object
 at a given time and the behavior is shaped through methods (like functions in C++).
 The method act on the object state, by updating the object's data.
 A description of a car would be the class Car. You own car is an object following
 that description.
 To define a class we use the following:
 public class className{
    accessModifier1 type1 variableName1;
    accessModifier2 type12 variableName2;
    ....

    public type1 methodName1(params){
        body of the method

    }
 }

 There are 4 types of access modifiers:
 public: the variable or the method can be accessed by anyone anywhere
 private: can be accessed only within the class and not visible outside the class
 protected: can be accessed within the class and by inherited classes
 default (no specifier): public within the package and private outside the package

To create an object of the class ClassName we use the following:
ClassName objectName = new ClassName();
To access a member variable, if accessible, we use objectName.variableName = 3;
Methods are invoked on objects. Static methods are invoked on both objects and classes
A method belongs to the object. A static method belongs to all objects and you have
one copy.
To invoke a method we use: objectName.methodName(params);
 */
public class IntroClasses {
    public int num;
    public int s;


    public void increment(){
        num++;
    }
    public void print(){
        System.out.println("num: " + num + "  s: " + s);
    }

    public static void main(String[] args) {
        //to create an object InroClasses
        IntroClasses myObj = new IntroClasses();
        //set num to 0 and S = 1
        myObj.num = 0;
        myObj.s = 1;
        //invoke print method
        myObj.print();
        myObj.increment();
        myObj.increment();
        myObj.print();
        //create a second onject IntroClasses. Set num to 3, S to 4

        //print it.

        //increment it twice. print it.

        //assign the second object to the first object.

        //display both objects.

        //increment the first object twice.

        //display both objects. What do you notice?
    }
}
