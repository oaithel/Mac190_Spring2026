package com.mac190.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
Input files are files that we open and retrieve data from.
You can use either FileReader wrapped in a BufferedReader or Scanner
and use the scanner just as you are using it for the keyboard
 */
public class InputFiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input file name:");
        String fileName = sc.nextLine();
        File inFile = new File("C:\\Users\\b331-prof\\Documents\\ProfOmar\\MAC190_Spring2026\\TestDir\\"+fileName);
        if(!inFile.exists()){
            System.out.println(fileName + " does not exist!");
            System.exit(1);
        }
        try{
            /* Using a BufferedReader
            //create a FileReader
            FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr);
            //read line by line and display the lines.
            String line = br.readLine();
            int i =0;
            while(line != null){
                System.out.println("l" + (i++) + ": " + line);
                line = br.readLine();
            }
            br.close()
             */
            //Using Scanner instead of a BufferedReader
            FileReader fr = new FileReader(inFile);
            Scanner inS = new Scanner(fr);
            int i = 0;
            while(inS.hasNextLine()){
                String line = inS.nextLine();
                System.out.println("l" + (i++) + ": " + line);
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
