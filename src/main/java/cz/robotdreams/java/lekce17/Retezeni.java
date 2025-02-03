package cz.robotdreams.java.lekce17;

import java.io.*;

public class Retezeni {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("input.txt"), "UTF-8"
                )
        );

//        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt"), "UTF-8"));


        String line;
        while((line = in.readLine()) != null) {
            System.out.println("Prečten řádek : \n" + line);
        }

        in.close(); //Uzavre vsechny predchozi streamy.
    }
}
