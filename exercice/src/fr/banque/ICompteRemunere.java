package fr.banque;

public interface ICompteRemunere {
    public Double calculerInterets();
    public void verserInterets();
    public Double getTaux();
    public void setTaux(Double unTaux);
}
