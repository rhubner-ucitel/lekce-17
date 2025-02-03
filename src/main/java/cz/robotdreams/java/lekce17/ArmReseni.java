package cz.robotdreams.java.lekce17;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ArmReseni {

    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                try (
                        FileInputStream in = new FileInputStream("input.txt");
                        FileInputStream in2 = new FileInputStream("input.txt");
                ) {
                    while(true) {
                        int byte1 = in.read();
                        int byte2 = in2.read();
                        if(byte2 != byte1) {
                            System.out.println("Soubory nejsou stejne");
                            return;
                        }else {
                            if (byte1 == -1 || byte2 == -1) {
                                System.out.println("stejne soubory");
                                return;
                            }
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        r.run();

    }
}
