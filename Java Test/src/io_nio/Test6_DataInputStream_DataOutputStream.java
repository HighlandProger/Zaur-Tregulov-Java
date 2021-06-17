package io_nio;

import java.io.*;

public class Test6_DataInputStream_DataOutputStream {
    public static void main(String[] args) {
        try(DataOutputStream output = new DataOutputStream(
                    new FileOutputStream( "IO_Test6.bin"));
            DataInputStream input = new DataInputStream(
                    new FileInputStream("IO_Test6.bin"));
            ) {

            output.writeBoolean(true);
            output.writeByte(5);
            output.writeShort(120);
            output.writeInt(500);
            output.writeLong(1_000_000L);
            output.writeFloat(3.14F);
            output.writeDouble(123.456);

            //Соблюдай последовательность чтения!

            System.out.println(input.readBoolean());
            System.out.println(input.readByte());
            System.out.println(input.readShort());
            System.out.println(input.readInt());
            System.out.println(input.readLong());
            System.out.println(input.readFloat());
            System.out.println(input.readDouble());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
