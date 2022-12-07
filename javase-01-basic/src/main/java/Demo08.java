public class Demo08 {
    //類變量 static
    static double salary = 2500;

    //屬性:變量

    //實例變量:從屬於對象 ; 如果不字型初始化，這個類型的默認值 0  0.0
    //布爾值 : 默認是false
    //除了基本類型其餘默認值都是null
    String name;

    int age;



    //main方法
    public static void main(String[] args) {

        
        //局部變量 : 必須聲明和初始化值
        int i =10;
        System.out.println(i);

        //變量類型  變量名字 = new Demo08();
        Demo08 demo = new Demo08();
        System.out.println(demo.age);
        System.out.println(demo.name);


        //類變量 static
        System.out.println(salary);


    }

    //其他方法
    
}
