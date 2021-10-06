package fr.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NomPrenomReader {

    public NomPrenomReader() {
    }

    private static List<String> readFichier(String unNomDeFichier) throws IOException {
        List<String> list = new ArrayList<>();

        File fichier = new File("exercice/src/fr/io/" + unNomDeFichier);

        if (fichier.exists()) {


            FileReader fr = new FileReader(fichier);
            BufferedReader br = new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();
            String line;
            try {
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                    sb.append("\n");
                }
                list = Collections.singletonList(line);
            } catch (IOException e) {
                System.err.println("erreur d'écriture: " + e.getMessage());
            } finally {
                fr.close();
            }
            System.out.println(fichier.getAbsolutePath() + " existe");
            System.out.println("Contents of File: ");
            System.out.println(sb.toString());

        } else {
            System.out.println(fichier.getAbsolutePath() + " n'existe pas");
        }
        return list;
    }

    public static List<String> readNom() throws IOException {
        return readFichier("nom.txt");

    }

    public static List<String> readPrenom() throws IOException {
        return readFichier("prenom.txt");
    }
}
