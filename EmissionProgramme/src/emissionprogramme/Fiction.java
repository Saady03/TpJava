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
public class Fiction extends Emission {
      //declaration des attributs
      int anRealisation;
      boolean EstRedif;
     //Le constructeur 
   public Fiction(String nomFilm, int anRealisation ,boolean EstRedif){
     this.anRealisation=anRealisation;
    this.nom=nomFilm;
    this.EstRedif=EstRedif;
   }
}
