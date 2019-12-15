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
public class Reportage extends Emission{
    //declaration des attributs
     String theme;
     //Le constructeur
   public Reportage(String nom,String theme,int duree){
     this.duree=duree;
    this.nom=nom;
    this.theme=theme;
   } 
}
