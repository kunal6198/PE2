package com.stackroute;
import java.util.Scanner;
public class Member {
    public Member() {
    }
    String name;
    int age;
    double salary;
    public Member(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    String displayDetails() {
        String str = name + age + salary;
        return str;
    }
}
