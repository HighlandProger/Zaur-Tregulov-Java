package io_nio;

import java.io.*;

public class Test5_FileInputStream_FileOutputStream {
    public static void main(String[] args) {
        try (BufferedInputStream  inputStream = new BufferedInputStream(new FileInputStream(
                "/home/rusguardian/Загрузки/MountainPicture.jpg"));
             BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(
                     "IO_TestIMG.jpg"));) {

            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
