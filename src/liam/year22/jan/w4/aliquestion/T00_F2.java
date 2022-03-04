package liam.year22.jan.w4.aliquestion;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/25 10:50
 **/
public class T00_F2 {

    private static enum Result{
        NOTEND,SUCCESS,FAILED
    }
    private static class MyTask extends Thread{
        private Result result;
        private String name;
        private int timeInSeconds;
        private boolean success;

        public MyTask(String name, int timeInSeconds, boolean success) {
            this.name = name;
            this.timeInSeconds = timeInSeconds;
            this.success = success;
        }

        public Result getResult() {
            return result;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(timeInSeconds);
                System.out.println(name +"任务结束！");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyTask task1 = new MyTask("t1",2, true);
        MyTask task2 = new MyTask("t2",4, false);
        MyTask task3 = new MyTask("t3",5, true);

        List<MyTask> tasks = new ArrayList<>();
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        tasks.stream().forEach((t) -> t.start());

        for(;;){
            for(MyTask task : tasks){
                if(task.getResult() == Result.FAILED){
                    System.out.println("失败");
                    System.exit(0);
                }
            }
        }
    }
}
