package com.task3;

public class Employee extends Person{

    int hireDate;
    String companyName;
    double salary;
    int age;

    public Employee(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double salary) {
        super(firstName, lastName, birthdayYear);
        this.hireDate = hireDate;
        this.companyName = companyName;
        this.salary = salary;
    }

    @Override
    public int getAge() {
        return 2020-birthdayYear;

    }

    public String getJobSeniority(){
        return "Senior";
    }

    public double getSalary(){
        return salary;
    }

}
