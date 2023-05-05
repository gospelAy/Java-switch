package variables;

public class PrimitiveTypeChallenge {
    public static void main(String[] args){
        byte variable1 = 10;
        short number = 20;

        int number2 = 50;
        long number3 = 50000L + 10L * (variable1 + number + number2);
        System.out.println(number3);
    }
    public static void printAnotherDaysOfTheWeek(int day){
        if (day == 1){
            System.out.println("today is sunday");
        } else if (day == 2) {
            System.out.println("today is monday");
        } else if (day == 3) {
            System.out.println("Today is tuesday");

        } else if (day == 4) {
            System.out.println("Today is wednesday");
        } else if (day == 5) {
            System.out.println("Today is friday");
        } else if (day == 6)
            System.out.println("today is saturday");

    }
}
