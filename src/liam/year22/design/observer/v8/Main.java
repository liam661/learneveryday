package liam.year22.design.observer.v8;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/11 14:56
 **/
class Child{
    private boolean cry = false;
    public boolean isCry() {
        return cry;
    }
    List<Observer> observerList = new ArrayList<>();
    {
        observerList.add(new Dad());
        observerList.add(new Mom());
        observerList.add(new Dog());
    }

    public void weakUp(){
        cry = true;
        WakeupEvent wakeupEvent = new WakeupEvent(System.currentTimeMillis(),"bed",this);
        for(Observer o : observerList){
            o.actionWakeUp(wakeupEvent);
        }
    }
}

abstract class Event<T>{
    abstract T getSource();
}

class WakeupEvent extends Event<Child>{
    long timeStamp;
    String loc;
    Child source;

    public WakeupEvent(long timeStamp, String loc, Child source){
        this.timeStamp = timeStamp;
        this.loc = loc;
        this.source = source;
    }

    @Override
    Child getSource(){
        return source;
    }
}

interface Observer{
    void actionWakeUp(WakeupEvent wakeupEvent);
}

class Dad implements Observer{
    @Override
    public void actionWakeUp(WakeupEvent wakeupEvent) {
        feed();
    }

    public void feed(){
        System.out.println("dad feed...");
    }
}

class Mom implements Observer{
    @Override
    public void actionWakeUp(WakeupEvent w) {
        hug();
    }
    public void hug(){
        System.out.println("mom hug...");
    }
}

class Dog implements Observer{
    @Override
    public void actionWakeUp(WakeupEvent w) {
        wang();
    }
    public void wang(){
        System.out.println("dog wang wang...");
    }
}

public class Main {
    public static void main(String [] args){
        Child child = new Child();
        child.weakUp();
    }
}
