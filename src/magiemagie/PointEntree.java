/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiemagie;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;


/**
 *
 * @author Formation
 */
public class PointEntree {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<JTextArea> joueurText = new ArrayList();
        JTextArea textArea1 = new JTextArea();
        JLabel statusBar = new JLabel("");
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Fichier");
        JMenuItem item1 = new JMenuItem("Ajouter un joueur");
        JMenuItem item2 = new JMenuItem("afficher un joueur");
        JMenuItem item3 = new JMenuItem("Lancer une partie");
        JMenuItem item4 = new JMenuItem("Quitter");
        JPanel myPanel = new JPanel();      
        
        // TODO code application logic here
        JFrame fenetre = new JFrame();
        fenetre.setTitle("Jeu Magie Magie");
        fenetre.setSize(1200, 530);
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        fenetre.getContentPane().add(myPanel);
        Jeu monJeu = new Jeu(textArea1);
        Border joueurActif = BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red);
        
        item1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                JFrame frame = new JFrame();
                Object result = JOptionPane.showInputDialog(frame, "Nom du joueur:");
                
                String ch="nb joueurs : "+String.valueOf(monJeu.joueurs.size());
                statusBar.setText(ch);
                
                JTextArea textAreaTemp = new JTextArea(28, 22);
                textAreaTemp.setBackground(new Color((int)(Math.random() * 0x1000000)));
                textAreaTemp.setBorder(BorderFactory.createLineBorder(Color.black));
                myPanel.add(textAreaTemp);
                joueurText.add(textAreaTemp);
                fenetre.repaint();
                fenetre.revalidate();
                monJeu.ajouterUnJoueur(String.valueOf(result), textAreaTemp);
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
                monJeu.getJoueurs().get(0).getTextArea().setBorder(joueurActif);
                for (Joueur myJoueur : monJeu.getJoueurs()){
                    myJoueur.getTextArea().setText(null);
                    myJoueur.getTextArea().append(myJoueur.getNom()+"\n");
                    for (Carte myCarte : myJoueur.getCartes())
                        myJoueur.getTextArea().append(myCarte.getType() +" -> "+ monJeu.getTypeCartes().getTC(myCarte.getType())+"\n");
                }
                fenetre.repaint();
                fenetre.revalidate();
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

        //fenetre.add(textArea1);

                
        
        fenetre.setVisible(true);

    }
    
}
