package io_nio.Test7_Serialization.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test7_Serialization {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Ivan");
        employees.add("Oleg");
        employees.add("John");
        try(ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("IO_Test7.bin")
        )){
            outputStream.writeObject(employees);
            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
