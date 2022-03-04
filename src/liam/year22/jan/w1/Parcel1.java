package liam.year22.jan.w1;

/**
 * @Description 内部类研究
 * @Author liam661
 * @Date 2022/1/2 15:50
 **/
public class Parcel1 {
    class Contents {
        private int i = 11;
        public int value() {
            return i;
        }
    }
    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLabel(){
            return label;
        }
    }

    public void ship(String dest){
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String [] args){
        Parcel1 p = new Parcel1();
        p.ship("Tasmania");
    }
}
