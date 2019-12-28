public class FizzBuzz {

    public static String FIZZ = "Fizz";
    public static String BUZZ = "Buzz";
    public static String FIZZBUZZ = "FizzBuzz";

    public static String isFizzBuzz(int inputNum, int firstNum, int secondNum) {
        if ( inputNum % firstNum == 0 && inputNum % secondNum ==0 ) {
            return FIZZBUZZ;
        }
        else if ( inputNum % firstNum == 0 ) {
            return FIZZ;
        }
        else if ( inputNum % secondNum ==0 ) {
            return BUZZ;
        }
        else {
            return "" + inputNum;
        }
    }

}
