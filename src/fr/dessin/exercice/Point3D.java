package fr.dessin.exercice;

import java.util.Objects;

public class Point3D extends Point2D{
    private Integer z = 0;

    public Point3D() {
    }

    public Point3D(Integer vX, Integer vY, Integer z) {
        super(vX, vY);
        this.setZ(z);
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    @Override
    public void afficher() {
        System.out.println("["
                .concat(getX().toString())
                .concat(", ")
                .concat(getY().toString())
                .concat(", ")
                .concat(getZ().toString())
                .concat("]"));
    }

    public void translate(Integer dX, Integer dY, Integer dZ) {
        super.translate(dX, dY);
        this.setY(getZ() + dZ);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point3D)) return false;
        Point3D point3D = (Point3D) o;
        return Objects.equals(getZ(), point3D.getZ());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getZ());
    }
}
