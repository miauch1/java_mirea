package GSextendAL;

import java.util.ArrayList;

public class GenericStack<E> extends ArrayList<E> {

    public void push(E o) {
        this.add(o);
    }

    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стэк пуст");
        }
        return this.remove(this.size() - 1);
    }

    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стэк пуст");
        }
        return this.get(this.size() - 1);
    }

    // Проверяет, пуст ли стек
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public String toString() {
        return "Стэк: " + super.toString();
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        GenericStack<String> stack = new GenericStack<>();

        System.out.println("Введите 5 строк:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            stack.push(scanner.nextLine());
        }

        System.out.println("\nВывод строк в обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        scanner.close();
    }
}
