package fr.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class UtilisateurWriter {

    public UtilisateurWriter() {
    }

    public static void writeUtilisateur(String unNomDeFichier, java.util.List<String> desNoms, java.util.List<String> desPrenoms, int combien) throws IOException {

        String[] genres = new String[] {"Mr", "Mm"};
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(unNomDeFichier));
            for (int i = 0; i < combien; i++) {
                String userWrite = "";
                userWrite = String.valueOf(i+1).concat(";")
                        .concat(String.valueOf(genres[new Random().nextInt(genres.length)]))
                        .concat(";")
                        .concat(desNoms.get(new Random().nextInt(desNoms.size())))
                        .concat(";")
                        .concat(desPrenoms.get(new Random().nextInt(desPrenoms.size())));
                System.out.println("userWrite : " + userWrite);
                writer.write(userWrite);
                writer.newLine();
            }
            writer.flush();
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