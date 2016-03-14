import Models.UserPreference;

/**
 * Created by lars on 3/5/2016.
 */
public class CalculateEuclidean implements ICalculation {

    @Override
    public double doOperation(UserPreference user1, UserPreference user2) {

        double calculation = 0;
        int sumPQ = 0;

        for (int i = 0; i < user1.getUserRatingsMap().size(); i++) {
            sumPQ += (user1.getUserRatingsMap().get(i) - num2[i]) * (user1.getUserRatingsMap().get(i) - user2.getUserRatingsMap().get(i));
        }
        calculation = Math.sqrt(sumPQ);

        return calculation;
    }
}
