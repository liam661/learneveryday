package liam.year22.march.w1.d7;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.function.IntConsumer;

/**
 * @Description
 * 多线程按照一定的顺序打印
 * @Author liam661
 * @Date 2022/3/6 17:28
 **/
public class FizzBuzz {
    private int n;

    public FizzBuzz(int n) {
        this.n = n;
    }

    private CyclicBarrier cb = new CyclicBarrier(4);

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 != 0){
                printFizz.run();
            }
            try {
                cb.await();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        for(int i = 1; i <= n; i++){
            if(i % 3 != 0 && i % 5 == 0){
                printBuzz.run();
            }
            try {
                cb.await();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                printFizzBuzz.run();
            }
            try {
                cb.await();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        for(int i = 1; i <= n; i++){
            if(i % 3 != 0 && i % 5 != 0){
                printNumber.accept(i);
            }
            try {
                cb.await();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz(15);
        Runnable printFizz = () -> {
            System.out.println("fizz");
        };
        Runnable printBuzz = () -> {
            System.out.println("buzz");
        };
        Runnable printFizzBuzz = () -> {
            System.out.println("fizzbuzz");
        };
        IntConsumer printNumber = new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.println(value);
            }
        };
        new Thread(() ->{
            try {
                fb.buzz(printBuzz);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() ->{
            try {
                fb.fizz(printFizz);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() ->{
            try {
                fb.fizzbuzz(printFizzBuzz);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() ->{
            try {
                fb.number(printNumber);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
