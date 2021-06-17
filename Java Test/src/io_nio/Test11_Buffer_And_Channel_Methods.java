package io_nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Test11_Buffer_And_Channel_Methods {
    public static void main(String[] args) {
        try(RandomAccessFile file = new RandomAccessFile("NIO_Test1.txt", "r");
            FileChannel channel = file.getChannel();){

            ByteBuffer buffer = ByteBuffer.allocate(5);
            channel.read(buffer);
            buffer.flip();
            System.out.println((char)buffer.get());//a
            System.out.println((char)buffer.get());//b
            System.out.println((char)buffer.get());//c

            System.out.println("-----------------------------------------");

            buffer.rewind();//return back
            System.out.println((char)buffer.get());//a

            System.out.println("-----------------------------------------");

            buffer.compact();//bcde -> to the top [b, c, d, e,   ]
            channel.read(buffer);//[b, c, d, e, f]
            buffer.flip();
            while (buffer.hasRemaining()){
                System.out.println((char)buffer.get());
            }

            System.out.println("-----------------------------------------");

            buffer.clear();
            channel.read(buffer);//[g, h, i, j, ]
            buffer.flip();
            System.out.println((char) buffer.get());//g
            buffer.mark();//h position marked
            System.out.println((char) buffer.get()+ " marked.");//h
            System.out.println((char) buffer.get());//i
            System.out.println((char) buffer.get()+ " using reset.");//j
            buffer.reset();//return to the marked position (h)
            while (buffer.hasRemaining()){
                System.out.println((char) buffer.get());
            }





        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
