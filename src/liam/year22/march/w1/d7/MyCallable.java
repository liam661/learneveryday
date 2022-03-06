package liam.year22.march.w1.d7;

import java.util.concurrent.Callable;

/**
 * @Description
 * @Author liam661
 * @Date 2022/3/6 20:27
 **/
public class MyCallable implements Callable<Integer> {
    private int number;

    public MyCallable(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for(int x = 0; x <= number; x++){
            sum += x;
        }
        return sum;
    }
}
