package oppg1;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Oppg1a {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("10", "1", "20", "110", "21", "12");
        Collections.sort(list, (a, b) -> Integer.valueOf(a).compareTo(Integer.valueOf(b)));
        System.out.println(list);
    }

}
