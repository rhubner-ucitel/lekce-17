package cz.robotdreams.java.lekce17;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterExample {

    public static final char[] DATA_TO_WRITE = new char[] { 'c', '3', 'x'};

    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("writer-output.txt");
        writer.write("Hello World!\n");
        writer.write("Hello Java developers");
        writer.write(DATA_TO_WRITE);
        writer.close();

        CharArrayWriter out = new CharArrayWriter(64);
        out.write("Text co se zapise do pole");
        char[] vyslednePole = out.toCharArray();

        System.out.println(vyslednePole);

    }
}