package ex1;

import java.util.LinkedList;
import java.util.Queue;

public class StackOnQueue {

    void push(int x) {
        queue.add(x);
    }

    int pop() {
        reverseQueue(queue);
        Integer temp = queue.poll();
        int res = temp == null ? 0 : temp;
        reverseQueue(queue);
        return res;
    }

    int top() {
        reverseQueue(queue);
        Integer temp = queue.peek();
        int res = temp == null ? 0 : temp;
        reverseQueue(queue);
        return res;
    }

    boolean empty() {
        return queue.isEmpty();
    }

    @Override
    public String toString() {
        Queue<Integer> temp = queue;
        reverseQueue(temp);
        String res = "Stack: ";
        while (!temp.isEmpty()) {
            res += temp.poll().toString();
        }

        return res;
    }


    private Queue<Integer> queue = new LinkedList<>();

    private static void reverseQueue(Queue<Integer> q) {
        Queue<Integer> temp = new LinkedList<>();

        while (!q.isEmpty()) {
            temp.add(q.poll());
        }

        while (!temp.isEmpty()) {
            q.add(temp.poll());
        }

    }
}
