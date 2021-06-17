package io_nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Test10_Buffer_And_Channel {
    public static void main(String[] args) {
        try(RandomAccessFile file =
                new RandomAccessFile("IO_Test8.txt", "rw");
            FileChannel channel = file.getChannel();){

            ByteBuffer buffer = ByteBuffer.allocate(10);
            StringBuilder stih = new StringBuilder();

            int byteRead = channel.read(buffer);

            while (byteRead>0){
                System.out.println("Read " + byteRead);

                buffer.flip();

                while (buffer.hasRemaining()) {
                    stih.append((char) buffer.get());
                }

                buffer.clear();
                byteRead = channel.read(buffer);
            }
            System.out.println(stih);

            String text = "\n\nNothing else matters.";

            ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes());

//            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);
//            buffer2.put(text.getBytes());
//            buffer2.flip();

            channel.write(buffer2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
