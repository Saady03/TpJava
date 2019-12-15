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
public class Manutentionnaire extends Employe{
  //déclaration des attributs
    double nb_Heures;
    //définition du constructeur de la classe
    public Manutentionnaire( String nom,String prenom,int age ,String date ,double recette){
    this.nom=nom;
    this.prenom=prenom;
    this.date=date;
    this.age=age;
    this.nb_Heures=recette;
    
    }   
    
    //redéfinition de la methode calculerSalaire
   public void calculerSalaire(){
     this.salaire=this.nb_Heures*950;
     System.out.println("Le manutentionnaire "+ super.getNom()+" gagne "+this.salaire);
     
   }   
}
