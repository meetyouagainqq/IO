package com.javasm.demo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月09日 10:42
 * @description
 */
public class Demo4 {
    public static void main(String[] args) {
        register();
        login();
    }

    private static void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的账号:");
        String userName = scanner.nextLine();
        System.out.println("请输入你的密码:");
        String password = scanner.nextLine();
        try (FileReader reader = new FileReader("src/filetest/account.txt")) {
            Properties properties = new Properties();
            properties.load(reader);
            String msg = (properties.getProperty(userName).equals(password)) ? "登陆成功" : "账号或密码错误";
            System.out.println(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的注册账号:");
        String userName = scanner.nextLine();
        System.out.println("请输入你的注册密码:");
        String password = scanner.nextLine();
        try (FileWriter writer = new FileWriter("src/filetest/account.txt", true)) {
            writer.write(userName + "=" + password + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
