package com.chantal.exo5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;


public class CliGui extends JPanel{
    public JPanel getPanel() {
        return panel;
    }

    private JPanel panel;
    private JLabel nomTxt = new JLabel("Valeur : ");
    private JButton creuseButton = new JButton("Creuse");
    private JButton pleineButton = new JButton("Pleine");
    private JButton plusButton = new JButton("+");
    private JButton clearButton = new JButton("Clear");
    private JTextField argumentsArea = new JTextField(20);
    private static Logger logger = Logger.getLogger(String.valueOf(CliGui.class));
    public CliGui() {
        super();
        this.setLayout(new BorderLayout());

                JPanel buttonCpplus = new JPanel(new FlowLayout());
                this.add(buttonCpplus, BorderLayout.NORTH);
                buttonCpplus.add(creuseButton);
                buttonCpplus.add(pleineButton);
                buttonCpplus.add(plusButton);

                JPanel argumentsAreaCentre = new JPanel(new GridLayout(1, 1));
                this.add(argumentsAreaCentre, BorderLayout.CENTER);
                argumentsAreaCentre.add(nomTxt);
                argumentsAreaCentre.add(argumentsArea);


                JPanel buttonClearBas = new JPanel(new FlowLayout());
                this.add(buttonClearBas, BorderLayout.SOUTH);
                buttonClearBas.add(clearButton);


                this.pleineButton.addActionListener(new ActionAjouterPleine());
                this.creuseButton.addActionListener(new ActionAjouterCreuse());
                this.plusButton.addActionListener(new ActionAjouterPlus());
                this.clearButton.addActionListener(new ActionClear());


        }


    public class ActionAjouterPleine implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            String currentText = argumentsArea.getText();
            if  (currentText.matches(".*(-[KAPEC]\\s+|^[KAPEC]\\s+).*")) {
                argumentsArea.setText(argumentsArea.getText()+"-P ");
            } else {
                argumentsArea.setText("");
                argumentsArea.setText("-P ");
            }
        }
    }


    public class ActionAjouterCreuse implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            String currentText = argumentsArea.getText();
            if  (currentText.matches(".*(-[KAPEC]\\s+|^[KAPEC]\\s+).*")) {
               argumentsArea.setText(argumentsArea.getText()+"-C ");
            } else {
                argumentsArea.setText("");
                argumentsArea.setText("-C ");
            }
        }

    }

    public class ActionClear implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            argumentsArea.setText(" ");
        }
    }

    public class ActionAjouterPlus implements ActionListener {
        public void actionPerformed(ActionEvent evt) {

                String input = JOptionPane.showInputDialog("Entrez une option :");
                try {
                    if (input != null && input.length() > 0) {
                        if (!"KAPEC".contains(input)) {
                            throw new IllegalArgumentException("Option inconnue");
                        }
                        argumentsArea.setText(argumentsArea.getText() + " -" + input.toUpperCase());
                    }
                } catch (IllegalArgumentException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
                }
            }

    }
    public static JFrame newJFrame(String titre) {
        JFrame fenetre = new JFrame(titre);
        CliGui cliGui1=new CliGui();
        fenetre.getContentPane().add(cliGui1);
        fenetre.pack();
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return fenetre;
    }
    public static void exemple1() {
        JFrame frame = newJFrame("Fenêtre");
        frame.setLocation(300, 100);
        frame.setVisible(true);


    }

}