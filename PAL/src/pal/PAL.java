/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pal;

import java.util.Scanner;

/**
 *
 * @author Utilisateur
 */
public class PAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        System.out.println("Entrer le mot ou la phrase");
        String c=t.nextLine();//lecture de la phrase entree
        //gestion des caracteres speciaux a ne pas tenir compte
        c=c.replace(" ", "").replace(",","").replace("\'","").replace("-","");         
        int n=c.length();
        char[] element=new char[n];
        for(int i=0;i<n;i++)
        {
            element[i]=c.charAt(i);
        }//le tableau qui récupere les caracteres de la phrase
       int taille=c.length()-1;
       int i=0;
       int j=taille;
       {
          i++;
          j--;
       }
       if((i<=j)&&(element[i]==element[j]))// verifier chaque caractere du mot dans les 2 sens
       {
           System.out.println(" C'est un palindrome:");   
       }
       else
       {
          System.out.println("Ce n'est pas un palindrome:");
       }
    }
}
