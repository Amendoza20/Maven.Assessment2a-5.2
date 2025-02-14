package rocks.zipcode.assessment2.fundamentals;
/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {

        return null;

    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        return null;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
      Integer repeatCount = 0;
        String repeatedString = "";
        while ( repeatCount < numberOfTimeToRepeat){
            repeatedString = repeatedString + stringToBeRepeated;
            repeatCount++;
        }

        return repeatedString;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        String tester = string.trim();
        for (int i = 0; i <string.length(); i++) {
            Character index = tester.charAt(i);
            if ((!(index >= 'a' && index <= 'z')) && (!(index >= 'A' && index <= 'Z'))) {
                i++;
                return false;
            }

        }
        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        for (int i = 0; i <string.length(); i++) {
            Character index = string.trim().charAt(i);
            if ((!(index >= '0' && index <= '9'))) {
                i++;
                return false;
            }
        }
        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        return (isAlphaString(string) && isNumericString(string));
    }
}
