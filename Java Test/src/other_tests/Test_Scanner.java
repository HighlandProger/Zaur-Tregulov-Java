package other_tests;

import java.util.Scanner;

public class Test_Scanner {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int sum = 0;

            while (true) {
                if (scanner.hasNextInt()){
                    sum += scanner.nextInt();
                }
                else{
                    String word = scanner.next();
                    if(word.equals("ENTER")){
                        System.out.println(sum);
                        return;
                    }
                }
            }
    }
}
