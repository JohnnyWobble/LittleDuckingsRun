/**
 * 
 * Class that inherits from Mountains, but adds a temperature variable
 * 
 * @author Max Gordon
 * @version 02/02/2020
 */

public class WinterMountain extends Mountain{
    private double temperature;

    public WinterMountain(int l, int h, int num, double temp) {
        super(l, h, num);
        temperature = temp;
    }

    public String getTemp() {
        return "Winter " + getMountains() + " and is " + temperature + " degrees";
    }
}