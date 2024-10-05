package org.example;

import java.io.*;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        //usingFileAndScanner();
        fileWritter();
    }
    public static void usingFileReaderAndBufferdReader() throws IOException {
        FileReader fr = new FileReader("/Users/kelvinvictor/IdeaProjects/RestAssured/log.txt");
        BufferedReader br = new BufferedReader(fr);
        String str;
        while ((str = br.readLine())!= null){
            System.out.println(str);
        }
        br.close();
    }
    public static void usingFileAndScanner() throws FileNotFoundException {
        File file = new File("/Users/kelvinvictor/IdeaProjects/RestAssured/log.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
    public static void fileWritter() throws IOException {
        FileWriter fw = new FileWriter("/Users/kelvinvictor/IdeaProjects/RestAssured/log.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Adding these lines here");
        bw.close();
    }
}
