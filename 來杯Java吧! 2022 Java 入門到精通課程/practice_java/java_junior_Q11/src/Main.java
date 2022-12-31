public class Main {

    public static void printStars(int space, int stars ){
        String result = "";
        for(int i =0; i < space; i++){
            result += " ";
        }

        for(int j = 0; j < stars; j++){
            result += "*";
        }
        System.out.println(result);

    }


    public static void reversePyramid(int n){
        int space = 0;
        int stars = 2 * n -1;

//        while(space <= n-1){
//            printStars(space , stars);
//            space++;
//            stars-=2;
//        }

        while(stars >=1){
            printStars(space , stars);
            space++;
            stars-=2;
        }



    }



    public static void main(String[] args) {
        reversePyramid(1);
        System.out.println("========================");
        reversePyramid(3);
        System.out.println("========================");
        reversePyramid(5);
    }
}