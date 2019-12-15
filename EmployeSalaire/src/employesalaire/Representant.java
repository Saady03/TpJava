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
public class Representant extends Employe{
    //déclaration des attributs
    double recette;
    //définition du constructeur de la classe
    public Representant( String nom,String prenom,int age ,String date ,double recette){
    this.nom=nom;
    this.prenom=prenom;
    this.date=date;
    this.age=age;
    this.recette=recette;
    
    }   
    
    //redéfinition de la methode calculerSalaire
   public void calculerSalaire(){
     this.salaire=this.recette*0.2+80000;
     System.out.println("Le representant "+ super.getNom()+" gagne "+this.salaire);
     
   } 
}
