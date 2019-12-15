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
public class EmployeSalaire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personnel p=new Personnel();
        p.ajouterEmploye(new Vendeur("Pierre","Legros",45,"1995",300000));
        p.ajouterEmploye(new Representant("Leon","Ventout",25,"2001",200000));
        p.ajouterEmploye(new Technicien("Yves","Bosseur",28,"1998",1000));
        p.ajouterEmploye(new Manutentionnaire("Jane","Stocker",32,"1998",50));
        p.calculerSalaires();
        System.out.println("Le salaire moyen dans l'entreprise est de "+ p.salaireMoyen()+" .");
    }
    
}
