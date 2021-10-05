package fr.banque;

public class Main {

    public static void main(String[] args) {
        Compte cpt = new Compte(1234, 1452.25);
        CompteRemunere cptR = new CompteRemunere(1234, 2.5, 0.5);
        System.out.println("last sold");
        System.out.println(cptR.getSolde());
        cptR.verserInterets();
        System.out.println("new sold");
        System.out.println(cptR.getSolde());
        CompteASeuil cptS = new CompteASeuil(1234, 5.0, 10.0);
        System.out.println(cptR.getSolde());
        cptS.retirer(10);
        System.out.println(cptR.getSolde());

        Client abdel = new Client("belaid", "abdelhak", 28, 12445);
        Compte cas = new CompteASeuil(124, 2555d, 100d);
        Compte cr = new CompteRemunere(352, 6000d, 0.2);
        abdel.ajouterCompte(cas);
        abdel.ajouterCompte(cr);
        abdel.getCompte(124).retirer(150);
        abdel.getCompte(124).ajouter(150d);
        System.out.println(abdel.getCompte(124).getSolde());

    }

}
