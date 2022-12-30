import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void printArrayList(){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(30);
        arr.add(40);
        arr.add(50);

        for(int i :arr ){
            System.out.println(i);
        }

        arr.forEach(i-> System.out.println(i));
    }
    public static void printMap(){
        Map<String, Integer> map = new HashMap<>();
        map.put("Wilson", 30);
        map.put("Grace", 40);
        map.put("Mike", 50);

        map.forEach((k, v)-> {
            System.out.println("Key is "+ k +" , and value is " + v);
        });
    }
    public static void main(String[] args) {
        Thread t1 = new Thread( () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });

        t1.start();


//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//              for(int i = 0;i< 10;i++){
//                 System.out.println(i);
//            }
//           }
//        });
//
//        t1.start();


//        PrintWithThread p1 = new PrintWithThread();
//        PrintWithThread p2 = new PrintWithThread();
//        Thread t1 = new Thread(p1);
//        Thread t2 = new Thread(p2);
//        t1.start();
//        t2.start();

    }
}


class PrintWithThread implements Runnable{

    @Override
    public void run(){
        for(int i = 0;i < 10;i++){
            System.out.println(i);
        }
    }
}