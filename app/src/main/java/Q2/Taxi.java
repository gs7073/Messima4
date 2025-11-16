package Q2;

public class Taxi extends Regular {
    private double price;
    public Taxi(String number, int age, int wheels, String steeringType, double pollutionMinute, int passengers, double price) {
        super(number, age, wheels, steeringType, pollutionMinute, passengers);
        this.price = price;
    }

    public double getPriceTaxi() {
        return price;
    }

    public void setPriceTaxi(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return (super.toString() + ", price: " + price);
    }
}
