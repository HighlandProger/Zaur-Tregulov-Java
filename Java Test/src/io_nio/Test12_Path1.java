package io_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class Test12_Path1 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("NIO_Test2.txt");
        Path directoryPath = Paths.get("/home/rusguardian/Рабочий стол/Zaur Test/Path");

        System.out.println("filePath.getFileName() " + filePath.getFileName());// NIO_Test2.txt
        System.out.println("directoryPath.getFileName() " + directoryPath.getFileName());// Path
        System.out.println("------------------------------------------------------------------");

        System.out.println("filePath.getParent() " + filePath.getParent());// null (Путь относительный)
        System.out.println("directoryPath.getParent() " + directoryPath.getParent());// /home/rusguardian/Рабочий стол
        System.out.println("------------------------------------------------------------------");

        System.out.println("filePath.getRoot() " + filePath.getRoot());// null
        System.out.println("directoryPath.getRoot() " + directoryPath.getRoot());// /
        System.out.println("------------------------------------------------------------------");

        System.out.println("filePath.isAbsolute() " + filePath.isAbsolute());// false
        System.out.println("directoryPath.isAbsolute() " + directoryPath.isAbsolute());// true
        System.out.println("------------------------------------------------------------------");

        System.out.println("filePath.toAbsolutePath() " + filePath.toAbsolutePath());// /home/rusguardian/Рабочий стол/Zaur Tregulov JAVA/NIO_Test2.txt
        System.out.println("directoryPath.toAbsolutePath() " + directoryPath.toAbsolutePath());// /home/rusguardian/Рабочий стол/Path
        System.out.println("------------------------------------------------------------------");

        // /home/rusguardian/Рабочий стол/Path + / + NIO_Test2.txt
        System.out.println("directoryPath.resolve(filePath) " + directoryPath.resolve(filePath));
        System.out.println("------------------------------------------------------------------");

        Path anotherPath = Paths.get("/home/rusguardian/Рабочий стол/Path/1/2/test20.txt");
        System.out.println("directoryPath.relativize(anotherPath) " + directoryPath.relativize(anotherPath));// 1/2/test20.txt
        System.out.println("------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------");

        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        }

        if (!Files.exists(directoryPath)) {
            Files.createDirectory(directoryPath);
        }

        System.out.println("Files.isReadable(filePath) " + Files.isReadable(filePath));// true
        System.out.println("Files.isWritable(filePath) " + Files.isWritable(filePath));// true
        System.out.println("Files.isExecutable(filePath) " + Files.isExecutable(filePath));// false (?)
        System.out.println("------------------------------------------------------------------");

        Path filePath2 = Paths.get("/home/rusguardian/Рабочий стол/Zaur Tregulov JAVA/NIO_Test2.txt");
        System.out.println("Files.isSameFile(filePath, filePath2) " + Files.isSameFile(filePath, filePath2));// true
        System.out.println("------------------------------------------------------------------");

        System.out.println("Files.size(filePath) " + Files.size(filePath));// 10 (Dorou bro!)
        System.out.println("------------------------------------------------------------------");

        //2021-06-11T12:28:23.283258362Z
        System.out.println("Files.getAttribute(filePath, \"creationTime\") " + Files.getAttribute(filePath, "creationTime"));// 10 (Dorou bro!)
        System.out.println("------------------------------------------------------------------");

        Map<String, Object> fileAttributes = Files.readAttributes(filePath, "*");

        //lastAccessTime:2021-06-11T12:28:23.283258362Z
        //lastModifiedTime:2021-06-11T12:28:23.283258362Z
        //size:10
        //creationTime:2021-06-11T12:28:23.283258362Z
        //isSymbolicLink:false
        //isRegularFile:true
        //fileKey:(dev=805,ino=2753011)
        //isOther:false
        //isDirectory:false
        for (Map.Entry<String, Object> entry: fileAttributes.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }


    }
}
