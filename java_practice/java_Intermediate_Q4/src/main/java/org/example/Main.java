package org.example;

public class Main {

    public static String  factorPrime(int n){
        String result = n + " = ";
        int starter = 2;
        while(starter <= n){
            if (n % starter == 0){
                result += starter + " x ";
                n /= starter;
            }else {
                starter++;
            }
        }

        return result;
//    return result.substring(0,result.length() - 3);



    }

    public static void main(String[] args) {
        System.out.println(factorPrime(125));
        System.out.println(factorPrime(45512));
        System.out.println(factorPrime(54887544));
        System.out.println(factorPrime(966969455));
    }
}