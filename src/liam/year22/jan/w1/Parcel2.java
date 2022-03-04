package liam.year22.jan.w1;

/**
 * @Description
 * @Author liam661
 * @Date 2022/1/2 16:09
 **/
public class Parcel2 {
    class Contents {
        private int i = 11;
        public int value(){
            return i;
        }
    }

    public Destination to(String s){
        return new Destination(s);
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

    public Contents contents(){
        return new Contents();
    }

    public void ship(String dest){
        Contents c = contents();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String [] args){
        Parcel2 p = new Parcel2();
        p.ship("Tasmania");
        Parcel2 q = new Parcel2();
        Parcel2.Contents c = q.contents();
        Parcel2.Destination d = q.to("Borneo");
    }
}
