/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordre;

import java.util.Arrays;

/**
 *
 * @author Utilisateur
 */
public class Ordre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tab[]= {18,8,106,4,7 };
        for(int i=0;i<tab.length;i++)
        {
            for(int j=i+1;j<tab.length;j++)
            {
                if(tab[i]<tab[j])//verifier l'ordre
                {
                    int c=tab[i];
                    tab[i]=tab[j];
                    tab[j]=c;
                }
                    
            }
        }
        System.out.println(Arrays.toString(tab));
    }
   
    
}
