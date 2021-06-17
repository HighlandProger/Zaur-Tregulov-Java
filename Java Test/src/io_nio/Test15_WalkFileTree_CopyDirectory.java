package io_nio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Test15_WalkFileTree_CopyDirectory {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("/home/rusguardian/Рабочий стол/Zaur Test");
        Path destination = Paths.get("/home/rusguardian/Рабочий стол/Zaur Test/copyWalkFileTree");

//        if (!Files.exists(destination))
//            Files.createDirectory(destination);

        Files.walkFileTree(source, new MyFileVisitor2(source, destination));
    }
}

class MyFileVisitor2 extends SimpleFileVisitor <Path>{

    Path source;
    Path destination;

    MyFileVisitor2(Path source, Path destination){
        this.source = source;
        this.destination = destination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {

        // При цикличности, когда destination inside source

        if(dir.getFileName().equals(destination.getFileName())) {
            return FileVisitResult.SKIP_SUBTREE;
        }

            Path newDestination = destination.resolve(source.relativize(dir));
            Files.copy(dir, newDestination, StandardCopyOption.REPLACE_EXISTING);
            return FileVisitResult.CONTINUE;


    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(file));
        Files.copy(file, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }
}
