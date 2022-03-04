package liam.year22.design.observer.v2;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/11 11:22
 **/
class Child{
    private boolean isCry = false;
    public boolean isCry() {
        return isCry;
    }

    public void isWakeUp(){
        System.out.println("WakeUp child wuwuwu...");
        isCry = true;
    }
}

public class Main {
    public static void main(String [] args){
        Child child = new Child();
        while (!child.isCry()){
            try {
                Thread.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("child observing");
    }
}
