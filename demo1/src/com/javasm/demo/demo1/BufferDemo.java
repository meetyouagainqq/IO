package com.javasm.demo.demo1;

import java.io.*;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月08日 20:17
 * @description
 */
public class BufferDemo {
    public static void main(String[] args) throws FileNotFoundException {

    }

//    private static void demo2() throws FileNotFoundException {
//
//        String path = "D:\\ideaIU-2020.1.1.exe";
//        BufferedInputStream bufferedInputStream= new BufferedInputStream(new FileInputStream(path));
//        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(new FileOutputStream("E:\\test.exe"));
//
//        try (bufferedInputStream;bufferedOutputStream) {
//            byte[] bytes = new byte[9024];
//            int length;
//            while ((length = bufferedInputStream.read(bytes)) != -1) {
//               bufferedOutputStream.write(bytes, 0, length);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

}

//    private static void demo1() throws FileNotFoundException {
//        String path = "D:\\ideaIU-2020.1.1.exe";
//        InputStream inputStream = new FileInputStream(path);
//        FileOutputStream outputStream = new FileOutputStream("E:\\test.exe");
//        try (inputStream; outputStream) {
//            byte[] bytes = new byte[9024];
//            int length;
//            while ((length = inputStream.read(bytes)) != -1) {
//                outputStream.write(bytes,0,length);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

