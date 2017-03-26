package com.naeembux.chapter3Assignment;

import java.util.ArrayList;

public class ArraylistCollection implements  LoadList{

    private ArrayList al = new ArrayList();

    public ArraylistCollection(){

    }

    public void loadData()
    {
        al.add(0, "John Doe");
        al.add(1, "Jane Doe");
        al.add(2, "Jen Dee");
        al.add(3, "Harry Potter");
        al.add(4, "Jim Jones");
    }

    public String displayData()
    {
        String msg = "";
        for (int i = 0; i < al.size(); i++)
        msg = msg + (al.get(i).toString() + "\n");

        return msg;
    }



}