package com.javasm.demo;

import java.io.Serializable;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月09日 10:58
 * @description
 */
public class Student implements Serializable {
    private Integer number;
    private String name;
    private String sex;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Student() {
    }

    public Student(Integer number, String name, String sex) {
        this.number = number;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
