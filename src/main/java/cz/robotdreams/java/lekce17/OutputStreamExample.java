package cz.robotdreams.java.lekce17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HexFormat;


public class OutputStreamExample {

    private static final HexFormat HEX_FORMAT = HexFormat.ofDelimiter(" ");
    private static final byte[] DATA_TO_WRITE = new byte[] {
            0x30, 0x31, 0x32, 0x32,0x34,0x35,0x36,0x37, '\n',
            0x30, 0x31, 0x32, 0x32,0x34,0x35,0x36,0x37, '\n'
    };


    public static void main(String[] args) throws IOException {
        FileOutputStream fin = new FileOutputStream("output.txt");
        fin.write(DATA_TO_WRITE);
        fin.close();
    }
}