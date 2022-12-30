
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        Stream.of("Ron", "Wilson", "Harry")
//                .sorted()
//                .forEach(s -> System.out.println(s));

//        Stream.of("Ron", "Wilson", "Harry")
//                .sorted()
//                .forEach(System.out::println);

//        String[] names = { "Ron", "Wilson", "Harry", "Grace", "Mike" };
//        Stream.of(names)
//                .sorted()
//                .forEach((name)-> System.out.println(name));

//        String[] names = { "Ron", "Wilson", "Harry", "Grace", "Mike" };
//       Arrays.stream(names)
//                .sorted()
//                .forEach((name)-> System.out.println(name));


//        String[] names = { "Ron", "Wilson", "Harry", "Grace", "Mike", "Ray" };
//        Arrays.stream(names)
//                .sorted()
//                .filter((name)->{
//                    boolean isR = name.startsWith("R");
//                    return isR;
//                });

        String[] names = { "Ron", "Wilson", "Harry", "Grace", "Mike", "Ray" };
        Arrays.stream(names)
                .sorted()
                .filter((name)->name.startsWith("R"))
                .forEach(name-> System.out.println(name));



    }
}