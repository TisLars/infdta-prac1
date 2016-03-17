import Models.UserPreference;

/**
 * Created by lars on 3/5/2016.
 */
public class CalculatePearson implements ICalculation {

    @Override
    public double doOperation(UserPreference x, UserPreference y) {

        double result;
        int sumXY = 0;
        int sumX = 0;
        int sumY = 0;
        int sumSqrX = 0;
        int sumSqrY = 0;

        for (int i = 0; i < x.length; i++) {
            sumX += x[i];
            sumY += y[i];

            sumSqrX += x[i] * x[i];
            sumSqrY += y[i] * y[i];

            sumXY += x[i] * y[i];
        }

        int calcSumXY = sumXY - ((sumX * sumY) / x.length);
        int calcSqrtX = sumSqrX - (sumX * sumX) / x.length;
        int calcSqrtY = sumSqrY - (sumY * sumY) / x.length;

        result = calcSumXY / Math.sqrt(calcSqrtX * calcSqrtY);

        return result;
    }
}
