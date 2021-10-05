package fr.banque;

public class CompteRemunere extends Compte {

    private Double taux = 0.0;

    public CompteRemunere(Integer numero, Double solde, Double taux) {
        super(numero, solde);
        this.setTaux(taux);
    }

    public Double getTaux() {
        return taux;
    }

    public void setTaux(Double taux) {
        if (taux <= 0 && taux <= 1) {
            this.taux = taux;
        }else{
            System.out.println("mauvais taux");
        }
    }

    private Double calculerInterets() {
        return this.getSolde() * this.getTaux();
    }

    public void verserInterets() {
        this.ajouter(this.calculerInterets());
    }

    @Override
    public String toString() {
        return "CompteRemunere{" +
                "taux=" + taux +
                '}';
    }
}
