package com.javasm.demo.demo2;

import java.io.FileNotFoundException;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月08日 21:14
 * @description
 */
public class FileUploadTest {
    public static void main(String[] args) throws FileNotFoundException {
        String imagePath="D:\\demo1\\upload\\test.jpeg";
        String servePath = FileUtil.getServePath(imagePath);
        System.out.println("servePath:"+servePath);
    }

}
