package io_nio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test3_TryWithResources {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("IO_Test2.txt");
             FileReader reader = new FileReader("IO_Test1.txt")) {

            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
            System.out.println();
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
