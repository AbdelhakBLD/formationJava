package fr.banque;

import java.util.Arrays;

public class Client {

    private String nom;
    private String prenom;
    private Integer age;
    private Integer numero;
    private Compte[] comptes = new Compte [5];

    public Client(String nom, String prenom, Integer age, Integer numero, Compte[] comptes) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setAge(age);
        this.setNumero(numero);
        this.setComptes(comptes);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Compte[] getComptes() {
        return comptes;
    }

    public void setComptes(Compte[] comptes) {
        this.comptes = comptes;
    }

    public void ajouterCompte(Compte unCompte) {
        //méthode qui regarde dans le tableau de compte et place
        // le paramètre dans la première case vide (c.a.d null) du tableau.
        // Dans le cas où il n'y a plus de case vide, afficher un message
    }

    public Compte getCompte(Integer numeroCompte) {
        //méthode qui parcours le tableau des comptes et donne le premier compte
        // qui a comme numéro la valeur du paramètre. Dans le cas où
        // vous ne trouvez aucun compte qui a le bon numéro, affichez un message.
        // Attention, n'oubliez pas que votre tableau contient des null par défaut.
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
