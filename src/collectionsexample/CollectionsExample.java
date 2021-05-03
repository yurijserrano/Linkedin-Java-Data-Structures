package collectionsexample;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Yuri Serrano
 */
public class CollectionsExample {
    /**
     * @param args {@link String[]} - The command line arguments
     */
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,1,2,3,5,8,13,21,34,55);
        System.out.println("Position of 21: " + Collections.binarySearch(list1, 21));
    }
}
