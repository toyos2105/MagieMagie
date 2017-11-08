/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiemagie;

import java.util.*;
import javax.swing.JTextArea;

public class Jeu {
    protected ArrayList<Joueur> joueurs;
    protected ArrayList<Carte> jeuCartes ;
    protected TypeCarte typeCartes;
    protected int nbCartes=100;
    protected JTextArea jeuTextArea;
 
    public Jeu(JTextArea textAera) {
        this.joueurs = new ArrayList();
        this.jeuCartes = new ArrayList();
        this.jeuTextArea = textAera;
        for (int i=0;i<nbCartes;i++)
        {
            Random rand = new Random();
            int type=rand.nextInt(4) + 1;
            jeuCartes.add(new Carte(type));
            this.jeuTextArea.append(i+" - "+type +" -> "+ typeCartes.get(type)+"\n");
        }
    }

    public void setJeuTextArea(JTextArea jeuTextArea) {
        this.jeuTextArea = jeuTextArea;
    }

    public ArrayList<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(ArrayList<Joueur> joueurs) {
        this.joueurs = joueurs;
    }
    
    public void ajouterUnJoueur() {
        // TODO implement here
        this.joueurs.add(new Joueur());
    }
    
    public void ajouterUnJoueur(String name) {
        // TODO implement here
        
        this.joueurs.add(new Joueur(name));
    }
    
    public void distribuerCartes(){
        ArrayList<Carte> jeuCartesJoueurs = new ArrayList();
        this.jeuTextArea.setText(null);
        for (Joueur myJoueur : this.joueurs) {
            this.jeuTextArea.append(myJoueur.getNom()+"\n");
            for (int i=0;i<7;i++){
                Random rand = new Random();
                int id=rand.nextInt(nbCartes) + 1;
                myJoueur.getCartes().add(this.jeuCartes.get(id));
                this.jeuTextArea.append(i+" - "+this.jeuCartes.get(id).getType() +" -> "+ typeCartes.get(this.jeuCartes.get(id).getType())+"\n");
            }    
        }
    }
}
