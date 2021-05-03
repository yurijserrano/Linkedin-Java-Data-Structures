package collectionsexample;

import java.util.Vector;

/**
 * @author Yuri Serrano
 */
public class VectorExample {
    /**
     * @param args {@link String[]} - The command line arguments
     */
    public static void main(String[] args) {
        String [] platform1 = {"PS4"};
        String [] platform2 = {"3DS", "Wii U"};
        VideoGame game1 = new VideoGame("Battefield 1",2001,"M",platform1);
        VideoGame game2 = new VideoGame("Pokemon Sun", 2016,"E",platform2);
        VideoGame game3 = new VideoGame("The Legend of Zelda",2017, "E", platform2);

        Vector<VideoGame> games = new Vector<>();
        games.add(game1);
        games.add(game2);
        games.add(game3);

        System.out.println(games);
    }
}
