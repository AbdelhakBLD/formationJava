package fr.io;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {

        List<String> prenomList = NomPrenomReader.readNom();
        List<String> nomList = NomPrenomReader.readPrenom();

        prenomList.forEach(prenom -> {
            System.out.println("prenom : " + prenom);
        });

        nomList.forEach(nom -> {
            System.out.println("nom : " + nom);
        });

        UtilisateurWriter.writeUtilisateur("exercice/src/fr/io/resultat.txt",nomList,prenomList,15);
    }
}

