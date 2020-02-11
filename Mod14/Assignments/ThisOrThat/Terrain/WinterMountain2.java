/**
 * 
 * Class that inherits from Mountains, but adds a temperature variable
 * 
 * @author Max Gordon
 * @version 02/02/2020
 */

public class WinterMountain2 extends Mountain2{
    private double temperature;

    public WinterMountain2(int length, int height, int num, double temperature) {
        super(length, height, num);
        this.temperature = temperature;
    }

    public String getTemp() {
        return "Winter " + getMountains() + " and is " + this.temperature + " degrees";
    }
}