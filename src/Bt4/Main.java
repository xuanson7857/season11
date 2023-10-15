package Bt4;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chỗi đầu vào");
        String input = scanner.nextLine(); // lấy chỗi đầu vào từ bàn phím

        //B1: Tạo một stack rỗng để lưu trữ các dấu ngoặc.
        Stack<Character> stack = new Stack<>();

        //b2: Duyệt từng ký tự trong chuỗi đầu vào.
        for (int i = 0; i < input.length(); i++) {  // duyệt qua từng ký tự trong chuỗi
            char ch = input.charAt(i);                  // lấy từng ký tự để tthao tác
            // B3: Nếu ký tự đang xét là một dấu ngoặc mở (như (, {, [), đưa nó vào stack.
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // B4: Nếu ký tự đang xét là một dấu ngoặc đóng (như ), }, ]), lấy phần tử trên cùng của stack ra và so sánh với dấu ngoặc đóng.
            // Nếu chúng không khớp, chuỗi không đúng. Nếu khớp, tiếp tục xét ký tự tiếp theo.
            else if (ch == ')' || ch == '}' || ch == ']') {  // nếu không đúng ngoặc mở sẽ  kiểm tra có phải ngoặc đóng không, nếu đúng thì chạy khối lệnh trong if
                if (stack.isEmpty()) {                      //  nếu chưa có ngoặc mở mà đã có ngoặc đóng thì sẽ báo sai và dừng chương trình
                    System.out.println("không có cặp ngoặc");
                    return;
                }
                char openBracket = stack.pop();  // tạo biến openBracket để lấy ngoặc mở cuối cùng khỏi stack
                if (!isMatchingBracket(openBracket, ch)) {  // gọi hàm check với biến openBracket, và ngoặc đóng hiện tại.
                    System.out.println("không có cặp ngoặc");  // nếu biến trả về false có nghĩa là cặp ngoặc đóng mở không tương đồng
                    return;
                }
            }
        }
        //B5: Nếu đã duyệt hết chuỗi và stack vẫn còn phần tử, chuỗi không đúng.
        boolean check = stack.isEmpty();
        if (check) {
            System.out.println("có các cặp ngoặc hợp lệ");
        } else System.out.println("không có cặp ngoặc");
    }

    private static boolean isMatchingBracket(char open, char close) {  // hàm kiểm tra cặp ngoặc trùng khớp
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}
