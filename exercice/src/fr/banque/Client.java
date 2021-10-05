package fr.banque;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Client {

    private String nom;
    private String prenom;
    private Integer age;
    private Integer numero;
    private Compte[] comptes = new Compte [5];

    public Client(String nom, String prenom, Integer age, Integer numero) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setAge(age);
        this.setNumero(numero);
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Compte[] getComptes() {
        return this.comptes;
    }

    public void setComptes(Compte[] comptes) {
        this.comptes = comptes;
    }

    public void setCompte(Compte unCompte, Integer index) {
        this.comptes = comptes;
    }

    public void ajouterCompte(Compte unCompte) {
        for(int i = 0; i < this.getComptes().length; i++) {
            if(this.getComptes()[i] == null) {
                this.setCompte(unCompte, i);
                break;
            } else {
                System.out.println("Compte plein !");
            }
        }
    }

    public Compte getCompte(Integer numeroCompte) {
        Compte compteCopy = null;
        for (Compte compte : this.getComptes()) {
                if(compte.getNumero().equals(numeroCompte)) {
                    compteCopy = compte;
                } else {
                    System.out.println("Compte inconnu !");
                }
        }
        return compteCopy;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", numero=" + numero +
                ", comptes=" + Arrays.toString(comptes) +
                '}';
    }
}
