/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devoirtni;


/**
 *
 * @author Utilisateur
 */
public class DevoirTni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int x=1,y=1,w=0,h=0;
        int [][]PetiteImage={{100,100,102,103,100,98,103},
                               {96,99,96,94,94,97,97,96},
                               {100,199,92,152,104,102,95},
                               {100,100,102,103,100,98,193},
                               {96,99,96,94,94,97,97,96},
                               {170,199,98,102,124,112,100},
                               {180,100,102,103,107,98,103}};
      
        
        for(int i=0;i<700;i++)
        {   
           

            for(int j=0;j<700;j++)
            {
                x= w/100;
                y=h/100;
              PetiteImage[x][y]=PetiteImage[i+x][j+y];
              System.out.println("la valeur est"+PetiteImage[x][y]);
                
               /*double resultat = ip.get(I,J);
                int X=(int) (I*Math.cos(delta)-J*Math.sin(delta));//rotation sur la ligne
                int Y=(int) (I*Math.sin(delta)+J*Math.cos(delta));//rotation sur la colonne
                int monX = X + (rec.width)/2;//on ramene les coordonnees au repere initial
                int monY = Y + (rec.height)/2;//on ramene les coordonnees au repere initial*/
                
            }
        }
        
        }
    }
    

