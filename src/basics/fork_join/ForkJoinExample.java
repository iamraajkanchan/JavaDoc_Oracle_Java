package basics.fork_join;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RejectedExecutionException;

public class ForkJoinExample {

    private static final String tempText = "We can use this pattern to develop our own RecursiveAction classes. To do this, we create an object that represents the total amount of work, chose a suitable threshold, define a method to divide the work and define a method to do the work.";

    public static void main(String[] args) {
        try {
            ForkJoinPool joinPool = ForkJoinPool.commonPool();
            joinPool.execute(() -> System.out.println("Executing this task in " + Thread.currentThread().getName()));
            CustomRecursiveAction recursiveAction = new CustomRecursiveAction(tempText);
            recursiveAction.compute();
            CustomRecursiveTask recursiveTask = new CustomRecursiveTask(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20});
            joinPool.execute(recursiveTask);
            int result = recursiveTask.join();
            System.out.println("The result of RecursiveTask is " + result);
        } catch (RejectedExecutionException e) {
            e.printStackTrace();
        }
    }
}
