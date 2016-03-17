import Models.UserPreference;

/**
 * Created by lars on 3/5/2016.
 */
public class CalculateEuclidean implements ICalculation {

    @Override
    public double doOperation(UserPreference x, UserPreference y) {

        double result = 0;
        int sumPQ = 0;

        for (int i = 0; i < x.getUserRatingsMap().size(); i++) {
            sumPQ += (x[i] - y[i]) * (x[i] - y[i]);
        }
        result = Math.sqrt(sumPQ);

        return result;
    }
}
