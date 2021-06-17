package others.scanner;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter the digit");
//        int i = scanner.nextInt();
//        System.out.println("You entered: " + i);

//        System.out.println("Enter the word");
//        String s = scanner.next();
//        System.out.println("You entered: " + s);

//        System.out.println("Enter the double");
//        double d = scanner.nextDouble();
//        System.out.println("You entered: " + d);

        Scanner newScanner = new Scanner("Hi my friend!\nHow are you doing?\nWhats up?");

        System.out.println(newScanner.nextLine());

        System.out.println("--------------------------------------------");

        while (newScanner.hasNextLine()){
            System.out.println(newScanner.nextLine());
        }

        System.out.println("--------------------------------------------");

        System.out.println("Enter the word and you'll see the third character in that");
        System.out.println(scanner.next().charAt(2));

    }
}
