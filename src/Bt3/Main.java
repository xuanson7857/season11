package Bt3;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<>();
        list.offer(1);
        list.offer(2);
        list.offer(3);
        list.offer(4);
        list.offer(5);
        System.out.println("list " + list);
        System.out.println("list1 " + list.remove(2));
        System.out.println("list " + list);

        System.out.println("list2 " + list.poll());
        System.out.println("list " + list);

        System.out.println("list3 " + list.peek());
        System.out.println("list " + list);
    }
}
