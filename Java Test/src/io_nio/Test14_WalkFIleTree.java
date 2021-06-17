package io_nio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Test14_WalkFIleTree {
    public static void main(String[] args) throws IOException {
        Path startPath = Paths.get("/home/rusguardian/Рабочий стол/Zaur Test");
        Files.walkFileTree(startPath, new MyFileVisitor());
    }
}

class MyFileVisitor implements FileVisitor<Path>{

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Enter to Directory: " +dir.getFileName());
        return FileVisitResult.CONTINUE;//TERMINATE, SKIP_SUBTREE, SKIP_SIBLINGS
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("File name: " + file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println("Error while visiting file: " + file.getFileName());
        return FileVisitResult.TERMINATE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Exit from Directory: " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }
}
