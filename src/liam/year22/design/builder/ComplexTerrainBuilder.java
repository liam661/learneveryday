package liam.year22.design.builder;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/16 20:12
 **/
public class ComplexTerrainBuilder implements TerrainBuilder{
    Terrain terrain = new Terrain();

    @Override
    public TerrainBuilder buildFort() {
        terrain.fort = new Fort(10, 10, 10, 10);
        return this;
    }

    @Override
    public TerrainBuilder buildMine() {
        terrain.mine = new Mine(10,20,30,40);
        return this;
    }

    @Override
    public TerrainBuilder buildWall() {
        terrain.w = new Wall(10,20,30,40);
        return this;
    }

    @Override
    public Terrain build() {
        return terrain;
    }
}
