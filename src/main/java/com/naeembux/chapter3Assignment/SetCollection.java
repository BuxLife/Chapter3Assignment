package com.naeembux.chapter3Assignment;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.util.HashSet;

class Book{

    private String title, author;
    private int year;

    public Book()
    {

    }

    public Book(String name, String auth,  int yr)
    {
        title = name;
        author = auth;
        year = yr;
    }
    public String toString(){
        return ("\nTitle: " + title + "\tAuthor: "  + author + "\tYear of Release: " +year);
    }
    @Getter
    public String getTitle()
    {
        return title;
    }
    @Setter
    public void setTitle(String t)
    {
        title = t;
    }

}
public class SetCollection implements LoadListInterface {

    HashSet<Book> readingList = new HashSet<Book>();

    public SetCollection()
    {

    }

    public void loadData()
    {
        readingList.add(new Book("The Richest Man In Babylon", "George S. Clason", 1926));
        readingList.add(new Book("The Strange Case of Dr Jekyll and Mr Hyde", "Robert Louis Stevenson", 1886));
        readingList.add(new Book("The Godfather", "Mario Puzo", 1969));
        readingList.add(new Book("The Prince", "Niccolo Machiavelli", 1532));
        readingList.add(new Book("The Art of War", "Sun Tzu", 1944));

    }

    public String displayData()
    {
        String msg = readingList.toString();
        return msg;
    }
}