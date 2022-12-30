public class Main {
    public static void main(String[] args) {
        int target = 100;
        int sum = 0;
        //solution 1
//        for(;target > 0; target--){
//            sum = target + sum;
//        }
//        System.out.println("1+2+3…+97+98+99+100的結果為 " + sum);

        //solution 2
        while(target > 0){
            sum = target + sum;
            target--;
        }
        System.out.println("1+2+3…+97+98+99+100的結果為 " + sum);
    }
}
