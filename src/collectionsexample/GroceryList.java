package collectionsexample;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Yuri Serrano
 */
public class GroceryList {
    /**
     * @param args {@link String[]} - The command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>(Arrays.asList("milk","chocolate","bread","cheese"));
        ArrayList<String> groceries2 = new ArrayList<>(Arrays.asList("sugar","flour","baking soda"));

        groceries.add("bacon");
        groceries.addAll(groceries2);
        System.out.println(groceries);

        if(groceries.contains("milk"))
            groceries.remove("milk");

        System.out.println(groceries);
    }
}
