package fr.dessin.exercice;

public class Point2D {

    private Integer x = 5;
    private Integer Y = 10;

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
        Y = y;
    }

    public void afficher() {
        System.out.println('[' + getX().toString() + ", " + getY().toString() + ']');
    }

    public void translate(Integer dX, Integer dY) {
        setX(getX() + dX);
        setY(getY() + dY);
    }
}
