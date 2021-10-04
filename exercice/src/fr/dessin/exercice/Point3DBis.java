package fr.dessin.exercice;

public class Point3DBis {

    private Integer z = 0;
    private Point2D point2D;

    public Point3DBis() {
        this.point2D = new Point2D();
    }

    public Point3DBis(Integer vX, Integer vY, Integer vZ) {
        this.point2D.setY(vY);
        this.point2D.setX(vX);
        this.setZ(vZ);
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public void afficher() {
        System.out.println("["
                .concat(this.point2D.getX().toString())
                .concat(", ")
                .concat(this.point2D.getY().toString())
                .concat(", ")
                .concat(getZ().toString())
                .concat("]"));
    }

    public Point2D getPoint2D() {
        return point2D;
    }

    public void setPoint2D(Point2D point2D) {
        this.point2D = point2D;
    }

    public void translate(Integer dX, Integer dY, Integer dZ) {
        this.point2D.translate(dX, dY);
        this.point2D.setY(getZ() + dZ);
    }

}
