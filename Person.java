package Baitap2;
import java.util.Scanner;

public class Person {
    protected String name;
    protected int age;
    protected String address;

    Scanner sc = new Scanner(System.in);
    public Person() {
    }


    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Address: " + this.address);
    }
    public void Info(){
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Age: ");
        age = sc.nextInt();
        System.out.println("Address: ");
        address = sc.nextLine();
    }
    @Override
    public String toString() {
        return String.format("%15s%7d%12s%5f", getName(), getAge(), getAddress());
    }
}
