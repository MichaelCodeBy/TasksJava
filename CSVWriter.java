package com.company;


import java.io.*;
import java.util.Scanner;

public class CSVWriter {
    public static void main(String[] args) {
        String myFile = "C:\\Users\\ИМЯ ВАШЕГО ПК\\Desktop\\MyFile.csv";
        //  myWriter(myFile);
        //  myReader(myFile);

    }

    public static void myWriter (String str){
        try(PrintWriter printWriter = new PrintWriter(str)){
            printWriter.write(1 + ",");
            printWriter.write("Petrov"+ ",");
            printWriter.write("Vasiliy"+ ",");
            System.out.println("Done");

        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
    public static void myReader (String read){
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(read))){
            String line = "";
            while ((line=bufferedReader.readLine()) != null ){
                System.out.println(line); // просто печать
                String [] temp = line.split(","); // сохранить в массив

                for(String result:temp){
                    System.out.println(result);
                }
            }

        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }
        catch (IOException e){
            System.out.println("File not close");
            e.printStackTrace();
        }
    }
}

//что - то вроде такого
/*
class ReaderForFile {
    public static void main(String[] args) {
        String adres = "C:\\Users\\ИМЯ ПК\\Desktop\\2.txt";
        try (Scanner scanner = new Scanner(new FileReader(adres))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println(e);
        }
    }
}
*/