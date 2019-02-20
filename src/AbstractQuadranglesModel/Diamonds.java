package AbstractQuadranglesModel;

public class Diamonds extends Quadrangles {

    double aSide;
    double hSide;
        public double calculateField ( double aSide, double hSide)
        {
            return aSide * hSide;//diamond
        }
        @Override
        public double calculateField ( double aSide, double bSide, double hSide){
            return 0;
        }
        @Override
        public double calculateField ( double aSide){
            return 0;
        }
}
