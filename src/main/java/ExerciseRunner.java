import org.apache.commons.lang3.StringUtils;

public class ExerciseRunner {
    public static void main(String[] args) {
        System.out.println(returnsString());
        System.out.println(flipStringCase());
        System.out.println(reverseString());
    }

    public static String returnsString() {
        String userString = Input.getString("Enter a string you want to see again: ");
        return StringUtils.defaultString(userString);
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
