import java.util.Scanner;

enum Errors{
    LESS_DIGITS,MORE_DIGITS,PERFECT
}
public class Pattern {
    public static Errors check(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your mobile number : ");
        String number = in.next();
        int digits= number.length();
        System.out.println();
        if(digits<10){
            return Errors.LESS_DIGITS;
        }
        else if(digits>10){
        	check();
            return Errors.MORE_DIGITS;
        }
        else{
            return Errors.PERFECT;
        }
    }
    public static void main(String[] args) {
        Errors result = check();
        switch (result) {
            case PERFECT -> System.out.println("Your number is perfect");
            case MORE_DIGITS -> System.out.println("Your number is less than 10 digits");
            case LESS_DIGITS -> System.out.println("Your number is more than 10 digits");
        }
    }
}	