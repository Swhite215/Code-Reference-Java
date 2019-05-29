import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<Integer>(); // Assignment of type of data
        items.add(1);
        items.add(2);
        // items.add("test"); // Error because of assigned data type

        printDoubled(items);

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> seattleSonics = new Team<>("Seattle Sonics"); // Only accepts football players
        Team<BaseballPlayer> whiteSox = new Team<>("White Sox"); // Only accepts baseball players
        Team<SoccerPlayer> seattleSounders = new Team<>("Seattle Sounders"); // Only accepts soccer players

        seattleSonics.addPlayer(joe); // Valid Player for Football Team

        whiteSox.addPlayer(pat); // Valid Player for Baseball Team

        System.out.println(seattleSonics.numPlayers());
        System.out.println(whiteSox.numPlayers());
    }

    private static void printDoubled(ArrayList<Integer> n) {
        for (int i : n) {
            System.out.println(i * 2);
        }
    }
}