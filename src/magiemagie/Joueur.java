/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiemagie;

import java.util.*;
import javax.swing.JTextArea;

public class Joueur {

    
    protected String nom;
    protected ArrayList<Carte> cartes;
    protected JTextArea textArea;

    public Joueur() {
    }
    
    public Joueur(String name, JTextArea textArea ) {
        this.nom = name;
        this.cartes = new ArrayList();
        this.textArea = new JTextArea();
    }

    public JTextArea getTextArea() {
        return textArea;
    }
    
    public Joueur(String name, ArrayList<Carte> c) {
        this.nom = name;
        this.cartes = c;
    }

  
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Carte> getCartes() {
        return cartes;
    }

    public void setCartes(ArrayList<Carte> cartes) {
        this.cartes = cartes;
    }
}
