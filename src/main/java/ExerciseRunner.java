import org.apache.commons.lang3.StringUtils;

public class ExerciseRunner {
    public static void main(String[] args) {
        System.out.println(numCheckString());
        System.out.println(flipStringCase());
        System.out.println(reverseString());
    }

    public static boolean numCheckString() {
        String userString = Input.getString("Enter a string you want to check if it is a number: ");
        return StringUtils.isNumeric(userString);
    }

    public static String flipStringCase() {
        String userString = Input.getString("Enter a string to flip case: ");
        return StringUtils.swapCase(userString);
    }

    public static String reverseString() {
        String userString = Input.getString("Enter a string to reverse: ");
        return StringUtils.reverse(userString);
    }
}
