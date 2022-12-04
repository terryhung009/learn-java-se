public class Main {

    public static void main(String[] args) {
//        String test = "上海自來水來自海上";
//        String test = "喜歡的少年是你，你是年少的歡喜";
//        String test = "how are you doing?";
        String test = "小巷殘月凝天空，親人故土鄉情濃，笑聲猶在空懷舊，憔心客愁滿蒼穹，穹蒼滿愁客心憔，舊懷空在猶聲笑，濃情鄉土故人親，空天凝月殘巷小";
        boolean reverse = true;
        for(int i =0; i<test.length();i++){
            if(test.charAt(i) != test.charAt(test.length()-1-i)){
                reverse = false;
            }
        }

        if(reverse){
            System.out.println( test + "  是迴文 ");
        }else{
            System.out.println( test + "  不是迴文 ");
        }


    }
}