package others.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test2 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new FileReader(new File("IO_Test8.txt")))){
            scanner.useDelimiter("\\W");
            Set<String> words = new TreeSet<>();
            while (scanner.hasNext()){
                words.add(scanner.next());
            }
            for (String s: words){
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
