package Q2;

public class Heavy extends Vehicles {
    private int trailers;

    public Heavy(String number, int age, int wheels, String steeringType, double pollutionMinute, int trailers) {
        super(number, age, wheels, steeringType, pollutionMinute);
        this.trailers = trailers;
    }

    public int getTrailers() {
        return trailers;
    }

    public void setTrailers(int trailers) {
        this.trailers = trailers;
    }

    @Override
    public String toString() {
        return (super.toString() + ", trailers: " + trailers);
    }

    @Override
    public double exhaust() {
        double pollution = super.exhaust();

        return pollution + (500 * trailers);
    }

}
