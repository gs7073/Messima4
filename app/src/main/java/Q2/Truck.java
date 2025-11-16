package Q2;

public class Truck extends Heavy {
    private double max;

    public Truck(String number, int age, int wheels, String steeringType, double pollutionMinute, int trailers, double max) {
        super(number, age, wheels, steeringType, pollutionMinute, trailers);
        this.max = max;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return (super.toString() + ", max load: " + max);
    }

    @Override
    public double exhaust() {
        double pollution = super.exhaust();

        return pollution * 1.5;
    }

}
