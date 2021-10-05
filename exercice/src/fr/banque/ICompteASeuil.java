package fr.banque;

public interface ICompteASeuil extends ICompte{
    public void retirer(Double uneValeur);
    public Double getSeuil();
    public void setSeuil(Double unSeuil);
}
