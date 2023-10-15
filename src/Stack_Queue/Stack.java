package Stack_Queue;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    public static void main(String[] args) {

        java.util.Stack<Integer> stackChuoi = new java.util.Stack<Integer>();
        stackChuoi.add(1);
        stackChuoi.add(2);
        stackChuoi.add(3);
        stackChuoi.add(4);
        stackChuoi.add(5);
        System.out.println("stackChuoi " + stackChuoi);

        System.out.println("push" + stackChuoi.push(6));
        System.out.println("stackChuoi1 " + stackChuoi);

        System.out.println("pop" + stackChuoi.pop());       // lay ra phan tu cuoi cung, xoa khoi mang
        System.out.println("stackChuoi1 " + stackChuoi);

        System.out.println("empty " + stackChuoi.empty());  // kiem tra mang rong hay ko
        System.out.println("stackChuoi1 " + stackChuoi);

        System.out.println("search " + stackChuoi.search(2));  // tim theo kieu vao truoc ra sau
        System.out.println("stackChuoi1 " + stackChuoi);

        System.out.println("peek " + stackChuoi.peek());    // tim ra phan tu cuoi, nhung ko xoa khoi mang
        System.out.println("stackChuoi1 " + stackChuoi);

        System.out.println("stackChuoi1 " + stackChuoi);

        // push__ day len
        // pop__  lay ra va xoa khoi stack
        // peek__ tim ra phan tu cuoi, nhung ko xoa khoi mang
        // clear__ xoa tat ca phan tu trong stack
        // contains__ xac dinh gia tri co ton tai trong stack hay ko
    }

    class stack {
        private List<Integer> list = new ArrayList<>();

        public void push(Integer integer) {
            list.add(integer);
        }

        public Integer pop() {
            Integer peek = list.get(list.size() - 1);
            list.remove(peek);
            return peek;
        }

        public Integer peek() {
            return list.get(list.size() - 1);
        }

        public boolean isEmpty() {
            return list.isEmpty();
        }

        public boolean isEmpty2() {
            return list.size() == 0;
        }
    }
}