package io_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Test13_Path2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("NIO_Test13.txt");
        Path directoryPath = Paths.get("/home/rusguardian/Рабочий стол/Zaur Test/Path");
        Path directoryBPath = Paths.get("/home/rusguardian/Рабочий стол/Zaur Test/B");


//        Files.copy(filePath, directoryPath.resolve(filePath));//Нужно указать имя файла, поэтому resolve

//        Files.copy(filePath, directoryPath.resolve("newName.txt"));//Нужно указать имя файла, поэтому resolve

//        Files.copy(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);//Замена существующего

//        Files.copy(directoryBPath, directoryPath.resolve("B"));// Только папка! Без содержимого

//        Files.move(Paths.get("NIO_Test13_move.txt"), directoryPath.resolve("NIO_Test13_move.txt"));

//        Files.move(Paths.get("NIO_Test13_rename.txt"), Paths.get("NIO_Test13_renamed.txt"));// Renaming

//        Files.delete(Paths.get("NIO_Test13_delete.txt"));// Deleting

//        Files.delete(directoryPath);// Deleting directory. ONLY EMPTY!!!
        System.out.println("Done!");
    }
}
