package lesson_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class lesson3_3 {
    public static void main(String[] args) {

        List<Integer> foo = Arrays.asList(2 , 10, 15 , 17 , 25);
        int sum = 0;
        for (int i = 0; i < foo.size(); i++) {
            sum = sum+foo.get(i);
        }
        Collections.sort(foo);
        System.out.println("max=" + foo.get(foo.size()-1));
        System.out.println("min=" + foo.get(0));
        System.out.println("avarage=" + sum / foo.size());

    }
}
