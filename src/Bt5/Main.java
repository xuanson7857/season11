package Bt5;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong tu: ");
        int input = Integer.parseInt(scanner.nextLine());
        Stack<String> list = new Stack<>();
        for (int i = 0; i < input; i++) {
            System.out.println("nha tu thu " + i);
            String numberOfWord = scanner.nextLine();
            list.push(numberOfWord);
        }
        Collections.reverse(list);
        String numberOfWord = "";
        for (String s : list) {
            numberOfWord += (" " + s);
        }
        System.out.println(numberOfWord.trim());
    }
}
