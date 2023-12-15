import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 3, 4, 5, 6, 7);

        // not going to effect original array
        Stream<Integer> s1 = nums.stream().filter(n -> n % 2 == 0).map(n -> n * 2);
        s1.forEach(n -> System.out.println(n));
        // we can't reuse stream multiple times s1.forEach(n->System.out.println(n));

        int result = nums.stream().reduce(0, (c, e) -> c + e);
        System.out.println(result);

        Stream<Integer> sortedvalues = nums.stream().sorted();
        sortedvalues.forEach(n -> System.out.println(n));

        // optional class
        List<String> names = Arrays.asList("one", "two");
        Optional<String> name = names.stream().filter(str -> str.contains("t")).findFirst();
        System.out.println(name);

        // other way apart from optional class
        String name2 = names.stream().filter(str -> str.contains("e")).findFirst().orElse("not found!");
        System.out.println(name2);
    }
}
