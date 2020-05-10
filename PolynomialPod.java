public class PolynomialPod extends Pod {
    public PolynomialPod(String name, int... values) {
        super(name, t -> CalculatePolynomialVelocity(t, values)
        );
    }

    private static double CalculatePolynomialVelocity(double t, int... values){
        
        double result = 0.0;
        
        for (int i=0; i<=values.length - 1; i++){       
            result += values[i] * java.lang.Math.pow(t, i);
        }

        return result;
    }
}