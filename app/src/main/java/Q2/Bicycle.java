package Q2;

public class Bicycle extends Light {
    private boolean basket;

    public Bicycle(String number, int age, int wheels, String steeringType, double pollutionMinute, boolean engine, boolean basket) {
        super(number, age, wheels, steeringType, pollutionMinute, engine);
        this.basket = basket;
    }

    public boolean getBasket() {
        return basket;
    }

    public void setBasket(boolean basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return super.toString() + ", basket: " + basket;
    }
}
