package Baitap2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        ArrayList<Student> list1 = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    do{
        System.out.print("Nhap so sinh vien: ");
        n = sc.nextInt();
    }while(n < 0);
    for (int i = 0; i < n; i++) {
        Student student = new Student();
        student.Info1();
        list1.add(student);

        }
    ArrayList<Teacher> list2 = new ArrayList<>();
    for(int i = 0; i < n; i++) {
        Teacher teacher = new Teacher();
        teacher.Info2();
        list2.add(teacher);
    }
        double temp = 0;
        Student gpaMax = null;
        for(Student student : list1){
            if(student.getGpa() > temp){
                temp = student.getGpa();
                gpaMax = student;
            }
        }
       int temp1 = 0;
       Teacher salaryMax = null;
       for(Teacher teacher : list2){
        temp1 = teacher.getSalary();
        salaryMax = teacher;
       }
       System.out.print("Student co GPA cao nhat: ");
       gpaMax.display();
       System.out.print("Teacher co Salary cao nhat: ");
       salaryMax.display();
    }
}
       