package variables;

public class SwitchCase {
    public static void main(String[] args) {
        printAnotherDaysOfTheWeek(1);
        printAnotherDaysOfTheWeek(2);
        printAnotherDaysOfTheWeek(3);
        printAnotherDaysOfTheWeek(4);
        printAnotherDaysOfTheWeek(5);
        printAnotherDaysOfTheWeek(6);
        printAnotherDaysOfTheWeek(785);



        printDaysOfTheWeek(-1);
        printDaysOfTheWeek(0);
        printDaysOfTheWeek(1);
        printDaysOfTheWeek(2);
        printDaysOfTheWeek(3);
        printDaysOfTheWeek(4);
        printDaysOfTheWeek(5);
        printDaysOfTheWeek(6);
        char variableChar = 'A';
        switch (variableChar){
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(variableChar + " was found ");
                break;
            default:
                System.out.println("could not find A, B, C, D, or 'E ");
        }

        int day = 6;
        switch (day){
            case 1:
                System.out.println(" The day is Monday");
                break;
            case 2:
                System.out.println("The day is Tuesday");
                break;
            case 3:
                System.out.println("The day is Wednesday");
                break;
            case 4:
                System.out.println("The day is Thursday");
                break;
            case 5:
                System.out.println("The day is Friday");
                break;
            case 6:
                System.out.println("The day is Saturday");
                break;
            case 7:
                System.out.println("The day is sunday we are preparing for church:");
                break;
            default:
                System.out.println("Day not found:");
        }

    }
    public static void printDaysOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not found");

        }
    }
    public static void printAnotherDaysOfTheWeek(int day) {
        if (day == 1) {
            System.out.println("today is sunday");
        } else if (day == 2) {
            System.out.println("today is monday");
        } else if (day == 3) {
            System.out.println("Today is tuesday");

        } else if (day == 4) {
            System.out.println("Today is wednesday");
        } else if (day == 5) {
            System.out.println("Today is friday");
        } else if (day == 6) {
            System.out.println("today is saturday");
        }else {
            System.out.println("Invalid day");
        }
    }
    }

