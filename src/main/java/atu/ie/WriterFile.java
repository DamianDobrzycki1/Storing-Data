package atu.ie;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterFile {
    public static void main(String[] args) {
        String fileName = "NewFile.txt";

        File myFile = new File("MyFile.txt");
        System.out.println("My File is located at " + myFile.getAbsolutePath());
        String content = "Details to write";
        try {
            FileWriter myWriter = new FileWriter(myFile,true);
            myWriter.write("Yesterday was Monday");
            myWriter.close();
        } catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
