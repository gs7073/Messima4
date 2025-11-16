package Q2;

public class Light extends Vehicles {
    private boolean engine;

    public Light(String number, int age, int wheels, String steeringType, double pollutionMinute, boolean engine) {
        super(number, age, wheels, steeringType, pollutionMinute);
        this.engine = engine;
    }

    public boolean getEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return super.toString() + ", engine: " + engine;
    }
}
