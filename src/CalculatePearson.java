/**
 * Created by lars on 3/5/2016.
 */
public class CalculatePearson implements ICalculation {

    @Override
    public double doOperation(int[] num1, int[] num2) {

        double calculation;
        int sumXY = 0;
        int sumX = 0;
        int sumY = 0;
        int sumSqrX = 0;
        int sumSqrY = 0;

        for (int i = 0; i < num1.length; i++) {
            sumX += num1[i];
            sumY += num2[i];

            sumSqrX += num1[i] * num1[i];
            sumSqrY += num2[i] * num2[i];

            sumXY += num1[i] * num2[i];
        }

        int calcSumXY = sumXY - ((sumX * sumY) / num1.length);
        int calcSqrtX = sumSqrX - (sumX * sumX) / num1.length;
        int calcSqrtY = sumSqrY - (sumY * sumY) / num1.length;

        calculation = calcSumXY / Math.sqrt(calcSqrtX * calcSqrtY);

        System.out.println(
                "sumXY: " + sumXY +
                        "\nsumX: " + sumX +
                        "\nsumY: " + sumY +
                        "\nsumSqrX: " + sumSqrX +
                        "\nsumSqrY: " + sumSqrY +
                        "\nCalculation: " + calculation);

        return calculation;
    }
}
