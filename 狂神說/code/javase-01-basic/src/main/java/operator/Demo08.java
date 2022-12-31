package operator;

//三元運算符
public class Demo08 {
    public static void main(String[] args) {
        //x ? y : z
        //如果 x== true，則結果為y，否則為z

        int score = 50;
        String result = score < 60 ? "不及格" : "及格";
        //相當於if
        System.out.println(result);

    }



}
