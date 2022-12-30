import java.util.HashMap;
import java.util.Map;

public class Main {


    public Main(){
        Map<String , Integer> incomeMap = new HashMap<String , Integer>();
        incomeMap.put("Hary",3000);
        incomeMap.put("Ron",4500);
        incomeMap.put("Wilson",6000);
        incomeMap.put("Grace",7500);

        System.out.println("============================");
        for(Map.Entry<String, Integer> entry : incomeMap.entrySet()){
            System.out.println(entry.getKey()+ " , " + entry.getValue());
        }
//        incomeMap.forEach((name, income) ->{
//            System.out.println(name + " , " + income);
//        });

    }



    public static void main(String[] args) {
        new Main();
    }
}
