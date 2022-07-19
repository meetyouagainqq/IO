package com.javasm.demo.demo1;

import java.io.*;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月08日 19:25
 * @description
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
       demo7();
    }

    private static void demo7() {

    }

//    private static void demo6() throws FileNotFoundException {
//        String filePath="src/demo.txt";
//        InputStream inputStream=new FileInputStream(filePath);
//        try (inputStream){
//            byte[] bytes=new byte[1024];
//            int text;
//            while ((text=inputStream.read(bytes))!=-1){
//                System.out.println(new String(bytes,0,3));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//

//    private static void demo5() throws FileNotFoundException {
//        String filePath="src/demo.txt";
//        InputStream inputStream=new FileInputStream(filePath);
//        try (inputStream){
//            byte[] bytes=new byte[1024];
//            int text;
//            while ((text=inputStream.read(bytes))!=-1){
//                System.out.println(new String(bytes,0,text));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    private static void demo4() throws FileNotFoundException {
//        String filePath="src/demo.txt";
//        InputStream inputStream=new FileInputStream(filePath);
//        try (inputStream){
//            int text;
//            while ((text=inputStream.read())!=-1){
//                System.out.println((char) text);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//
//    private static void demo3() throws FileNotFoundException {
//        String filePath="src/demo.txt";
//        InputStream inputStream=new FileInputStream(filePath);
//        try (inputStream;){
//            int text;
//            while ((text=inputStream.read())!=-1){
//                System.out.println((char) text);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    private static void demo2() {
//        try (InputStream inputStream = new FileInputStream("src/demo.txt");) {
//            int text;
//            while ((text = inputStream.read()) != -1) {
//                System.out.println((char) text);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    private static void demo1() throws IOException {
//        String filePath="src/demo.txt";
//        InputStream inputStream=null;
//         try {
//              inputStream=new FileInputStream(filePath);
//              int length;
//              while ((length=inputStream.read())!=-1){
//                  System.out.println((char) length);
//              }
//         } catch (IOException e) {
//             e.printStackTrace();
//         }finally {
//             try {
//                 if(inputStream!=null){
//                     inputStream.close();
//                 }
//             } catch (IOException e) {
//                 e.printStackTrace();
//             }
//         }
//    }
}
