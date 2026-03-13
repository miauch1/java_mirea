package ex1;

public class SoQTest {
    public static void main(String[] args) {
        StackOnQueue test = new StackOnQueue();
        test.push(10);
        test.push(12);

        System.out.println(test.top());
        System.out.println(test.pop());
        System.out.println(test.empty());
        System.out.println(test);
    }
}
