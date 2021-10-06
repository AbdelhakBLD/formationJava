package fr.banque;

public interface ICompteASeuil extends ICompte{
    public void retirer(Double uneValeur) throws BanqueException;
    public Double getSeuil();
    public void setSeuil(Double unSeuil);
}
