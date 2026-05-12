package com.mac190.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Editor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the file name: ");
        String path = "C:\\Users\\b331-prof\\Documents\\ProfOmar\\MAC190_Spring2026\\TestDir\\";
        String fileName = path+sc.nextLine();
        File outFile = new File(fileName);
        if(outFile.exists()){
            System.out.println("The file already exist. Do you want to delete it?[y/n]:");
            char answer = sc.next().charAt(0);
            if(Character.toLowerCase(answer) == 'n'){
                String dummy = sc.nextLine();
                System.exit(0);
            }
        }
        //create a FileWriter ..etc
        try{
            FileWriter fw = new FileWriter(outFile);
            BufferedWriter bw = new BufferedWriter(fw);
            System.out.println("Enter your text, end it with . on empty line:  ");
            String line = sc.nextLine();
            //trim() removes the spaces before and after
            while(!line.trim().equals(".")){
                //write the line to the file
                bw.write(line+"\n");
                //read a new line
                line = sc.nextLine();
            }
            bw.close();
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("Caught exception: " + e.getMessage());
        }

    }
}
