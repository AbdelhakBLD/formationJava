package fr.dessin.exercice;

public class Main {

    public static void main(String[] args) {
        Point2D point1 = new Point2D();
        point1.afficher();
        point1.setX(4);
        point1.setY(6);
        point1.afficher();
        point1.translate(2, 2);
        point1.afficher();

        Point2D point2 = new Point2D(1,2);
        point2.afficher();
        point2.translate(2, 2);
        point2.afficher();

        Point2D.getCompteur();
        System.out.println(Point2D.getCompteur());

        Point3D point3 = new Point3D(1, 2, 3);
        point3.afficher();
        point3.translate(1,2,3);
        point3.afficher();
    }
}
