package io_nio;

import java.io.FileWriter;
import java.io.IOException;

public class Test1_FileWriter {
    public static void main(String[] args) throws IOException {
        String poem = "Кто понял жизнь - тот больше не спешит.\n" +
                "Смакует каждый миг и наблюдает, \n" +
                "Как спит ребенок, молится старик, \n" +
                "Как дождь идёт и как снежинка тает. \n";

        FileWriter writer = null;
        try {
            writer = new FileWriter("IO_Test1.txt", true);

//            for (int i = 0; i < poem.length(); i++){
//                writer.write(poem.charAt(i)); Invisible casting
//            }

//            writer.write(poem); In

            writer.write("You can add anything, when parameter is true.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            writer.close();
        }
        System.out.println("Done!");
    }
}
