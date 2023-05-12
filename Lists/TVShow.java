package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class TVShow {
    private String name;
    private int episodes;
    private String genre;

    public TVShow(String name, int episodes, String genre) {
        this.name = name;
        this.episodes = episodes;
        this.genre = genre;
    }

    public String getName() {
        return this.name;
    }

    public int getEpisodes() {
        return this.episodes;
    }

    public String getGenre() {
        return this.genre;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<TVShow> shows = new ArrayList<TVShow>();
        while (true) {
            System.out.println("Name of the show: ");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            System.out.println("How many episodes?");
            int episodes = scanner.nextInt();
            scanner.nextLine();
            System.out.println("What is the genre?");
            String genre = scanner.nextLine();
            shows.add(new TVShow(name, episodes, genre));
        }

        for (int i = 0; i < shows.size(); i++) {
            TVShow show = shows.get(i);
            System.out.println("The name of the show is " + show.getName() + " with " + show.getEpisodes() + " number of episodes. The genre is " + show.getGenre());
        }
    }
}
