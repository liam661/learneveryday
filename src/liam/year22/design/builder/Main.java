package liam.year22.design.builder;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/16 20:04
 **/
public class Main {
    public static void main(String [] args)
    {
        Person p = new Person.PersonBuilder().basicInfo("1","zcl",27)
                .weight(180).score(59).loc("xa","123").build();

        TerrainBuilder builder = new ComplexTerrainBuilder();
        Terrain t = builder.buildFort().buildMine().buildWall().build();
    }
}
