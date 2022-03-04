package liam.year22.design.observer.v6;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/11 14:20
 **/
class Child{
    private boolean cry =false;

    public boolean isCry() {
        return cry;
    }

    private List<Observer> observerList = new ArrayList<>();
    {
        observerList.add(new Dad());
        observerList.add(new Mom());
        observerList.add(new Dog());
    }

    public void wakeUp(){
        cry = true;
        WakeUpEvent wakeUpEvent = new WakeUpEvent(System.currentTimeMillis(),"bed");
        for(Observer o : observerList){
            o.actionWakeUp(wakeUpEvent);
        }
    }
}
class WakeUpEvent{
    long timestamp;
    String loc;
    public WakeUpEvent(long timestamp, String loc){
        this.timestamp = timestamp;
        this.loc = loc;
    }
}

interface Observer{
    void actionWakeUp(WakeUpEvent wakeUpEvent);
}
class Dad implements Observer{

    public void feed(){
        System.out.println("dad feed");
    }

    @Override
    public void actionWakeUp(WakeUpEvent wakeUpEvent) {
        feed();
    }
}

class Mom implements Observer{
    public void hug(){
        System.out.println("mom hug");
    }

    @Override
    public void actionWakeUp(WakeUpEvent wakeUpEvent) {
        hug();
    }
}

class Dog implements Observer{
    @Override
    public void actionWakeUp(WakeUpEvent wakeUpEvent) {
        wang();
    }
    public void wang(){
        System.out.println("dog wang... ");
    }
}

public class Main {
    public static void main(String [] args){
        Child child = new Child();
        child.wakeUp();
    }
}
