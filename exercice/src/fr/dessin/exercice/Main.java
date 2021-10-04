package fr.dessin.exercice;

public class Main {

    public static void main(String[] args) {
        Point2D point = new Point2D();
        point.afficher();
        point.translate(2, 2);
        point.afficher();
    }
}
