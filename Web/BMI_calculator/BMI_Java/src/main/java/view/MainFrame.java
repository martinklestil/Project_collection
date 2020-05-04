package view;

import controll.Auswertung;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    public MainFrame(){

        JPanel erklaerungPanel = new JPanel();
        JLabel erklaerungTitel = new JLabel("Erklaerung");
        JLabel beschreibung = new JLabel("Ein kleines Projekt um den Einsatz von Java und Swing zu zeigen.");
        erklaerungPanel.setLayout(new BorderLayout());
        erklaerungPanel.add(erklaerungTitel, BorderLayout.NORTH);
        erklaerungPanel.add(beschreibung, BorderLayout.CENTER);

        JPanel mainPanel = new JPanel();
        JPanel centermainPanel = new JPanel();
        JLabel koerpergrosse = new JLabel("Koerpergroesse:");
        JTextField eingabeKoerper = new JTextField();
        JLabel gewicht = new JLabel("Gewicht:");
        JTextField eingabeGewicht = new JTextField();
        JButton berrechnen = new JButton("BMI Berechnen");
        centermainPanel.setLayout(new GridLayout(2, 4));
        centermainPanel.add(koerpergrosse);
        centermainPanel.add(eingabeKoerper);
        centermainPanel.add(gewicht);
        centermainPanel.add(eingabeGewicht);
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(centermainPanel, BorderLayout.CENTER);
        mainPanel.add(berrechnen, BorderLayout.SOUTH);

        JPanel ausgabePanel = AusgabePanel.getInstance();

        berrechnen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Auswertung(eingabeKoerper.getText(), eingabeGewicht.getText());
            }
        });


        this.setLayout(new BorderLayout());
        this.add(erklaerungPanel, BorderLayout.NORTH);
        this.add(mainPanel, BorderLayout.CENTER);
        this.add(ausgabePanel, BorderLayout.SOUTH);

        this.setTitle("BMI Rechner mit Java");
        this.setSize(400, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
