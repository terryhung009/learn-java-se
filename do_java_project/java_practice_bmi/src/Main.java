import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    private static final DecimalFormat DF = new DecimalFormat("0.00");

    public static void main(String[] args) {
        //BMI calculator (kg/m2)



        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入您的體重(公斤) ： ");
        double weight = scanner.nextDouble();

        System.out.print("請輸入您的身高(公分) ： ");
        double height = scanner.nextDouble() / 100;

//        double bmi = weight / (height * height);
        double bmi = Double.parseDouble(DF.format(weight / (height * height)));
        System.out.println("您的BMI是 " + bmi);
        
        if(bmi <18.5){
            System.out.println("您屬於過輕");
        } else if(bmi < 24){
            System.out.println("您屬於正常");
        } else if (bmi < 30) {
            System.out.println("您屬於微胖");
        } else {
            System.out.println("您屬於過胖");
        }

    }
}
