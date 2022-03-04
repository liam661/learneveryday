package liam.year22.design.observer.v5;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/11 11:43
 **/
interface Observer{
    void actionWeakUp();
}

class Child{
    private boolean isCry = false;
    private List <Observer> observerList = new ArrayList();

    public boolean isCry() {
        return isCry;
    }

    {
        observerList.add(new Dad());
        observerList.add(new Mom());
        observerList.add(new Dog());
    }
    public void weakUp(){
        for(Observer o : observerList){
            o.actionWeakUp();
        }
    }
}
class Dad implements Observer{
    @Override
    public void actionWeakUp() {
        feed();
    }
    public void feed(){
        System.out.println("dad feed");
    }
}
class Mom implements Observer{
    @Override
    public void actionWeakUp() {
        hug();
    }

    public void hug(){
        System.out.println("mom hug");
    }
}

class Dog implements Observer{
    @Override
    public void actionWeakUp() {
        wang();
    }
    public void wang(){
        System.out.println("dong wang wang...");
    }
}

public class Main {
    public static void main(String [] args){
        Child c = new Child();
        c.weakUp();
    }
}
