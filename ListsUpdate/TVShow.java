package ListsUpdate;

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

    public TVShow(String genre) {
        System.out.println("I'll pick one of my favorites!");
        this.genre = genre;
        if (genre.equals("Drama")) {
            this.name = "Suits";
            this.episodes = 100;
        } else if (genre.equals("Comedy")) {
            this.name = "Psych";
            this.episodes = 87;
        } else  if (genre.equals("Action")) {
            this.name = "24 Hours";
            this.episodes = 1000;
        } else {
            System.out.println("That's not a real genre, so I'll pick my aboslute favorite.");
            this.name = "Spongebob Squarepants";
            this.episodes = 100000000;
            this.genre = "Cartoon";
        }
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
            if (name.equals("skip")) {
                shows.add(new TVShow(genre));
            } else {
                shows.add(new TVShow(name, episodes, genre));
            }
        }

        for (int i = 0; i < shows.size(); i++) {
            TVShow show = shows.get(i);
            System.out.println("The name of the show is " + show.getName() + " with " + show.getEpisodes() + " number of episodes. The genre is " + show.getGenre());
        }
    }
}
