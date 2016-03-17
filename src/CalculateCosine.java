import Models.UserPreference;

/**
 * Created by larsh on 11-3-2016.
 */
public class CalculateCosine implements ICalculation {

    @Override
    public double doOperation(UserPreference x, UserPreference y) {

        double sumXY = 0, sumX = 0, sumY = 0;
        for (int i = 0; i < x.size(); i++) {

            sumXY += x[i] * y[i];
            sumX += x[i] * x[i];
            sumY += y[i] * y[i];
        }
        double result = sumXY / (Math.sqrt(sumX) * Math.sqrt(sumY));

        return result;
    }
}
