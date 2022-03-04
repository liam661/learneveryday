package liam.year22.design.template;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/16 22:24
 **/
public class Main {
    public static void main(String[] args) {
        C c = new F();
        c.f();
    }
}

abstract class C {
    public void f(){
        opt1();
        opt2();
    }
    abstract void opt1();
    abstract void opt2();
}

class F extends C{

   @Override
   public void opt1(){
        System.out.println("opt1");
   }

   @Override
    public void opt2(){
      System.out.println("opt2");
   }
}
