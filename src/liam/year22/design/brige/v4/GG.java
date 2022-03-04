package liam.year22.design.brige.v4;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/16 21:07
 **/
public class GG {
    public void chase(MM mm){
        Gift gift = new WarmGift(new Flower());
        give(mm, gift);
    }

    public void give(MM mm, Gift g){
        System.out.println(g + "gived!");
    }
}
