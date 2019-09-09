package com.stackroute;
public class User {
    public User() {
    }
    private String fullName;
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    public User(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public int setAge(int age) {
        this.age = age;
        return age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    void CheckAge(){
        if (age > 100 || age < 0)
        {
            System.out.println("Invalid age !");
        }
    }
    int isValidAge(){
        if (age > 18 && age < 60){
            System.out.println("Age : " +age);
            return age;
        }
        else{
            System.out.println("Not a valid age.");
            return Integer.parseInt(null);
        }
    }
    String getFullName(String firstName, String lastName){
        fullName = firstName + " " + lastName;
        return fullName;
    }
}