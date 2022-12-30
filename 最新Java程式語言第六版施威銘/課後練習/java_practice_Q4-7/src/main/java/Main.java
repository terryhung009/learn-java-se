public class Main {
    public static void main(String[] args) {
        int chicken,rabbit;
        int foot,head;
        // chicken + rabbit = 8
        // 2 * chicken + 4 * rabbit = 26
        // rabbit = 8 - chicken
        // 2 * chicken + 4 * (8 - chicken) =26
        //32- 2 * chicken = 26
        //chicken = 3
        //rabbit = 5

        //solution 1
//        for(chicken = 0;chicken<8 ; chicken++){
//            for (rabbit = 0;rabbit<8 ; rabbit++){
//                if(chicken+rabbit == 8 && 2 * chicken + 4 * rabbit == 26){
//                    System.out.println("雞的數量為 " + chicken + " ，兔的數量為" + rabbit);
//                }
//            }
//        }

        //solution 2
        chicken = 0;

        while(chicken < 8){
            rabbit = 8 - chicken;
            if(2 * chicken + 4 * rabbit == 26){
                System.out.println("雞的數量為 " + chicken + " ，兔的數量為" + rabbit);
            }
            chicken++;
        }







    }
}
