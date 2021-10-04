package fr.dessin.exercice;

public class Point2D {

    private static Integer compteur = 0;
    private Integer x = 0;
    private Integer Y = 0;

    public Point2D() {
        this.setX(0);
        this.setY(0);
        Point2D.compteur += 1;
    }

    public Point2D(Integer vX, Integer vY) {
        this.setX(vX);
        this.setY(vY);
        Point2D.compteur += 1;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return Y;
    }

    public void setY(Integer y) {
        this.Y = y;
    }

    /**
     *  permet d'afficher un point
     */
    public void afficher() {
        System.out.println('[' + getX().toString() + ", " + getY().toString() + ']');
    }

    /**
     * Methode publique qui permet de translater X et Y
     *
     * @param dX Integer
     * @param dY Integer
     */
    public void translate(Integer dX, Integer dY) {
        this.setX(getX() + dX);
        this.setY(getY() + dY);
    }

    public static Integer getCompteur() {
        return Point2D.compteur;
    }
}
