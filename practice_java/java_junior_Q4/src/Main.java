public class Main {
    /**
     *
     *
     * int k = 2639;
     * 找出個位數
     * System.out.println(k % 10);
     * 找出十位數
     * System.out.println(k / 10 % 10);
     * 找出百位數
     * System.out.println(k / 100 % 10);
     *
     * @param args
     */
    public static void main(String[] args) {
        for(int i = 100;i < 1000; i++){
            int units = i % 10;
            int ten = i / 10 % 10;
            int hundreds  =  i / 100 % 10;

            int sum = (int) (Math.pow(units,3) + Math.pow(ten,3) + Math.pow(hundreds, 3));
            if(sum == i){
                System.out.println(" 三位數水仙花數有:  "+ i);
            }


        }

    }
}