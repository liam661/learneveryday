package liam.year22.march.w1.d6;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description
 * 按照一定的顺序执行程序
 * @Author liam661
 * @Date 2022/3/5 19:31
 **/
public class Foo {
    private AtomicInteger firstJobDone = new AtomicInteger(0);
    private AtomicInteger secondJobDone = new AtomicInteger(0);

    public Foo() {}

    public void first(Runnable printFirst){
        printFirst.run();
        firstJobDone.incrementAndGet();
    }

    public void second(Runnable printSecond){
        while (firstJobDone.get() != 1){}
        printSecond.run();
        secondJobDone.incrementAndGet();
    }

    public void third(Runnable printThird){
        while (secondJobDone.get() != 1){}
        printThird.run();
    }

    public static void main(String[] args) {
        Foo foo = new Foo();
        Runnable printFirst = ()-> System.out.println("first");
        Runnable printSecond = ()-> System.out.println("second");
        Runnable printThird = ()-> System.out.println("third");
        new Thread(() ->{
            foo.third(printThird);
        }).start();

        new Thread(() ->{
            foo.first(printFirst);
        }).start();

        new Thread(() ->{
            foo.second(printSecond);
        }).start();
    }
}
