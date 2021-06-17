package io_nio.Test7_Serialization.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test7_Serialization2 {
    public static void main(String[] args) {
        Car car = new Car ("Lamborgini", "Blue");
        Employee employee = new Employee("Ivan", "IT", 25, 500.0);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("IO_Test7_2.bin")
        )) {
            outputStream.writeObject(employee);
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
