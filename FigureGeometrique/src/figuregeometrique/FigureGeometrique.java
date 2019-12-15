/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuregeometrique;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Utilisateur
 */
public class FigureGeometrique {
    //class FigureGeom
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      float longueur=0,largeur=0,c;
       
        // TODO code application logic here
    InputStreamReader reader;//lecteur des flux d'entrees
    reader = new InputStreamReader(System.in);
    BufferedReader input =new BufferedReader(reader);
   /* System.out.println("Entrer le type de figure geometrique que vous desirez ");
    String figure = input.readLine();*/
    
    Rectangle  rect;
      rect = new Rectangle();
    System.out.println("Entrer les dimensions de votre figure");
    Scanner sc =new Scanner(System.in);
    longueur=sc.nextFloat();
    largeur=sc.nextFloat();
    rect.setLongueur(longueur);
    rect.setLargeur(largeur);
    rect.surface(longueur,largeur);
   /* Carre C;
    C=new Carre();
    c=sc.nextFloat();
    C.SetCote(c);
    C.surface(c);*/
    
}
}
