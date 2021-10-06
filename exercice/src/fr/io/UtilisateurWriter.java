package fr.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UtilisateurWriter {

    public UtilisateurWriter() {
    }

    public static void writeUtilisateur(String unNomDeFichier, java.util.List<String> desNoms, java.util.List<String> desPrenoms, int combien) throws IOException {
        BufferedWriter writer = null;
        try {
            int nombre = 123;
            writer = new BufferedWriter(new FileWriter("exercice/src/fr/io/resultat.txt"));
            writer.write(combien);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("erreur d'écriture: " + e.getMessage());
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
