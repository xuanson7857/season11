package Stack_Queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // offer them vao
        // poll la Phan tu dau tien ra va xoa
        // peek soi phan tu o dau
        // remove xoa di
        Queue<String> queue = new Queue<String>();
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");
        queue.offer("4");
        System.out.println("poll ra phan tu %s trong queue \n " + queue.poll());
        System.out.println("poll ra phan tu %s trong queue \n " + queue.poll());
        System.out.println("poll ra phan tu %s trong queue \n " + queue.poll());
        System.out.println("peek cua queue la " + queue.peek());

        System.out.println(queue.isEmpty() ? "queue dang rong" : "queue co gia tri");
    }

    static class Queue<E> {
        List<E> list = new LinkedList<>();

        public void offer(E e) {
            list.add(e);
        }

        public E poll() {
            // lay ra va xoa luon
            return list.remove(0);
        }

        public E peek() {
            return list.get(0);
        }

        public boolean isEmpty() {
            return list.isEmpty();
        }
    }
}
