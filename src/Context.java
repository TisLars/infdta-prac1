/**
 * Created by lars on 3/5/2016.
 */
public class Context {

    private ICalculation iCalc;

    public Context(ICalculation iCalc) {
        this.iCalc = iCalc;
    }

    public double doCalculation(int[] num1, int[] num2) {
        return iCalc.doOperation(num1, num2);
    }
}
