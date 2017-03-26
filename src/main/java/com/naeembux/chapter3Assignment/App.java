package com.naeembux.chapter3Assignment;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                ListGui lists = new ListGui("Lists and Lists");
                JFrame.setDefaultLookAndFeelDecorated(true);
                lists.setSize(1050, 250);
                lists.setResizable(false);

                lists.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                lists.setVisible(true);
            }
        });

    }
}
