/**
 * Created by lars on 2/18/2016.
 */
public class Program {

    public static void main(String args[]) {

        int[] num1 = {1, 3, 4, 4};
        int[] num2 = {2, 5, 5, 8};
        Context context = new Context((new CalculatePearson()));
        context.doCalculation(num1, num2);
        System.out.println();

        int[] num3 = {2, 4, 1};
        int[] num4 = {0, 3, 2};
        context = new Context((new CalculateEuclidean()));
        System.out.println(context.doCalculation(num3, num4));
    }
}
