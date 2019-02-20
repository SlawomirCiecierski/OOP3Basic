package InterfaceQuadranglesModel;
//
public interface Quadrangles {
    static double aSide=0;
    static double bSide=0;
    static double hSide=0;

    public double calculateField(double aSide);

    public double calculateField(double aSide, double bSide);

    public double calculateField(double aSide, double bSide, double hSide);

}

