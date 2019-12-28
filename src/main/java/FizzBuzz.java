public class FizzBuzz {

    public static String FIZZ = "Fizz";
    public static String BUZZ = "Buzz";
    public static String WHIZZ = "Whizz";

    public static String isFizzBuzz(int inputNum, int firstNum, int secondNum, int thirdNum) {

        String resStr = "";

        if ( inputNum <= 0 ) {
            throw new NumberFormatException("invalid input");
        }

        if ( inputNum % firstNum ==0 ) {
            resStr += FIZZ;
        }

        if ( inputNum % secondNum ==0 ) {
            resStr += BUZZ;
        }

        if ( inputNum % thirdNum ==0 ) {
            resStr += WHIZZ;
        }

        if ( resStr.length() == 0 ) {
            return "" + inputNum;
        }

        return resStr;

    }

}
