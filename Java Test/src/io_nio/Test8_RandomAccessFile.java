package io_nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Test8_RandomAccessFile {
    public static void main(String[] args) {
        try(RandomAccessFile file =
                    new RandomAccessFile("IO_Test8.txt", "rw")){

            int a = file.read();
            System.out.println((char)a);

            String line = file.readLine();
            System.out.println(line);

            file.seek(50);
            System.out.println(file.readLine());

            long position = file.getFilePointer();
            System.out.println(position);

            file.seek(0);
            file.writeBytes("CHANGED");

            file.seek(file.length()-1);
            file.writeBytes("\n\t\t\tElvis Presley");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
