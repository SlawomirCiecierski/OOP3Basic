package AbstractQuadranglesModel;

//
abstract class Quadrangles {
    static double aSide = 0;
    static double bSide = 0;
    static double hSide = 0;

    abstract double calculateField(double aSide);

    abstract double calculateField(double aSide, double bSide);

    abstract double calculateField(double aSide, double bSide, double hSide);
}


