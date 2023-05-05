package variables;

public class MinIntValue {
    public static void main(String[] args){
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum value = " + myMaxIntValue);
//        This is called overflow in java
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
//        This is called overflow in java

        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        var myName = "IK";
        System.out.println("my name is " + myName + " and i am a boy:");
    }
}
