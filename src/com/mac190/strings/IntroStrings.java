package com.mac190.strings;
/*
A string is a sequence of characters between double quotes.
String in java is a class. You should never compare string using
==. You should use .equals or Object.equals
String nameString = "example";
 */
public class IntroStrings {
    public static void main(String[] args) {
        String str1 = new String("Java is fun");
        String str2 = new String("Java is fun");
        if(str1 == str2){
            System.out.println("The strings are equal");
        }else{
            System.out.println("The strings are not equal");
        }
        if(str1.equals(str2)){
            System.out.println("Now: The strings are equal");
        }else{
            System.out.println("Now: The strings are not equal");
        }
        //charAt(index) returns the character at index
        System.out.println("The character at index 2 in str1 is: " + str1.charAt(2));
        System.out.println("str1 contains va? " +str1.contains("va") );
        System.out.println("Index of fun in str1 = " + str1.indexOf("fun"));
        String lastPart = str1.substring(str1.indexOf("fun"));
        System.out.println("lastPart: " + lastPart);
        String firstPart = str1.substring(0,str1.indexOf("fun"));
        System.out.println("firstPart: " + firstPart);
        str2 = "5/25/2026, 34.5, 30.0, 41.2, 39.3, 300003";
        String[] splitted = str2.split(",");
        System.out.println("the string is splitted into " + splitted.length +" strings");
        for(String s : splitted){
            System.out.println(s.trim()); //trim will remove spaces before and after the string
        }
        //converting a string into a double
        double open = Double.parseDouble(splitted[1]);
        System.out.println("open: " + open);

        String str3 = str2.replace("41", "410");
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        //If you want to change str2 to 410 then you have to assign the retuned string to str2
        str2 = str2.replace("41", "410");
        System.out.println("str2: " + str2);
        //change str1 to lower case
        System.out.println("str1 lower: " + str1.toLowerCase());
        System.out.println("str1: " + str1);
        str1 = str1.toUpperCase();
        System.out.println("str1: " + str1);
        str2 = "Java is Hard";
        str1 = "Java is funny";
        if(str1.compareTo(str2) == 0){
            System.out.println("The strings are equal");
        }else if(str1.compareTo(str2) < 0){
            System.out.println("str1 < str2 : " + str1.compareTo(str2));
        }else{
            System.out.println("str1 > str2 : " + str1.compareTo(str2));
        }
        System.out.println("str1+str2: " + str1.concat(str2));

        //Write a program in which you prompt the user to enter some text.
        //that could be multiple lines, the last line should contain dot only
        // Change every letter after a dot in the text to capital letter. Same for letters after
        // ! or ?

        /*
        Example: input:
        Hi there.    how are you? are you ok? tel me about it. have fun.
        Out put should be
        Hi there. How are you? Are you ok? Tel me about it. Have fun.
         */
        if(Character.isLetter(str2.charAt(index))){
            str2 = str2.substring(0, index) + Character.toUpperCase(str2.charAt(index)) +
                    str2.substring(index+1);
        }
    }
}
