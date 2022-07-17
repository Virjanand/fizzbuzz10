package fizzbuzz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
    public List<String> fizzBuzzNumbers() {
        return IntStream.rangeClosed(1, 100).mapToObj(i -> toFizzBuzz(i)).collect(Collectors.toList());
    }

    private String toFizzBuzz(int i) {
        if (i == 3) {
            return "Fizz";
        }
        return Integer.toString(i);
    }
}
