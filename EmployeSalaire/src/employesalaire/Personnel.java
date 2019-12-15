/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employesalaire;
import java.util.ArrayList;
/**
 *
 * @author Utilisateur
 */
public class Personnel {
   ArrayList collection=new ArrayList ();//declaration d'un tableau dynamique 
    Employe empl;
    
    public void ajouterEmploye(Employe employe){
     collection.add(employe) ;//insertion automatique de l'objet dans le tableau  
    }
    public void calculerSalaires(){//methode qui affiche le salaire
       
       for(int i=0;i<collection.size();i++){
           empl=(Employe)collection.get(i);//recupération des objects de type Emploi
           empl.calculerSalaire();
          
       } 
    }
    public double salaireMoyen(){//methode qui calcule le salaire moyen
      
       double sal=0;
       for(int i=0;i<collection.size();i++){
           empl=(Employe)collection.get(i);
           sal+=empl.salaire;//somme des salaire
          
       }
       sal=sal/collection.size();// calcul de la moyenne
       return  sal; 
    }
}
