package com.naeembux.chapter3Assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class ListGui extends JFrame implements ActionListener
{

    private JTextArea helpTxt = new JTextArea(10, 80);
    private String welcome = "Welcome..This Program Demonstrates the use of a: \nGeneric Collection \nMap Collection Set Collection \nArrayList Collection\nAll implement the interface LoadListInterface\nClick a button to see output of the various collections";
    /*Panels*/
    private JPanel textPanel = new JPanel();
    private JPanel controlPanel = new JPanel();

    /*Buttons*/
    private JButton mapBtn = new JButton("Map");
    private JButton setBtn = new JButton("Set");
    private JButton genericBtn = new JButton("Generic Collection");
    private JButton alBtn = new JButton("ArrayList");
    private JButton exitBtn = new JButton("Exit");
    private JButton resetBtn = new JButton("Clear");

    /*Labels*/


    public ListGui(String title){

        super(title);

        /*Layout*/
        setLayout(new BorderLayout());
        add(textPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.EAST);

        /*Control Panel*/
        controlPanel.setBorder(BorderFactory.createTitledBorder("Options"));
        controlPanel.setLayout(new GridBagLayout());
        GridBagConstraints cpc = new GridBagConstraints();

        cpc.fill = GridBagConstraints.HORIZONTAL;
        cpc.weightx= 1;
        cpc.gridx = 0;
        cpc.gridy = 1;
        controlPanel.add(mapBtn, cpc);

        cpc.gridx = 0;
        cpc.gridy = 2;
        controlPanel.add(genericBtn, cpc);

        cpc.gridx = 0;
        cpc.gridy = 3;
        controlPanel.add(alBtn, cpc);


        cpc.gridx = 0;
        cpc.gridy = 4;
        controlPanel.add(setBtn, cpc);

        cpc.gridx = 0;
        cpc.gridy = 5;
        controlPanel.add(resetBtn, cpc);

        cpc.gridx = 0;
        cpc.gridy = 6;
        controlPanel.add(exitBtn, cpc);



        /*Text Panel*/
        textPanel.setBorder(BorderFactory.createTitledBorder("Land of Lists"));
        textPanel.setLayout(new FlowLayout());
        textPanel.add(helpTxt);
        helpTxt.setText(welcome);

        helpTxt.setEditable(false);


        /*ActionListeners*/
        mapBtn.addActionListener(this);
        setBtn.addActionListener(this);
        genericBtn.addActionListener(this);
        alBtn.addActionListener(this);
        resetBtn.addActionListener(this);
        exitBtn.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == mapBtn)
        {
            helpTxt.setText("");
            MapCollection map = new MapCollection();
            map.loadData();
            helpTxt.setText(map.displayData());
        }
        else if (e.getSource() == setBtn)
        {
            helpTxt.setText("");
            SetCollection set = new SetCollection();
            set.loadData();
            helpTxt.setText(set.displayData());
        }
        else if (e.getSource() == genericBtn)
        {
            helpTxt.setText("");
            GenericCollection gen = new GenericCollection();
            gen.loadData();
            helpTxt.setText(gen.displayData());
        }
        else if (e.getSource() == alBtn)
        {
            helpTxt.setText("");
            ArraylistCollection alc = new ArraylistCollection();
            alc.loadData();
            helpTxt.setText(alc.displayData());
        }
        else if (e.getSource() == resetBtn)
        {

            helpTxt.setText(welcome);
        }
        else if (e.getSource() == exitBtn)
        {
            System.exit(0);
        }
    }
}