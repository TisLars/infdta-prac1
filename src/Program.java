import Models.UserPreference;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by lars on 2/18/2016.
 */
public class Program {

    public static void main(String args[]) {

        //ExecuteMovieData("res/userItem.data");
        ExecuteMovieData("res/ml-100k/u.data");

        //ExecuteCalculations();
    }

    /*
    userItem.data assignment
     */
    private static void ExecuteMovieData(String dataFile) {

        BufferedReader br = null;
        String lineSeperator = "";
        String dataSplitBy = ",";

        TreeMap<Integer, UserPreference> ratingsMap = new TreeMap();

        try {
            br = new BufferedReader(new FileReader(dataFile));
            while ((lineSeperator = br.readLine()) != null) {
                String[] user = lineSeperator.split(dataSplitBy);
                int userId = Integer.parseInt(user[0]);
                int movieId = Integer.parseInt(user[1]);
                double rating = Double.parseDouble(user[2]);

                if (ratingsMap.containsKey(userId)){
                    ratingsMap.get(userId).AddRating(movieId, rating);
                } else {
                    ratingsMap.put(userId, new UserPreference(userId, movieId, rating));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        for (Map.Entry<Integer, UserPreference> entry : ratingsMap.entrySet()) {
            entry.getValue().PrintTreeMap();
        }
    }

    /*
    Calculations
     */
    private static void ExecuteCalculations() {

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
