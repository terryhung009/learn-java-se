public class Main {
    public static void main(String[] args) {

        int second = 0;


        while(true){
            if(second * 1 + second * 30 * 2.54 / 100 > 200){
                break;
            }

            second++;
        }


        System.out.println("經過 " + second +" 秒後會相遇");


    }
}
