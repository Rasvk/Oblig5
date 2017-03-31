package com.rasmusvk;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String filnavn = null;

        if (args.length > 0) {
            filnavn = args[0];
        } else {
            System.out.println("FEIL! Riktig bruk: "
                    + "java Oblig5 <labyrintfil>");
            return;
        }
        File fil = new File(filnavn);
        Labyrint l = null;
        try {
            l = Labyrint.lesFraFil(fil);
        } catch (FileNotFoundException e) {
            System.out.printf("FEIL: Kunne ikke lese fra '%s'\n", filnavn);
            System.exit(1);
        }
        l.settMinimalUtskrift();

        // les start-koordinater fra standard input
        /*Scanner inn = new Scanner(System.in);
        while (inn.hasNextLine()) {
            String[] ord = inn.nextLine().split(" ");
            int startKol = Integer.parseInt(ord[0]);
            int startRad = Integer.parseInt(ord[1]);
            /*Liste<String> utveier = l.finnUtveiFra(startKol, startRad);
            if (!utveier.erTom()) {
                for (String s : utveier) {
                    System.out.println(s);
                }
            } else {
                System.out.println("Ingen utveier.");
            }
            System.out.println();
        }*/

            /**write your code here
             Labyrint l = null;
             File fil = new File("1.in.txt");
             try {
             l = Labyrint.lesFraFil(fil);
             } catch (FileNotFoundException e){
             System.out.println("ERROR");
             }
             System.out.println(l.toString());
             Rute[][] lab = l.getLabyrint();
             lab[1][2].skrivNaboer(); */
    }
}


