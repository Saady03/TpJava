/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdialogue;

import javax.swing.JOptionPane;

/**
 *
 * @author Utilisateur
 */
public class TestDialogue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
   int nbre1=Integer.parseInt(JOptionPane.showInputDialog("entrer le premier nombre"));//conversion du string en entier
   int nbre2= Integer.parseInt(JOptionPane.showInputDialog("entrer le second nombre"));
   /*int  n=nbre1;
   int m=nbre2;
   int som=n+m;*/
   //String message=String.format();
   JOptionPane.showMessageDialog(null,"la somme des deux nobres est "+(nbre2+nbre1));//affichage du message
  // JOptionPane.showMessageDialog(null," et "+nbre2 "est");
}
}
