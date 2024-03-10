package learnings;

import java.util.ArrayList;
import java.util.List;

public class TypeConversions {
    String intToString(int val) {
        String str = Integer.valueOf(val).toString();
        return str;
    }

    String charToString(char ch) {
        return String.valueOf(ch);
    }

    int stringToInt(String str) {
        return Integer.valueOf(str);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
    }
}
