/**
 * This will show all of the swanky new classes
 * 
 * @author Max Gordon
 * @version 02/02/2020
 */

public class GameTerrainTester {
    public static void main(String[] args) {
        Terrain terrain = new Terrain(120, 180);
        Mountain mountain = new Mountain(270, 330, 21);
        WinterMountain winterMountain = new WinterMountain(150, 250, 28, 18.6);
        Forest forest = new Forest(90, 450, 2376);
        BearForest bearForest = new BearForest(170, 250, 1847, 32);
        Desert desert = new Desert(320, 230, Integer.MAX_VALUE);

        System.out.println(terrain.getTerrainSize());
        System.out.println();
        System.out.println(mountain.getMountains());
        System.out.println();
        System.out.println(winterMountain.getTemp());
        System.out.println();
        System.out.println(forest.getTrees());
        System.out.println();
        System.out.println(bearForest.getBears());
        System.out.println();
        System.out.println(desert.getSand());
    }
}