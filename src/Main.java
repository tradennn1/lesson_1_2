public class Main {
    public static void main(String[] args) {
        int temperature = 38;
        int numberOfStudent = 20;
        boolean isRainy = false;

        if (temperature > 30) {
            int a = 9;
            a = a * 2;
            System.out.println(a);
            System.out.println("It is too hot!");
        }

        if (temperature < 0) {
            System.out.println("It is freezing");
        }

        if (isRainy) {
            System.out.println("Take an umbrella!");
        } else {
            System.out.println("Put on a cap");
        }

        if (numberOfStudent > 15) {
            System.out.println("Go to the picnic!");
        } else {
            System.out.println("Stay at home");
        }

        /*else {
            System.out.println("Well done!");
        }*/

        if (temperature == 15) { // оператор сравнения
            System.out.println("Good weather for walking");
        } else if (temperature > 15) {
            System.out.println("It is warm");
        } else if (temperature >= 30) {
            System.out.println("It is very hot!");
        } else {
            System.out.println("I do not know!");
        }

        if (temperature < 10) {
            System.out.println("Take on a jacket");
            if (numberOfStudent > 12) {
                System.out.println("Go to cinema");
            } else {
                System.out.println("Go to Cafe");
            }
        }
    }
}
