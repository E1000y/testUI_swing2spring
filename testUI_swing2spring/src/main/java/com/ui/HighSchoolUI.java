package com.ui;

import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;


public class HighSchoolUI extends JFrame {

    public HighSchoolUI() {
        JPanel panel = new JPanel();

        JLabel label = new JLabel("Students");

       StudentTableModel studentTableModel = new StudentTableModel();

        JTable jtable = new JTable(studentTableModel);
        GridLayout gl = new GridLayout();





        panel.add(label);
        panel.add(new JScrollPane(jtable));

        add(panel);
        pack();

        setVisible(true);

    }


    public static void main(String[] args) {
        HighSchoolUI highSchoolUI = new HighSchoolUI();
    }
}