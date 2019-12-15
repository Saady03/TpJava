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
public  abstract class Employe {
    //declaration des attributs
    protected String nom;
    protected String prenom;
    protected String date;
    protected int age;
    protected double salaire;
    
    protected String getNom()
    {
        //return ( L'employé "+prenom+ " "+nom);
       return  prenom+ " "+nom;
    }
    protected abstract void calculerSalaire();//déclaration de la methode abstraite
   
}
