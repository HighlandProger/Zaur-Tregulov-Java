package io_nio.Test7_Serialization;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Test9_File {
    public static void main(String[] args) throws IOException {

        File file = new File("test2.txt");
        File folder = new File ("/home/rusguardian/Рабочий стол/Zaur Test/A");
        File file2 = new File("/home/rusguardian/Рабочий стол/Zaur Test/A/test1.txt");
        File folder2 = new File("/home/rusguardian/Рабочий стол/Zaur Test/B");


        System.out.println("file.getAbsoluteFile() " + file.getAbsoluteFile());
        System.out.println("folder.getAbsoluteFile() " + folder.getAbsoluteFile());
        System.out.println("-----------------------------------------------");

        System.out.println("file.isAbsolute() " + file.isAbsolute());
        System.out.println("folder.isAbsolute() " + folder.isAbsolute());
        System.out.println("-----------------------------------------------");

        System.out.println("file.isDirectory() " + file.isDirectory());
        System.out.println("folder.isDirectory() " + folder.isDirectory());
        System.out.println("-----------------------------------------------");

        System.out.println("file.exists() " + file.exists());
        System.out.println("folder.exists() " + folder.exists());
        System.out.println("-----------------------------------------------");

        System.out.println("folder.mkdir() " + folder.mkdir());
        System.out.println("folder2.mkdir() " + folder2.mkdir());
        System.out.println("file.createNewFile() " + file.createNewFile());//Если есть такая директория
        System.out.println("file2.createNewFile() " + file2.createNewFile());
        System.out.println("-----------------------------------------------");

        System.out.println("file2.length() " + file2.length());
        System.out.println("folder.length() " + folder.length());
        System.out.println("-----------------------------------------------");

//        System.out.println("file2.delete() " + file2.delete());
//        System.out.println("folder.delete() " + folder.delete());// Если пусто!
//        System.out.println("folder2.delete() " + folder2.delete());
        System.out.println("-----------------------------------------------");

        File [] files = folder.listFiles();
        System.out.println(Arrays.toString(files));
        System.out.println("-----------------------------------------------");

        System.out.println("file2.isHidden() " + file2.isHidden());
        System.out.println("file2.canRead() " + file2.canRead());
        System.out.println("file2.canWrite() " + file2.canWrite());
        System.out.println("file2.canExecute() " + file2.canExecute());
        System.out.println("-----------------------------------------------");

    }
}
