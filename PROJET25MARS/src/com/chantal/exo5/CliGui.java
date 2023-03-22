package com.chantal.exo5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CliGui extends JFrame {
    public JPanel getPanel() {
        return panel;
    }

    private JPanel panel, panel2;
    private JButton creuseButton, pleineButton, plusButton,clearButton;
    private JTextArea argsTextArea;

    public CliGui() {
        setTitle("Arguments de la ligne de commande");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel2=new JPanel();
        

        creuseButton = new JButton("Creuse (C)");
        creuseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                argsTextArea.append(" -C");
            }
        });

        pleineButton = new JButton("Pleine (P)");
        pleineButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                argsTextArea.append(" -P");
            }
        });

        plusButton = new JButton("+");
        plusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog("Entrez une option :");
                if (input != null && input.length() > 0) {
                    argsTextArea.append(" " + input);
                }
            }
        });

        clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                argsTextArea.setText("");
                }

        });


        argsTextArea = new JTextArea(2, 30);
        argsTextArea.setEditable(false);

        panel.add(creuseButton);
        panel.add(pleineButton);
        panel.add(plusButton);
        panel.add(argsTextArea);
        panel.add(clearButton);

        add(panel);

        setVisible(true);
    }


}