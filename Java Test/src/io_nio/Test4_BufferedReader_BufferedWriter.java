package io_nio;

import java.io.*;

public class Test4_BufferedReader_BufferedWriter {
    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader("IO_Test1.txt"));
            BufferedWriter writer  = new BufferedWriter (new FileWriter("IO_Test2.txt"));) {

//            int character;
//            while ((character = reader.read()) != -1) {
//                writer.write((char)character);
//            }
            String line;
            while ((line = reader.readLine())!=null){
                writer.write("\n"+line+"\n");
            }
            System.out.println("Done!");
        }

    }

}
