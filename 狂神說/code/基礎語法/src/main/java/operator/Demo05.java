package operator;

//邏輯運算符
public class Demo05 {
    public static void main(String[] args) {
        // 與(and)   或(or)    非(取反)
        boolean a =true;
        boolean b =false;

        System.out.println("a && b: "+(a && b));//邏輯與運算，兩個變量都為真，結果才為真
        System.out.println("a || b: " +(a || b));//邏輯或運算，兩個變量有一個為真，則結果才為true
        System.out.println("! (a && b): " +(! (a && b)));//如果是真，則變為假，如果是假則變為真

        //短路運算
        int c =5;
        boolean d = (c<4)&&(c++<4);

        System.out.println(d);
        System.out.println(c);//c並不是6，代表後面c++沒有執行，短路了


    }



}
