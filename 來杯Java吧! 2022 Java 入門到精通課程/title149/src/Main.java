import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    /**
     *
     * @param array
     */
    public static void getAverage(int[] array){
        Arrays.stream(new int[] {2,4,6,8,10})
                .map(n -> n * n)  //map()可以將array內每個元素執行lambda表示式內的計算
                .average()  //將元素總和再除以元素數 -> 平均數
                .ifPresent(System.out::println);  //印出目前數值
    }

    /**
     *
     */
    public static void c(){
        ArrayList<String> people = new ArrayList<>();
        people.add("Ron");
        people.add("rat");
        people.add("Wilson");
        people.add("Harry");
        people.add("Grace");
        people.add("Mike");
        people.add("Ray");

        people.stream()
                .map(String::toLowerCase)  //將每個字改為小寫
//                .map(name -> name.toLowerCase())  //將每個字改為小寫，使用lambda
                .filter(name->name.startsWith("r"))  //只找出開頭是r的元素
                .forEach(System.out::println);  //迴圈印出元素
    }

    public static void a() throws IOException {
        Stream<String> bands = Files.lines(Paths.get("bands.txt"), StandardCharsets.UTF_8);
        bands
                .sorted()
                .filter(x->x.length() > 13)
                .forEach(System.out::println);
        bands.close();
    }

    public static void b() throws IOException {
        Stream<String> bands = Files.lines(Paths.get("bands.txt"), StandardCharsets.UTF_8);
        List<String> myLists = bands
                .filter(x->x.contains("jit"))
                .collect(Collectors.toList());
        myLists.forEach(name-> System.out.println(name));

        bands.close();
    }

    public static void main(String[] args) throws IOException {


    }
}