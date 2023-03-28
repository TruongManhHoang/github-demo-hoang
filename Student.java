package Baitap2;
import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {
    private double gpa;
    
    public Student(){
        Scanner sc = new Scanner(System.in);
    }
    public Student(String name, int age, String address,double gpa) {
        super(name, age, address);
        this.gpa = gpa;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public void display(){
        super.display();
        System.out.println("GPA: " + gpa);
    }
    public void Info1(){
        super.Info();
        System.out.print("GPA: ");
        this.gpa = sc.nextDouble();
    }
    @Override
    public String toString() {
        return String.format("%15s%7d%12s%5f", getName(), getAge(), getAddress(), getGpa());
    }
}
