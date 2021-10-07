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

        BufferedReader bReader = null;
        try {
            bReader = new BufferedReader(new FileReader(unNomDeFichier));
            String ligne = null;
            while ((ligne = bReader.readLine()) != null) {
                list.add(ligne);
            }
        } catch (IOException e) {
            System.err.println("erreur  de lecture : " + e.getMessage());
        } finally {
            if (bReader != null) {
                bReader.close();
            }
        }

        return list;
    }

    public static List<String> readNom() throws IOException {
        return readFichier("exercice/src/fr/io/nom.txt");

    }

    public static List<String> readPrenom() throws IOException {
        return readFichier("exercice/src/fr/io/prenom.txt");
    }
}