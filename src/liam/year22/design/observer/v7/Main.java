package liam.year22.design.observer.v7;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/11 14:39
 **/
class Child{
    private boolean isCry = false;

    public boolean isCry() {
        return isCry;
    }

    List<Observer> observerList = new ArrayList<>();
    {
        observerList.add(new Dad());
        observerList.add(new Mom());
        observerList.add(new Dog());
    }

    public void wakeUp(){
        isCry = true;
        WakeUpEvent wakeUpEvent = new WakeUpEvent(System.currentTimeMillis(),"bed", this);
        for(Observer o : observerList){
            o.actionOnWakeUp(wakeUpEvent);
        }
    }
}
class WakeUpEvent {
    long timestamp;
    String loc;
    Child source;
    public WakeUpEvent(long timestamp, String loc,Child source){
        this.timestamp = timestamp;
        this.loc = loc;
        this.source = source;
    }
}

class Dad implements Observer{
    @Override
    public void actionOnWakeUp(WakeUpEvent wakeUpEvent) {
        feed();
    }

    public void feed(){
        System.out.println("dad feed ...");
    }
}

class Mom implements Observer{
    @Override
    public void actionOnWakeUp(WakeUpEvent wakeUpEvent) {
        hug();
    }

    public void hug(){
        System.out.println("mom hug...");
    }
}

class Dog implements Observer{
    @Override
    public void actionOnWakeUp(WakeUpEvent wakeUpEvent) {
        wang();
    }
    public void wang(){
        System.out.println("wang wang...");
    }
}

interface Observer {
    void actionOnWakeUp(WakeUpEvent wakeUpEvent);
}

public class Main {
    public static void main(String [] args){
        Child child = new Child();
        child.wakeUp();
    }
}
