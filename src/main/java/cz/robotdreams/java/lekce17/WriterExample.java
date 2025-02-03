package cz.robotdreams.java.lekce17;

import java.io.FileWriter;
import java.io.IOException;

public class WriterExample {

    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("writer-output.txt");
        writer.write("Hello World!");
        writer.close();
    }
}