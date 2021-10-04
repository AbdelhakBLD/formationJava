package fr.dessin.exercice;

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
                .concat(", "
                        .concat(getY().toString()
                                .concat(", ")
                                .concat(getZ().toString())
                                .concat("]"))));
    }

    public void translate(Integer dX, Integer dY, Integer dZ) {
        super.translate(dX, dY);
        this.setY(getZ() + dZ);
    }
}
