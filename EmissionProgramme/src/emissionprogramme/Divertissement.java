/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emissionprogramme;

/**
 *
 * @author Utilisateur
 */
public class Divertissement extends Emission{
    //declaration des attributs
    String animateur;
    
    //Le constructeur
   public Divertissement(int duree,String nom,String animateur){
     this.duree=duree;
    this.nom=nom;
    this.animateur=animateur;
   }  
}
   
