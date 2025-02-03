package cz.robotdreams.java.lekce17;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;

public class ReaderExample {


    public static void main(String[] args) throws IOException {
        //Reader reader = new FileReader("input.txt", Charset.defaultCharset());

        Reader reader = new FileReader("input.txt");
        char[] buff = new char[16];

        int precteno = 0;
        while((precteno = reader.read(buff)) != -1) {
            System.out.printf("Operace cteni precetla %d bajtu\n", precteno);
            for(int i = 0; i < precteno; i++) {
                System.out.print(buff[i]);
            }
            System.out.println("\n");
        }
        reader.close();
    }
}