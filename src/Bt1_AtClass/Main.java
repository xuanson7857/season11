package Bt1_AtClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.CharSequence.compare;

public class Main {
    static List<Student> students = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("****** Quản lí học sinh ******");
            System.out.println("Chon 1_ Thêm vào danh sách sinh viên");
            System.out.println("Chon 2_ Hiển thị ra danh sách sinh viên");
            System.out.println("Chon 3_ Sắp xếp lại danh sách theo thứ tự alphabet");
            System.out.println("Chon 4_ Thoát khỏi chương trình");
            System.out.println("*** Mời nhập lựa chọn của bạn ***");
            try {
                int choice = config.getValidateInteface();
                handleMenu(choice);
            } catch (Exception e) {
                System.err.println("___ Sai dinh dang, moi nhap lai ___");
            }
        }
    }

    private static void handleMenu(int choice) {
        switch (choice) {
            case 1:
                addStudent();
                break;
            case 2:
                showStudent();
                break;
            case 3:
                subStudent();
                break;
            case 4:
                System.out.println("thoát");
                break;
            default:
                System.exit(1);
                break;
        }
    }

    private static void addStudent() {
        System.out.println("nhap so luong hoc sinh can them: ");
        try {
            int count = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < count; i++) {
                Student student = new Student();
                student.inputdata();
                students.add(student);
            }
        } catch (Exception e) {
            System.err.println("nhap sai dinh dang,moi nhap lai");
        }
    }

    private static void showStudent() {
        System.out.println("danh sach thu vien: ");
        students.forEach(student -> {
            student.displayData();
        });
    }

    private static void subStudent() {
        students.sort((student1, student2) -> compare(student1.getName(), student2.getName()));
        System.out.println("sap xep theo thu tu alphab thanh cong");
    }
}
