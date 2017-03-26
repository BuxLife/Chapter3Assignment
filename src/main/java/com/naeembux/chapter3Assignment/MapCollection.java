package com.naeembux.chapter3Assignment;


import java.util.Hashtable;
import java.util.Map;

public class MapCollection implements LoadList{
    Map movies = new Hashtable();

    public MapCollection(){


    }

    public void loadData()
    {
        movies.put("The Boondock Saints", 1999);
        movies.put("Scarface", 1983);
        movies.put("Dr Strange", 2016);
        movies.put("Rogue One" , 2016);
        movies.put("Underworld Blood-Wars", 2017);
    }

    public String displayData()
    {
        String msg = "";
        System.out.println("Number of Movies: " + movies.size());
        for (Object key: movies.keySet())
        {
            msg = msg + (key + " - " + movies.get(key) + "\n");
        }
        return msg;
    }
    //Concrete method
    public void clearData()
    {
        movies.clear();
        System.out.println("Number of Movies after clear: " + movies.size());
    }
}