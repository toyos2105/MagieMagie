/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiemagie;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;


/**
 *
 * @author Formation
 */
public class PointEntree {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JTextArea textArea1 = new JTextArea();
        JLabel statusBar = new JLabel("");
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Fichier");
        JMenuItem item1 = new JMenuItem("Ajouter un joueur");
        JMenuItem item2 = new JMenuItem("afficher un joueur");
        JMenuItem item3 = new JMenuItem("Lancer une partie");
        JMenuItem item4 = new JMenuItem("Quitter");
        
        // TODO code application logic here
        JFrame fenetre = new JFrame();
        fenetre.setTitle("Jeu Magie Magie");
        fenetre.setSize(400, 400);
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
        Jeu monJeu = new Jeu(textArea1);
        
        item1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                JFrame frame = new JFrame();
                Object result = JOptionPane.showInputDialog(frame, "Nom du joueur:");
                monJeu.ajouterUnJoueur(String.valueOf(result));
                String ch="nb joueurs : "+String.valueOf(monJeu.joueurs.size());
                statusBar.setText(ch);
            }        
        });
        
        item2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                System.out.println();
            }        
        });

        item3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                monJeu.distribuerCartes();
            }        
        });
        
        item4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                System.exit(0);
            }        
        });

        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        menu.add(item4);
        menuBar.add(menu);
        
        fenetre.setJMenuBar(menuBar);


        // StatusBar
        JPanel statusPanel = new JPanel();
        statusPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
        fenetre.add(statusPanel, BorderLayout.SOUTH);
        statusPanel.setPreferredSize(new Dimension(fenetre.getWidth(), 16));
        statusPanel.setLayout(new BoxLayout(statusPanel, BoxLayout.X_AXIS));
        
        statusBar.setHorizontalAlignment(SwingConstants.LEFT);
        statusPanel.add(statusBar);

        JPanel contentPane = new JPanel();
        
        JScrollPane scrollPane = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        fenetre.add(scrollPane);
        
        fenetre.setVisible(true);

    }
    
}
