import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class LambdassTest {
    @Test
    public void f1Test() {
        List<String> listOfStrings = Stream.of("a", "b", "c", "lol")
                .collect(Collectors.toList());
        Assertions.assertEquals(asList("a", "b", "c", "lol"), listOfStrings);
    }
}
