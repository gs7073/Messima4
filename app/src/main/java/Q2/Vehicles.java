package Q2;

public class Vehicles {
    private String number;
    private int age;
    private int wheels;
    private String steeringType;
    private double pollutionMinute;

    public Vehicles(String number, int age, int wheels, String steeringType, double pollutionMinute) {
        this.number = number;
        this.age = age;
        this.wheels = wheels;
        this.steeringType = steeringType;
        this.pollutionMinute = pollutionMinute;
    }

    public String getNumber() {
        return number;
    }
    public int getAge() {
        return age;
    }
    public int getWheels() {
        return wheels;
    }
    public String getSteeringType() {
        return steeringType;
    }
    public double getPollutionMinute() {
        return pollutionMinute;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public void setSteeringType(String steeringType) {
        this.steeringType = steeringType;
    }
    public void setPollutionMinute(double pollutionMinute) {
        this.pollutionMinute = pollutionMinute;
    }

    @Override
    public String toString() {
        return ("license: " + number + ", age: " + age + ", wheels: " + wheels + ", steering: " + steeringType + ", pollution per a minute: " + pollutionMinute);
    }

    public double exhaust() {
        return (pollutionMinute * 60);
    }

}
