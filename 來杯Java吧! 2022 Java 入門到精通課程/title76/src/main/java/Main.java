import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0 ;i<20;i++){
            array.add(i);
        }
        int somethingToRemove = -1;
        for(int k :array){
            if(k==10){
//                array.remove(k);
            somethingToRemove = k;
            }
        }
        array.remove(somethingToRemove);
    }
}
