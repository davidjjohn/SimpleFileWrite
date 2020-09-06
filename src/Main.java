// Simple Java program to illustrate how to write text
// to an output file.
//
// David John
// September 2020

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Main {

    private static PrintWriter myOutPutFile;
    private static FileWriter XXX;
    private static String[] myFriends ={"Joe", "Margie", "Amanda", "Sue", "Owen"};;

    public static void main(String[] args) {

        // file name store in a String
        String myFileName = "out.txt";

        // Open output file
        try {
            myOutPutFile = new PrintWriter(new FileWriter(myFileName));
        } catch (IOException e) {
            System.out.println("Open error on output file <"+myFileName+">");
            System.exit(2);
        }


        // dump all my friends to the output file myOutPutFile
        int count = 0;      // friend counter
        for (String name : myFriends) {
                //myOutPutFile.format("Friend <%d>: %s%n",++count,name);
                myOutPutFile.println(name);
            }


        // close output file
        myOutPutFile.close();


    }

}
