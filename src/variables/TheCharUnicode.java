package variables;

public class TheCharUnicode {
    public static void main(String[] args){
        char mychar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(mychar);
        System.out.println(myUnicodeChar);
        char myCopyRightChar = '\u00A9';
        System.out.println(myCopyRightChar);
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;

//        This is a string lesson
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more. ";
        System.out.println("myString is equal to " + myString);
    }
}
