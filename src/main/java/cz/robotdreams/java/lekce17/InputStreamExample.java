package cz.robotdreams.java.lekce17;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HexFormat;


public class InputStreamExample {

    private static final HexFormat HEX_FORMAT = HexFormat.ofDelimiter(" ");

    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("input.txt");

        byte[] buff = new byte[16];
        int precteno = 0;

        while((precteno = fin.read(buff)) != -1) {
            System.out.printf("Operace cteni precetla %d bajtu : ", precteno);

            System.out.print(HEX_FORMAT.formatHex(buff, 0, precteno));

            System.out.println("\n");
        }
        fin.close();
    }
}