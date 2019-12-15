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
public class Carre {
 private float a;
 public void SetCote(float l)
 {
     a=l;
 }
  public void Carre (float c)
    {
        this.SetCote(c);
        
    }
   public float surface(float cote)                                   
   {
       float S=cote*cote;
       System.out.println("La surface est"+S);
        return 0;
    }
}
