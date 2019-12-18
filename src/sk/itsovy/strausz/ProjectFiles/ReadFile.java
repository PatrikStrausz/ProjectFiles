package sk.itsovy.strausz.ProjectFiles;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFile {

//    public void printJoke() {
////        try {
////            File myFile = new File("C:\\Users\\Boris\\Desktop\\java_file\\joke.txt");
////            Scanner myReader = new Scanner(myFile); // vytvori scanner ktory prejde cely file
////            while (myReader.hasNextLine()) { // pokial ma text dalsi riadok
////                String data = myReader.nextLine(); // ulozi riadok do data
////                System.out.println(data); // vypise riadok
////            }
////            myReader.close();
////        } catch (FileNotFoundException e) {
////            e.printStackTrace();
////        }
////
////
////    }
////
////
////    public void printFileInfo() {
////        File myFile = new File("C:\\Users\\Boris\\Desktop\\java_file\\joke.txt");
////        if (myFile.exists()) {
////            System.out.println("File name: " + myFile.getName() + "\n" +
////                    "Absolut path: " + myFile.getAbsolutePath() + "\n" +
////                    "Size: " + myFile.length() + "\n" +
////                    "Readable: " + myFile.canRead());
////        } else {
////            System.out.println("File not found");
////        }
////
////
////    }
////
////    public void copyFile(String sourceFile) {
////        String destFile = "C:\\Users\\Boris\\Desktop\\java_file\\vstup_copy.txt";
////
////        try {
////
////            File src = new File(sourceFile);
////            File dest = new File(destFile);      // skopiruje text z jedneho priecinku do druheho
////            FileWriter destination = new FileWriter(dest);
////            Scanner myReader = new Scanner(src);
////
////            while (myReader.hasNextLine()) {
////                String data = myReader.nextLine();
////                destination.write(data.toUpperCase());
////
////            }
////            myReader.close();
////            destination.close();
////
////        } catch (FileNotFoundException e) {
////            e.printStackTrace();
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////    }

//    public int dictation(String sourceFile, String target) {
//        sourceFile = "C:\\Users\\Boris\\Desktop\\java_file\\diktat.txt";    // ak je v slove i/y vymeni ich za _
//        target = "C:\\Users\\Boris\\Desktop\\java_file\\diktat_copy.txt";
//        int count = 0;
//        try {
//            File src = new File(sourceFile);
//            File dest = new File(target);
//            FileWriter destination = new FileWriter(dest);
//            Scanner myReader = new Scanner(src);
//
//
//            while (myReader.hasNextLine()) {
//                String data = myReader.nextLine();
//
//
//                for (int i = 0; i < data.length(); i++) {
//                    if (data.equals("i") || data.equals("y")) ;
//                    count++;
//
//                }
//
//                char[] text = data.toCharArray();
//                for (int i = 0; i < data.length(); i++) {
//                    if (text[i] == 'i') {
//                        text[i] = '_';
//                        count++;
//                    }
//                    if (text[i] == 'I') {
//                        text[i] = '_';
//                        count++;
//                    }
//                    if (text[i] == 'y') {
//                        text[i] = '_';
//                        count++;
//                    }
//                    if (text[i] == 'Y') {
//                        text[i] = '_';
//                        count++;
//                    }
//                    destination.write(text[i]);
//
//                }
//
//
//            }
//            myReader.close();
//            destination.close();
//
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return count;
//
//
//    }

//    public double printAvg(String sourceFile) {
//        sourceFile = "C:\\Users\\Boris\\Desktop\\java_file\\number.txt";
//        double sum = 0;
//        int count = 0;
//        try {
//            File src = new File(sourceFile);
//
//
//            Scanner myReader = new Scanner(src);
//
//            while (myReader.hasNextLine()) {
//
//                int number = myReader.nextInt();
//
//                sum += number;
//                count++;
//
//
//            }
//            myReader.close();
//
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return sum / count;
//    }

    public void sortNum(String sourceFile) {
        int count = 0;
        try {
            FileReader fr = new FileReader(sourceFile);
            BufferedReader br = new BufferedReader(fr);
            int temp;
            while ((temp = br.read()) != -1) {
                char c = (char) temp;
                if (c == ' ' || c == ',') {
                    continue;
                }
                count++;
            }
            fr.close();
            br.close();

            fr = new FileReader(sourceFile);
            br = new BufferedReader(fr);
            int[] arr = new int[count];
            count = 0;
            while ((temp = br.read()) != -1) {
                char c = (char) temp;
                if (c == ' ' || c == ',') {
                    continue;
                }
                arr[count] = Character.getNumericValue(c);
                count++;
            }
            fr.close();
            br.close();

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            String str = Arrays.toString(arr);
            System.out.println(str);
            FileWriter fw = new FileWriter("C:\\Users\\Boris\\Desktop\\java_file\\number2.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(str);
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

//    public void sort2(String sourFile) throws IOException {
//        File src = new File(sourFile);
//        FileWriter writer = new FileWriter(sourFile);
//
//
//        int arr[] = {20, 40, 50, 60, 10};
//        int len = arr.length;
//        for (int i = 0; i < len; i++) {
//            writer.write(arr[i] + "\t" + "");
//        }
//        writer.write("|");
//        for (int i = 0; i <= arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//
//        }
//
//        for (int i = 0; i < len; i++) {
//            writer.write(arr[i] + "\t" + "");
//        }
//
//
//        writer.close();
//
//    }

    public void analyse(String sourceFile) throws FileNotFoundException { //zisti kolko znakov obsahuje text


        int[] arr = new int[96];
        for (int temp : arr) {
            temp = 0;
        }

        BufferedReader myReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(sourceFile)), Charset.forName("UTF-8")));

        int c;
        try {
            while ((c = myReader.read()) != -1) {

                char character = (char) c;
                if (c >= 32 && c <= 127) {
                    arr[c - 32]++;
                }

            }
            for (int i = 0; i < 95; i++) {
                System.out.println((char) (i + 32) + " : " + arr[i]);
            }
            myReader.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void encrypt(String sourceFile, String targetFile) throws IOException { // zasifruje text s posunom o tri znaky


        FileWriter fr = new FileWriter(targetFile);
        BufferedReader myReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(sourceFile)), Charset.forName("UTF-8")));
        int c;
        try {
            while ((c = myReader.read()) != -1) {

                char z = (char) c;

                if (Character.isDigit(z)) {
                    z += 3;
                    if (z > '9') ;
                    z = (char) (z - 10);
                }

                if (Character.isLowerCase(z)) {
                    z += 3;
                    if (z > 'z') {
                        z = (char) (z - 26);
                    }
                }

                if (Character.isLowerCase(z)) {
                    z += 3;
                    if (z > 'Z') {
                        z = (char) (z - 26);
                    }
                }
                System.out.print(z);
                fr.write(z);

            }

            myReader.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

