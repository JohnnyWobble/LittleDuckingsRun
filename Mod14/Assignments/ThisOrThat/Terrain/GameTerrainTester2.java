/**
 * This will show all of the swanky new classes
 * 
 * @author Max Gordon
 * @version 02/02/2020
 */

public class GameTerrainTester2 {
    public static void main(String[] args) {
        Terrain2 terrain = new Terrain2(120, 180);
        Mountain2 mountain = new Mountain2(270, 330, 21);
        WinterMountain2 winterMountain = new WinterMountain2(150, 250, 28, 18.6);
        Forest2 forest = new Forest2(90, 450, 2376);
        BearForest2 bearForest = new BearForest2(170, 250, 1847, 32);
        Desert2 desert = new Desert2(320, 230, Integer.MAX_VALUE);

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