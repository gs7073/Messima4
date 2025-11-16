package Q2;

public class Firetruck extends Truck {
    private int water;

    public Firetruck(String number, int age, int wheels, String steeringType, double pollutionMinute, int trailers, double maxLoad, int water) {
        super(number, age, wheels, steeringType, pollutionMinute, trailers, maxLoad);
        this.water = water;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    @Override
    public String toString() {
        return (super.toString() + ", water: " + water);
    }
}
