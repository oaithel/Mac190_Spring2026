package com.mac190.files;

import java.io.File;
import java.util.Scanner;

/*
Using notepad create a file data.txt where the data in the file
has the following form:
12313  john  Second  23.4
33434  moe   thatOne 10.45
34535  Lee   Ping    12.5
....


Write a java program in which you request the input file name.
Create a new file with the same name with _out added to it.
For instance if the name is data.txt, then the output file
will be data_out.txt
The data in the ouput file will be the same as in the input file
except that it organized in the following way:

F:john  L:Second    T:23.4  S:12313
F:moe   L:thatOne   T:10.45 S:33434
F:Lee   L:Ping  T:12.5  S:34535
 */
public class PracticeFiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input file name:");
        String fileName = sc.nextLine();
        File inFile = new File("C:\\Users\\b331-prof\\Documents\\ProfOmar\\MAC190_Spring2026\\TestDir\\"+fileName);
        int indexDot = fileName.indexOf(".");
        String outFileName = fileName.substring(0,indexDot) + "_out.txt";
        System.out.println("infile: " + fileName + " outFile: " + outFileName);
    }
}
