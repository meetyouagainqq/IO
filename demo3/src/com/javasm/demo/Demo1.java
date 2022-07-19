package com.javasm.demo;

import java.io.*;


/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月09日 9:36
 * @description
 */
public class Demo1 {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile= new File("src/filetest/demo.txt");
        File outputFile = new File("src/filetest/demo1.txt");
        FileInputStream inputStream;
        FileOutputStream outputStream;
        try {
            inputStream=new FileInputStream(inputFile);
            byte[] bytes=new byte[(int) inputFile.length()];
            inputStream.read(bytes);
            String str = new String(bytes);
            outputStream=new FileOutputStream(outputFile,true);
            byte[] bytes1 = str.getBytes();
            outputStream.write(bytes1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
