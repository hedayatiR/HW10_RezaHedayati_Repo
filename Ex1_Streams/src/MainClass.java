import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        String[] str = {"Amir", "Hatef", "Mehran", "Mojtaba", "Mohammad", "Ali",
                "Davood", "Reza", "Mohsen"};


        Map<Integer, List<String>> map = Arrays.stream(str).collect(Collectors.groupingBy(
                w -> w.length(),
                Collectors.toList() )
        );


        Map<Integer, Long> map2 = Arrays.stream(str).collect(Collectors.groupingBy(
                w -> w.length(),
                Collectors.counting() )
        );

        System.out.println("Elements of each group:");
        System.out.println(map);
        System.out.println();
        System.out.println("Numbers of elements in each group:");
        System.out.println(map2);
    }
}
