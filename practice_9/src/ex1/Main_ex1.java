package ex1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main_ex1 {

    private static <T> ArrayList<T> arraySet(ArrayList<T> arr) {
        ArrayList<T> set = new ArrayList<>();

        for (T obj : arr) {
            if (!set.contains(obj)) {
                set.add(obj);
            }
        }

        return set;
    }

    private static void arraySetTest() {
        // Int
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 6));
        ArrayList<Integer> ans = arraySet(arr);
        System.out.println(ans);

        //String
        ArrayList<String> lines = new ArrayList<>(Arrays.asList("qwe", "qwe", "asd", "asd", "zxc", "zxc"));
        ArrayList<String> set_lines = arraySet(lines);
        System.out.println(set_lines);
    }

    private static <T> int linearSearch(T[] arr, T target) {
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    private static void linearSearchTest() {
        Integer[] arr = new Integer[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 6};
        System.out.println(linearSearch(arr, 3));

        String[] lines = new String[]{"qwe", "qwe", "asd", "asd", "zxc", "zxc"};
        System.out.println(linearSearch(lines, "zxc"));
    }

    private static Circle findMax(Circle[] arr) {
        Circle max = new Circle(Integer.MIN_VALUE);

        for (Circle obj : arr) {
            if (obj.compareTo(max) == 1) {
                max = obj;
            }
        }

        return max;
    }

    private static void findMaxCircleTest() {
        Circle c1 = new Circle(1);
        Circle c2 = new Circle(3);
        Circle c3 = new Circle(4);
        Circle c4 = new Circle(7);
        Circle c5 = new Circle(99);

        Circle[] arr = new Circle[]{c1, c2, c3, c4, c5};

        Circle ans = findMax(arr);

        System.out.println(ans.getRadius());
    }

    private static <T extends Comparable<T>> T findMax2D(T[][] arr) {
        T max = arr[0][0];

        for (T[] sub : arr) {
            for (T elem : sub) {
                if (elem.compareTo(max) == 1) {
                    max = elem;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[1] = 20;

        System.out.println(arr.length);

//        findMaxCircleTest();
    }
}
