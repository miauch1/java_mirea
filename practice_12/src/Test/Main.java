package Test;

import App.AppSettings;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {

        //AtomicInteger counter = new AtomicInteger(0);

        Runnable task = () -> {

            //int k = counter.incrementAndGet();

            AppSettings settings = AppSettings.getInstance();
            settings.setSettings("Thread name", Thread.currentThread().getName());
            System.out.println("Thread  : " + Thread.currentThread().getName() +
                                ", Setting Value: " + settings.getSettings("threadName"));
        };

        Thread first = new Thread(task, "first");
        Thread second = new Thread(task, "second");
        Thread third = new Thread(task, "third");

        first.start();
        second.start();
        third.start();

        try {
            first.join();
            second.join();
            third.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        AppSettings settings = AppSettings.getInstance();
        System.out.println("Итог -> " + settings.getSettings("Thread name"));
    }
}
