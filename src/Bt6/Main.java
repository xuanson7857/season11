package Bt6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String str = "Able was I ere I saw Elba";
        if (isCheck(str)) {
            System.out.println("Chuỗi là Palindrome.");
        } else {
            System.out.println("Chuỗi không phải là Palindrome.");
        }
    }

    private static boolean isCheck(String str) {
        // Xóa các ký tự không phải chữ cái và chuyển đổi thành chữ thường
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Tạo một hàng đợi và một ngăn xếp
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Thêm các ký tự vào hàng đợi và ngăn xếp
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            queue.add(c);
            stack.push(c);
        }

        // So sánh từng cặp ký tự trong hàng đợi và ngăn xếp
        while (!queue.isEmpty() && !stack.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                return false; // Không phải chuỗi Palindrome
            }
        }

        return true; // Là chuỗi Palindrome
    }
}
