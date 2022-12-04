import java.util.Scanner;

public class Main {
    public static int simpleLCS(String s1, String s2){
        if(s1.length() == 0 || s2.length() ==0 ){
            return 0;
        }else{
            if(s1.charAt(s1.length() -1) == s2.charAt(s2.length()-1)){
                return 1 + simpleLCS(s1.substring(0,s1.length()-1),
                        s2.substring(0,s2.length()-1));

            }else{
                return Math.max(
                        simpleLCS( s1.substring(0,s1.length()-1 ), s2 ),
                        simpleLCS( s2.substring(0,s2.length()-1 ), s1 )
                );
            }
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First String:  ");
        String s1 = scanner.nextLine();
        System.out.println("Second String:  ");
        String s2 = scanner.nextLine();

        System.out.println(simpleLCS(s1,s2));



    }
}