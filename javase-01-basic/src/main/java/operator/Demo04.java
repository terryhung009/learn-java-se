package operator;

public class Demo04 {
    public static void main(String[] args) {
        //++   --  自增  自減
        int a =3;
        int b =a++;  //執行這行代碼後，先給b賦值，再自增
        //a++  a= a+1
        System.out.println(a);
        //++a a = a+1
        int c =++a;  //執行這行代碼前，先給b賦值，再自增

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //冪運算  2的三次方 2^3
        double result = Math.pow(2,3);
        System.out.println(result);



    }

}
