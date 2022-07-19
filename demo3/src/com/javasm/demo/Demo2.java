package com.javasm.demo;

import java.io.File;
import java.util.Scanner;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月09日 10:00
 * @description
 */
public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文件路径:");
        file(scanner.nextLine());
    }

    private static void file(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            //查处文件具体路径
            work(fileName);
        } else {
            System.out.println("路径不存在");
        }
    }

    private static void work(String fileName) {
        File file = new File(fileName);
        if (file.isFile()) {
            System.out.println("文件名为:" + fileName);
            return;
        } else if (file.exists()){
            File[] files = file.listFiles();
            for (File fileTest:files){
                System.out.println(fileTest);
                work(fileTest.getName());
            }
        }
    }
}
