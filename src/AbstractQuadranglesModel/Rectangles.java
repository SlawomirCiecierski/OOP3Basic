package AbstractQuadranglesModel;

public class Rectangles extends Quadrangles {

    double aSide;
    double bSide;

    @Override
    public double calculateField(double aSide) {
        return 0;
    }

    @Override
    public double calculateField(double aSide, double bSide, double hSide) {
        return 0;
    }

    public double calculateField(double aSide, double bSide) {
        return aSide * bSide;
    }
}
