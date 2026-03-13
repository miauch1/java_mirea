package ex2;

public class GenericStack<E> {

    @SuppressWarnings("unchecked")
    public GenericStack() {
        arr = (E[]) new Object[max_size];
    }

    public int getSize() {
        return current_size;
    }
    public E peek() {
        return arr[current_size - 1];
    }

    @SuppressWarnings("unchecked")
    public void push(E o) {
        if (current_size == max_size) {
            max_size *= 2;
            E[] arr_temp = (E[]) new Object[max_size];

            for (int i = 0; i < current_size; ++i) {
                arr_temp[i] = arr[i];
            }
            arr_temp[current_size] = o;

            arr = arr_temp;
        } else {
            arr[current_size] = o;
        }

        ++current_size;
    }
    public E pop() {
        E o = arr[current_size - 1];
        arr[current_size - 1] = null;
        --current_size;
        return o;
    }
    public boolean isEmpty() {
        return current_size == 0;
    }
    @Override
    public String toString() {

        String arrs = "";
        for (int i = 0; i < current_size; ++i) {
            if (i != current_size - 1) {
                arrs += arr[i].toString() + ", ";
            }
            else {
                arrs += arr[i].toString();
            }
        }

        return "стек: " + arrs;
    }

    private E[] arr;
    private int max_size = 10;
    private int current_size = 0;
}
