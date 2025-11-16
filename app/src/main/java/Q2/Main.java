package Q2;

public class Main {
    public static double dailyPollution(Vehicles[] arr) {
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].exhaust();
        }

        return sum;
    }


    public static void Noise(Vehicles[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Regular) {
                ((Regular) arr[i]).noise();
            }
        }
    }



    public static int passengerNoDriver(Vehicles[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] instanceof Regular) {
                Regular r = (Regular) arr[i];
                sum += (r.getPassengers() - 1);
            }

            // אם זה Bicycle
            else if (arr[i] instanceof Bicycle) {
                sum += 0; // רוכב אחד = אין נוסעים חוץ ממנו
            }
        }

        return sum;
    }

    public static String maxTime(Vehicles[] arr) {
        int max = -1;              // הזמן הכי גדול שמצאנו
        String maxNum = "";     // מספר הרכב עם הזמן הכי גדול

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] instanceof Cart) {
                Cart c = (Cart) arr[i];

                if (c.getTime() > max) {
                    max = c.getTime();
                    maxNum = c.getNumber(); // מספר הרכב
                }
            }
        }

        return maxNum;
    }



}
