import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class DuplicateEncoder {
    public static String encode(final String str) throws NullPointerException{
        if (str == null) throw new NullPointerException("str cannot be null");
        return Arrays.stream(str.toLowerCase().split("")).map(c -> (Collections.frequency(Arrays.stream(str.toLowerCase()
                .split("")).collect(Collectors.toList()), c) == 1)? "(" : ")").collect(Collectors.joining());
    }
}
