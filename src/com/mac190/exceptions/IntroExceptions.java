package com.mac190.exceptions;

import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

/*
Exceptions are an elegant way for controlling and dealing with
errors.
There are two kinds of Exceptions in java: Checked and Unchecked exceptions.
Checked Exceptions are exceptions thar require the use of a try and catch block.
There are generally exceptions that are triggered from errors that we can recover,
for instance wrong file name etc...
UnChecked Exceptions are exception that we cannot recover from and do not require the
use of try and catch, because in general, when they happen the program quits: example
nullPointer Exception, RuntimeException ...
 */
public class IntroExceptions {
    public static void throwMeCheckedException(int a) throws Exception {
        if(a < 0){
            System.out.println("a is negative");
        }else{
            throw new MyCheckedException(10, "a is positive");//Exception is a checked one
        }
    }
    public static void throwMeUncheckedException(int a){
        if(a < 0){
            System.out.println("a is negative");
        }else{
            throw new MyUncheckedException(10, "unchecked exception a is poitivie");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = sc.nextInt();
        try {
            throwMeCheckedException(num);
            System.out.println("Bye ....");
        }catch (Exception e){
            System.out.println("Caught Exception: " + e.getMessage());
        }
        //no need for try-catch for unchecked exceptions
        throwMeUncheckedException(num);
    }
}
