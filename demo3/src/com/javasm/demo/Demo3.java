package com.javasm.demo;


import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.AnnotatedArrayType;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月09日 10:17
 * @description
 */
public class Demo3 {
    public static void main(String[] args) {
        intputFile();
    }

    private static void intputFile() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatTime = formatter.format(now);
        String answer;
        try (FileWriter fileWriter = new FileWriter("src/filetest/log.txt")) {
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println("请输入字符串:");
                String str = scanner.nextLine();
                fileWriter.write(formatTime + ":" + str + "\n");
                System.out.println("是否继续?y/n");
                answer = scanner.nextLine();
            } while ("y".equals(answer));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
