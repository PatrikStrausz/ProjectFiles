package sk.itsovy.strausz.ProjectFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    public void printJoke(){
        try{
            File myFile = new File("C:\\Users\\Boris\\Desktop\\joke.txt");
            Scanner myReader = new Scanner(myFile); // vytvori scanner ktory prejde cely file
            while (myReader.hasNextLine()){ // pokial ma text dalsi riadok
                String data = myReader.nextLine(); // ulozi riadok do data
                System.out.println(data); // vypise riadok
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }


    public void printFileInfo(){
        File myFile = new File("C:\\Users\\Boris\\Desktop\\joke.txt");
        if(myFile.exists()){
            System.out.println("File name: "+ myFile.getName() + "\n"+
            "Absolut path: " +myFile.getAbsolutePath() +"\n" +
            "Size: " + myFile.length() + "\n" +
            "Readable: " +myFile.canRead() ) ;
        }else{
            System.out.println("File not found");
        }


    }
}
