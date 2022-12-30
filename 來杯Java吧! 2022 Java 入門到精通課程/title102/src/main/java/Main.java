import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**  wc command Unix
         *   Unix底下計算文字數量的command
         *   使用java模擬wc command的功能
         *
         *
         */

        String filename = JOptionPane.showInputDialog("Filename: ");
        File f = new File(filename);
//        File f = new File("sleep.txt");
        int line_count = 0;
        int word_count = 0;
        int char_count = 0;


        try {
            Scanner scanner = new Scanner(f);
            while(scanner.hasNextLine()){
                line_count++;
                String line = scanner.nextLine();
                String[] line_arr = line.split(" ");
                for(String word : line_arr){
                    word_count++;

                }
                char_count += line.length();

            }
            scanner.close();
            System.out.println("Line count is " + line_count);
            System.out.println("Word count is " + word_count);
            System.out.println("Character count is " + char_count);


        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
            System.out.println(f + " file not found.");
        }


        /*  使用Scanner讀取txt檔案內文字

         */
//        File f = new File("sleep.txt");
//        try {
//            Scanner scanner = new Scanner(f);
//            while(scanner.hasNext()){
//                String line = scanner.nextLine();
//                System.out.println(line);
//            }
//
//
//        } catch (FileNotFoundException e) {
////            throw new RuntimeException(e);
//            System.out.println(f + " file not found.");
//        }
    }
}
