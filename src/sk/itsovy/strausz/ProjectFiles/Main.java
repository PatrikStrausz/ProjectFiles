package sk.itsovy.strausz.ProjectFiles;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	ReadFile file = new ReadFile();
//	file.printJoke();
//        System.out.println();
//	file.printFileInfo();
//	file.copyFile("C:\\Users\\Boris\\Desktop\\vstup.txt");
//        file.dictation("C:\\Users\\Boris\\Desktop\\diktat.txt", "C:\\Users\\Boris\\Desktop\\diktat_copy.txt");


//        System.out.println(file.printAvg("C:\\Users\\Boris\\Desktop\\number.txt"));
        file.sortNum("C:\\Users\\Boris\\Desktop\\number2.txt");
////        file.test1("C:\\Users\\Boris\\Desktop\\output.txt");
//        file.test2("C:\\Users\\Boris\\Desktop\\output2.txt");

    }
}
