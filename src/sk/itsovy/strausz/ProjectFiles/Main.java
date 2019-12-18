package sk.itsovy.strausz.ProjectFiles;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	ReadFile file = new ReadFile();
//	file.printJoke();
//        System.out.println();
//	file.printFileInfo();
//	file.copyFile("C:\\Users\\Boris\\Desktop\\java_file\\vstup.txt");
//        file.dictation("C:\\Users\\Boris\\Desktop\\java_file\\diktat.txt", "C:\\Users\\Boris\\Desktop\\java_file\\diktat_copy.txt");


//        System.out.println(file.printAvg("C:\\Users\\Boris\\Desktop\\number.txt"));
//        file.sortNum("C:\\Users\\Boris\\Desktop\\java_file\\number3.txt");
////        file.sort2("C:\\Users\\Boris\\Desktop\\java_file\\output.txt");
//        file.test2("C:\\Users\\Boris\\Desktop\\java_file\\output2.txt");
//        file.analyse("C:\\Users\\Boris\\Desktop\\java_file\\analyser.txt");
        file.encrypt("C:\\Users\\Boris\\Desktop\\java_file\\encrypt.txt", "C:\\Users\\Boris\\Desktop\\java_file\\encrypt2.txt");

    }
}
