package Q2;

public class Cart extends Light {
    private int time;

    public Cart(String number, int age, int wheels, String steeringType, double pollutionMinute, boolean engine, int time) {
        super(number, age, wheels, steeringType, pollutionMinute, engine);
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return (super.toString() + ", time: " + time);
    }

    @Override
    public double exhaust() {
        double pollution = super.exhaust();
        return pollution * 100;
    }

    public void hitchhikers() {
        System.out.println("The cart cant take hitchhikers :(");
    }


}


