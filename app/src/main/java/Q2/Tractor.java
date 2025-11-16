package Q2;

public class Tractor extends Heavy {
    private String trailerType;

    public Tractor(String number, int age, int wheels, String steeringType, double pollutionMinute, int trailers, String trailerType) {
        super(number, age, wheels, steeringType, pollutionMinute, trailers);
        this.trailerType = trailerType;
    }

    public String getTrailerType() {
        return trailerType;
    }

    public void setTrailerType(String trailerType) {
        this.trailerType = trailerType;
    }

    @Override
    public String toString() {
        return (super.toString() + ", trailer types: " + trailerType);
    }
}
