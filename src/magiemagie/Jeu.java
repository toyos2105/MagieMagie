/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiemagie;

import java.util.*;

public class Jeu {
    protected ArrayList<Joueur> joueurs;
    protected ArrayList<Carte> jeuCartes ;
    private enum h;
    
    public void setH(HashSet h1){
        this.h = h1;
    }
    
    
    public Jeu() {
        this.joueurs = new ArrayList();
        this.jeuCartes = new ArrayList();
        for (int i=0;i<52;i++)
        {
            Random rand = new Random();
            int type=rand.nextInt(4) + 1;
            jeuCartes.add(new Carte(type));
            System.out.print(type +" -> "+ h[type]);
        }
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

    public void afficherMenuPrincipal() {
        // TODO implement here
      
    }

    public void afficherMenuNouveauJoueur() {
        // TODO implement here
        
    }

    public void afficherPartieEnCours() {
        // TODO implement here
        
    }

}
