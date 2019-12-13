/**
 * This will show some cool data on angles and speeds
 * 
 * @author Max Gordon
 * @version 12/13/2019
 */

public class CatapultTester {
    public static void main(String[] args) {
        // Declare 2D array
        double[][] kph_vs_m = new double[6][7];

        // Declare 1D arrays
        int[] speedsKPH = {40, 50, 60, 70, 80, 90, 100};
        int[] angles = {30, 35, 40, 45, 50, 55}; 
        Catapult[] catapults = new Catapult[7];

        // Generate Catapult objects
        for (int k = 0; k < catapults.length; k++) {
            catapults[k] = new Catapult(speedsKPH[k]);
        }

        // Print header
        System.out.println("                  Projectile Distance (meters)                  ");
        System.out.println(" KPH    30°       35°       40°       45°       50°       55°   ");
        System.out.println("________________________________________________________________");

        // Generate and print data
        for (int y = 0; y < kph_vs_m[0].length; y++) {
            for (int x = 0; x < kph_vs_m.length; x++) {
                if (x == 0) {
                    System.out.printf(" %3s ", speedsKPH[y]);
                }
                kph_vs_m[x][y] = catapults[y].calcDistanceAtAngle(angles[x]);

                System.out.printf(" %6.1f   ", kph_vs_m[x][y]);
            }
            System.out.println();
        }
    }
}