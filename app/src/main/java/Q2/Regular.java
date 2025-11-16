package Q2;

public class Regular extends Vehicles {
    private int passengers;

    public Regular(String number, int age, int wheels, String steeringType, double pollutionMinute, int passengers) {
        super(number, age, wheels, steeringType, pollutionMinute);
        this.passengers = passengers;
    }



    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return (super.toString() + ", passengers: " + passengers);
    }
    @Override
    public double exhaust() {
        double pollution = super.exhaust();
        return pollution + 100;
    }

    public void noise() {
        System.out.println(" car noise: Vroooommmmm");
    }


}
