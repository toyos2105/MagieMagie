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
    BAVE_DE_CRAPAUD(1) , 
    AILE_DE_CHAUVE_SOURIS(2) , 
    LAPIS_LAZULI(3) ,
    MANDRAGORE(4),
    CORNE_DE_LICORNE(5);
    
    private int i;

    private TypeCarte(int i){
        this.i = i;
    }
    public int getTC(){
        return this.i;
    }
    
    public static TypeCarte getTC(int code) { 
        for(TypeCarte s : values()) {
            if(s.i == code) return s;
        }
        return null;
    }
    
    
}
