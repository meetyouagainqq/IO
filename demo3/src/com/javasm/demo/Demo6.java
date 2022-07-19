package com.javasm.demo;

import java.io.*;
import java.util.*;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月09日 11:36
 * @description
 */
public class Demo6 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/filetest/a.txt");
        if(!file.exists()){
            System.out.println("文件不存在");
        }
        FileInputStream fileInputStream=new FileInputStream(file);
        byte[] bytes = new byte[fileInputStream.available()];
        fileInputStream.read(bytes);
        System.out.println(new String(bytes));
        String str=new String(bytes);
        StringBuilder builder=new StringBuilder(str);
        Set set=new HashSet<>();
        for(int i=0;i<builder.length();i++){
            set.add(builder.charAt(i));
        }
        ArrayList list =new ArrayList();
        for(Object set1:set){
            list.add(set1);
        }
        Collections.sort(list);
        System.out.println(list);
        FileOutputStream outputStream=new FileOutputStream("src/filetest/b.txt");
        list.forEach(str1-> {
            try {
                outputStream.write((char) str1);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        outputStream.flush();
        outputStream.close();
    }
}
