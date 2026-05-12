package com.mac190.files;

import java.io.*;

/*
A file is a memory on some oxiliary memory storage that's there
even if the computer is turned off. Hard drive etc..
What is a directory? A way of organizing files, it's not storage.
The File object in java, allows you to manipulate files and directories
but not to read or write to them. You can use it to find if a file
exists, to change its name, to change access rights to it,
to delete it ...etc
Absolute path: An absolute path is a location where the file is
including the drive and all the directories.
C:\Users\b331-prof\Documents\ProfOmar\MAC190_Spring2026
relative path: Is a location based on the current directory. "../"
 means go back one directory
..\ProfOmar\MAC190_Spring2026
 */
/*
Modify the program so that you ask the user input the file name he/she
wants to create.
Create a File object with the file name..
Make sure the file exists.
crate FileWriter and a BufferedWriter and ask the user
to input a text (multiple lines of text) and end it with
 a dot on an empty line.
 The text should be saved into the file without the last dot.
 Example:
 Enter file name: C:\Users\b331-prof\Documents\ProfOmar\MAC190_Spring2026\TestDir\test.txt
 Enter your text, end it with . on an empty line:
 Hello,
 this is the text and rdreqtqert
 qetqetqrde
 SEETRT
 . SDGFGFWEIUER4Yfgyhfgh
 .
 bye the text is saved.

 */
public class OutputFiles {
    public static void main(String[] args) {
        File myFile = new File("C:\\Users\\b331-prof\\Documents\\ProfOmar\\MAC190_Spring2026");
        System.out.println("Is myFile a file? " + myFile.isFile());
        System.out.println("Is it a directory? " + myFile.isDirectory());
        System.out.println("Path: " + myFile.getAbsolutePath());
        System.out.println("path: " + myFile.getPath());
        String[] names = myFile.list();
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
        //create a directory
        myFile = new File("C:\\Users\\b331-prof\\Documents\\ProfOmar\\MAC190_Spring2026\\TestDir");
        if(myFile.mkdir()){
            System.out.println("Made the directory: " + myFile.getPath());
        }else{
            System.out.println("Couldn't mke the directory");
        }
        //Create a file and write some text to it.
        //I use FileReader, then use that in a BufferedReader to write
        //to the file.
        try {
            FileWriter fw = new FileWriter("C:\\Users\\b331-prof\\Documents\\ProfOmar\\MAC190_Spring2026\\TestDir\\test.txt");

            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("This is the first line \n");
            bw.write("This is the second line \n");
            bw.write("This is the third line.");
            bw.close();
        }catch(IOException e){
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
