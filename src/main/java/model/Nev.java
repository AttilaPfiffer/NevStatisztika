package model;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors


public class Nev {
    private String betu;
    private String[][] elhelyezes;

    public Nev(String betu) {
        this.betu = betu;
        betuElhelyez();
        fajlbaKiir();
    }


    public void betuElhelyez() {
        elhelyezes = new String[][]{
                {"", betu, betu, "*"},
                {betu, " ", "", betu},
                {betu, "", " ", betu},
                {betu, betu, betu, betu},
                {betu, " ", " ", betu},
                {betu, " ", " ", betu},
                {betu, " ", " ", betu}
        };
    }

    public void kirajzol() {
        if (betu == "") {
            System.out.println("Nincs megadva betű.");
        }

        for (String[] sor : elhelyezes) {
            for (String cella : sor) {
                System.out.print(cella);
            }
            System.out.println();
        }
    }

    public int jelekSzamaSorban(int sor) {
        return 0;
    }

    public boolean teliSor(int sor) {
        return false;
    }


    public void fajlbaKiir(){
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            for(int i = 0; i < 100; i ++) {
                myWriter.write("-");
            }
            myWriter.close();
            System.out.println("Sikeres fájlbaírás.");
        } catch (IOException e) {
            System.out.println("Hiba történt.");
        }
    }
}
