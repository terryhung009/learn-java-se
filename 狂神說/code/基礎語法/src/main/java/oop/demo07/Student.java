package oop.demo07;

//Static :
public class Student {

    private static int age;//靜態的變量  多線程!
    private double score;//非靜態的變量

    public void run(){

    }
    public static void go(){

    }

    public static void main(String[] args) {
        Student s1 =new Student();

        System.out.println(Student.age);
//        System.out.println(Student.score);//不可以訪問非靜態
        System.out.println(s1.age);
        System.out.println(s1.score);

        //======================================
        new Student().run();

        Student.go();
        go();


    }



}
