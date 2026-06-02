package com.mac190.strings;
//Write a program in which you prompt the user to enter some text.
//that could be multiple lines, the last line should contain dot only
// Change every letter after a dot in the text to capital letter. Same for letters after
// ! or ?

import java.util.Scanner;

/*
Example: input:
Hi there.    how are you? are you ok? tel me about it. have fun.
Output should be
Hi there. How are you? Are you ok? Tel me about it. Have fun.
 */
public class StringEditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your text, end it with a dot on empty line:");
        String line = sc.nextLine();
        String txt = "";
        line = "" + Character.toUpperCase(line.charAt(0)) + line.substring(1);
        while(!line.trim().equals(".")){
            txt += line + "\n";
            line = sc.nextLine();
        }
       for(int i = 0; i < txt.length(); i++){
           if(txt.charAt(i) == '.' || txt.charAt(i) == '!' || txt.charAt(i) == '?'){
               i++;
               while(i < txt.length() && !Character.isLetter(txt.charAt(i))){
                   i++;
               }
               //either i exceded the length, so nothing is left to parse
               //or we found a letter and make it capital
               if(i < txt.length()){ //we found a letter
                   //break the text into parts
                   txt = txt.substring(0, i) + Character.toUpperCase(txt.charAt(i)) +
                           txt.substring(i+1);
               }
           }
       }
        System.out.println("Your text corrected is: ");
        System.out.println(txt);
    }
}
