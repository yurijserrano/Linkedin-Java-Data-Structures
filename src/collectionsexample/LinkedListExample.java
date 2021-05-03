package collectionsexample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author Yuri Serrano
 */
public class LinkedListExample {
    /**
     * @param args {@link String[]} - The command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> states = new LinkedList<>();
        states.add("Alaska");
        states.add("Arizona");
        states.add("Arkansas");
        states.add("Pennsylvania");
        states.add("California");
        states.add("Colorado");
        states.add("Connecticut");

        states.addFirst("Alabama");
        System.out.println(states);
        System.out.println("Last state on my list: " + states.getLast());

        ListIterator<String> listIterator = states.listIterator(states.size());
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        Iterator<String> iterator = states.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
