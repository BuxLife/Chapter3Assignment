package com.naeembux.chapter3Assignment;

import java.util.Collection;
import java.util.HashSet;

class Game{
    String title;
    String genre;

    public Game(String nme, String gnre)
    {
        title = nme;
        genre = gnre;
    }
    public String toString()
    {
        return ("\nTitle: " + title + "\tGenre: " + genre);
    }
}

public class GenericCollection implements LoadListInterface {

    Collection<Game> gamesList = new HashSet<Game>();

    public GenericCollection(){

    }

    public void loadData()
    {

        gamesList.add(new Game("Halo","First-Person Shooter"));
        gamesList.add(new Game("Call of Duty", "First-Person Shooter"));
        gamesList.add(new Game("Fable", "Role-Playing"));
        gamesList.add(new Game("Outlast", "Horror"));
        gamesList.add(new Game("Gears of War", "Third-Person Shooter"));

    }

    public String displayData()
    {
            String msg = "";
            msg = msg + (gamesList.toString());
            return msg;
    }

}