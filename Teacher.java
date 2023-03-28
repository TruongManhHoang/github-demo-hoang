package Baitap2;

import java.util.Scanner;

public class Teacher extends Person{
    private int salary;

    public Teacher(String name, int age, String address,int salary) {
        super(name, age, address);
        this.salary = salary;
    }


    public Teacher() {
    }


    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void display(){
        super.display();
        System.out.println("Salary: " + salary);
    }
    public void Info2(){
        Scanner sc = new Scanner(System.in);
        super.Info();
        System.out.print("Salary: ");
        this.salary = sc.nextInt();
    }
    @Override
    public String toString() {
        return String.format("%15s%7d%12s%5f", getName(), getAge(), getAddress(), getSalary());
    }
}
