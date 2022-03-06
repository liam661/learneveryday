package liam.year22.march.w1.d6;

/**
 * @Description
 * @Author liam661
 * @Date 2022/3/6 14:58
 **/
public class Foo2 {
    private boolean firstFinished;
    private boolean secondFinished;
    private Object lock = new Object();

    public void first(Runnable printFirst){
        synchronized (lock){
            printFirst.run();
            firstFinished = true;
            lock.notifyAll();
        }
    }
    public void second(Runnable printSecond) throws InterruptedException{
        synchronized (lock){
            while (!firstFinished){
                lock.wait();
            }
            printSecond.run();
            secondFinished = true;
            lock.notifyAll();
        }
    }
    public void third(Runnable printThird) throws InterruptedException{
        synchronized (lock){
            while (!secondFinished){
                lock.wait();
            }
            printThird.run();
        }
    }

    public static void main(String[] args) {
        Foo2 foo = new Foo2();
        Runnable printFirst = ()-> System.out.println("first");
        Runnable printSecond = ()-> System.out.println("second");
        Runnable printThird = ()-> System.out.println("third");
        new Thread(() ->{
            foo.first(printFirst);
        }).start();

        new Thread(() ->{
            try {
                foo.second(printSecond);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() ->{
            try {
                foo.third(printThird);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
