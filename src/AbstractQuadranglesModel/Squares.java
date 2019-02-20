package AbstractQuadranglesModel;

public class Squares extends Quadrangles {

    double aSide;


    public double calculateField(double aSide) {
        return aSide * aSide; //square
    }

    @Override
    public double calculateField(double aSide, double bSide) {
        return 0;
    }

    @Override
    public double calculateField(double aSide, double bSide, double hSide) {
        return 0;
    }

}
