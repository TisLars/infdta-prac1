import Models.UserPreference;

/**
 * Created by lars on 3/5/2016.
 */
public class Context {

    private ICalculation iCalc;

    public Context(ICalculation iCalc) {
        this.iCalc = iCalc;
    }

    public double doCalculation(UserPreference x, UserPreference y) {
        return iCalc.doOperation(x, y);
    }
}
