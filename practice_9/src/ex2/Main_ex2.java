package ex2;

public class Main_ex2 {
    public static void main(String[] args) {
        GenericStack<Integer> stack  = new GenericStack<>();

        stack.push(10);
        stack.push(12);

        System.out.println(stack.getSize());

        stack.pop();

        System.out.println(stack.getSize());
    }
}
