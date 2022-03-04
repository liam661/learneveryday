package liam.year22.design.observer.v4;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/11 11:35
 **/
class Child{
    private boolean cry = false;
    private Dad dad = new Dad();
    private Mom mom = new Mom();
    private Dog dog = new Dog();

    public void weakUp(){
        cry = true;
        dad.feed();
        mom.hug();
        dog.wang();
    }
}

class Dad{
    public void feed(){
        System.out.println("dad feed");
    }
}

class Mom{
    public void hug(){
        System.out.println("mom hug");
    }
}

class Dog{
    public void wang(){
        System.out.println("dog wang wang");
    }
}

public class Main {
    public static void main(String [] args){
        Child child = new Child();
        child.weakUp();
    }
}
