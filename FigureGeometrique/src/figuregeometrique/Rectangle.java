/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuregeometrique;

/**
 *
 * @author Utilisateur
 */
public class Rectangle {
    private float a;
    private float b;
    public void setLongueur(float l)
    {
        a=l;
        //System.out.println("La longueur est "+a);
    }
     public void setLargeur(float l)
    {
        b=l;
        //System.out.println("La largeur est "+b);
    }
     
   public void Rectangle (float lg,float larg)
    {
        this.setLongueur(lg);
        this.setLargeur(larg);
    }
   public float surface(float longueur,float largeur)
   {
       float S=longueur*largeur;
       System.out.println("La surface est  "+S);
        return 0;
   
    }
}