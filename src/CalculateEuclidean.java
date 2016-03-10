/**
 * Created by lars on 3/5/2016.
 */
public class CalculateEuclidean implements ICalculation {

    @Override
    public double doOperation(int[] num1, int[] num2) {

        double calculation = 0;
        int sumPQ = 0;

        for (int i = 0; i < num1.length; i++) {
            sumPQ += (num1[i] - num2[i]) * (num1[i] - num2[i]);
        }
        calculation = Math.sqrt(sumPQ);

        return calculation;
    }
}
