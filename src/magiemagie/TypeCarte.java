/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiemagie;

/**
 *
 * @author Formation
 */
public enum TypeCarte {
    Bave_Crapaud(1) , Aile_Chauve_Souris(2) , Corne_Licorne(3) , Pustule_Sorciere(4);
        private int i;

    private TypeCarte(int i){
        this.i = i;
    }
    public int get(){
        return this.i;
    }
    
    public static TypeCarte get(int code) { 
        for(TypeCarte s : values()) {
            if(s.i == code) return s;
        }
        return null;
    }
}
