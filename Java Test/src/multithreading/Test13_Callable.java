package multithreading;

import java.util.concurrent.*;

public class Test13_Callable {
    static int factorialResult;

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(5);

        Future<Integer> future = executorService.submit(factorial);
        try {
            factorialResult = future.get(); //main blocked, waiting for task completion
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        }
        finally {
            executorService.shutdown();
        }
        System.out.println(factorialResult);
    }
}

class Factorial implements Callable<Integer> {

    int f;

    public Factorial(int f){
        this.f = f;
    }

    @Override
    public Integer call() throws IllegalArgumentException, InterruptedException {
        if (f<=0){
            throw new IllegalArgumentException("The number has to be more than zero");
        }
        int result = 1;
        for (int i = 1; i <= f; i++){
            Thread.sleep(1000);
            result *=i;
        }
        return result;
    }
}