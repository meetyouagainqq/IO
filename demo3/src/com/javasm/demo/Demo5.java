package com.javasm.demo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月09日 10:57
 * @description
 */
public class Demo5 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list = studentObject();
        inputSerialize(list);
        outputSerialize();
    }

    private static List<Student> studentObject() {
        String answer;
        List<Student> list = new ArrayList<>();
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入学生的学号:");
            int number = scanner.nextInt();
            scanner.nextLine();
            System.out.println("请输入学生的姓名:");
            String name = scanner.nextLine();
            System.out.println("请输入性别:");
            String sex = scanner.nextLine();
            Student student = new Student(number, name, sex);
            list.add(student);
            System.out.println("是否继续？(y/n)");
            answer = scanner.nextLine();
        } while ("y".equals(answer));
        return list;
    }

    private static void inputSerialize(List<Student> list){
        try(ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("src/filetest/student.dat"))) {
              outputStream.writeObject(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void outputSerialize(){
        try (ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("src/filetest/student.dat"))){
         List<Student> list1 = (List<Student>) inputStream.readObject();
         list1.forEach(System.out::println);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
