package Bt2_Stack;

import java.util.Scanner;
import java.util.Stack;

import static java.lang.CharSequence.compare;

public class StackMain {
    public static void main(String[] args) {
        Stack<Student> students = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong hoc sinh can them");
        int studentCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < studentCount; i++) {
            Student student = new Student();
            student.inputdata();
            students.add(student);
        }
        System.out.println("danh sach sinh vien: ");
        for (Student student : students) {
            student.displayData();
        }
        students.sort((student1, student2) -> compare(student1.getName(), student2.getName()));
        System.out.println("sap xep anphab thanh cong ");
        for (Student student : students) {
            student.displayData();
        }
    }
}
