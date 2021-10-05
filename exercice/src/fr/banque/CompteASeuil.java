package fr.banque;

import java.sql.SQLOutput;

public class CompteASeuil extends Compte {

    private Double seuil;

    public CompteASeuil(Integer numero, Double solde, Double seuil) {
        super(numero, solde);
        this.setSeuil(seuil);
    }

    public Double getSeuil() {
        return seuil;
    }

    public void setSeuil(Double seuil) {
        this.seuil = seuil;
    }

    public void retirer(Double uneValeur) {
        if((this.getSolde() - uneValeur) > this.getSeuil()) {
            super.retirer(uneValeur);
        }else {
            System.out.println("Sold du compte trop bas");
        }
    }

    @Override
    public String toString() {
        return "CompteASeuil{" +
                "seuil=" + seuil +
                '}';
    }
}
