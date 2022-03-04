package liam.year22.design.observer.v3;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/11 11:29
 **/
class Child {
    private boolean cry = false;
    private Dad dad = new Dad();

    public boolean isCry() {
        return cry;
    }

    public void weakUp(){
        cry = true;
        dad.feed();
    }
}

class Dad {
    public void feed(){
        System.out.println("dad feeding");
    }
}

public class Main {
    public static void main(String [] args){
        Child child = new Child();
        child.weakUp();
    }
}
