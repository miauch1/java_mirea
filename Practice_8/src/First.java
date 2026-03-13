import java.util.Scanner;

public class First {

    private static boolean isLeap(int year) {
        return year % 4 == 0;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] months = {"январь", "февраль", "март", "апрель", "май",
                "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


        System.out.print("Enter the number of month: ");
        int index = scan.nextInt() - 1;

        try {
            String message = "Month: " + months[index] + " with " + dom[index] + " days";

            if (index == 1) {
                System.out.print("Enter the year: ");
                int year = scan.nextInt();
                message += isLeap(year) ? ". This is leap year." : "";
            }

            System.out.println(message);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Month with number " + (index + 1) + " does not exist!");
        }
    }
}
