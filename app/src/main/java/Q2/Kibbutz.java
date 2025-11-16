package Q2;

public class Kibbutz {

    private Vehicles[] arr;
    private int count ;

    public Kibbutz() {
        arr = new Vehicles[500];
        count = 0;
    }

    public void addVehicle(Vehicles v) {
        if (count < 500) {
            arr[count] = v;
            count++;
        } else {
            System.out.println("The kibbutz is full");
        }
    }

    public Vehicles[] over15() {

        Vehicles[] list = new Vehicles[500];
        int j = 0;

        for (int i = 0; i < count; i++) {

            if (arr[i].getAge() > 15 && arr[i].getSteeringType().equals("steering")) {
                list[j] = arr[i];
                j++;
            }
        }

        return list;
    }

    public int countSteering() {
        int s = 0;

        for (int i = 0; i < count; i++) {

            boolean ok =
                    (arr[i] instanceof Regular) ||
                            (arr[i] instanceof Light);

            if (ok && arr[i].getSteeringType().equals("steering")) {
                s++;
            }
        }

        return s;
    }



}
