package liam.year22.march.w1.d3;

/**
 * @Description
 * @Author liam661
 * @Date 2022/3/1 18:08
 **/
public class Test {
    public static void main(String[] args) {
        String a = new String("ab");
        String b = new String("ab");
        if(a == b){
            System.out.println("a==b");
        }
        if(a.equals(b)){
            System.out.println("a.equals(b)");
        }
        String c = "ab";
        String d = "ab";
        if(c == d){
            System.out.println("c==d");
        }
        if(c.equals(d)){
            System.out.println("c.equals(d)");
        }
        if(42 == 42.0){
            System.out.println("true");
        }
    }
}
