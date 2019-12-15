/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employesalaire;

/**
 *
 * @author Utilisateur
 */
public class Technicien extends Employe {
  //déclaration des attributs
    double nb_Unites;
    //définition du constructeur de la classe
    public Technicien( String nom,String prenom,int age ,String date ,double recette){
    this.nom=nom;
    this.prenom=prenom;
    this.date=date;
    this.age=age;
    this.nb_Unites=recette;
    
    }   
    
    //redéfinition de la methode calculerSalaire
   public void calculerSalaire(){
     this.salaire=this.nb_Unites*75;
     System.out.println("Le technicien "+ super.getNom()+" gagne "+this.salaire);
     
   }   
}
