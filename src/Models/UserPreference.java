package Models;

import sun.reflect.generics.tree.Tree;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by larsh on 11-3-2016.
 */
public class UserPreference {

    TreeMap<Integer, Double> userRatingsMap = new TreeMap();

    private int userId;

    public UserPreference(int userId, int movieId, double rating) {
        this.userId = userId;
        userRatingsMap.put(movieId, rating);
    }

    public TreeMap getUserRatingsMap() {
        return userRatingsMap;
    }

    public void setUserRatingsMap(TreeMap tm) {
        userRatingsMap = tm;
    }

    public void AddRating(int movieId, Double rating) {
        userRatingsMap.put(movieId, rating);
    }

    public void PrintTreeMap() {

        System.out.println("User" + userId + ": ");
        for (Map.Entry<Integer, Double> entry : userRatingsMap.entrySet()) {
            System.out.println("\t" + entry.getKey() + "\t" + entry.getValue());
        }
    }
}
