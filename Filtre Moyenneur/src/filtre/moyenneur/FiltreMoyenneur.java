/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filtre.moyenneur;

import ij.ImagePlus;
import ij.io.Opener;
import ij.process.ImageProcessor;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Utilisateur
 */
public class FiltreMoyenneur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   //  Opener open = new Opener(); 
    // ImagePlus imp =open.openImage("C:\\Users\\Utilisateur\\Pictures\\lenna.gif");
     
     ImagePlus imp=new ImagePlus("C:\\Users\\Utilisateur\\Pictures\\lenna.gif");
     
     //imp.show();
     //ImagePlus imp2 = imp.duplicate();
   //  ImageProcessor Ip = imp2.getProcessor();
     
     JFrame fen=new JFrame();
         fen.setSize(400,500);
        // ImageIcon icon=new ImageIcon(imp.getImage());
         //fen.setIconImage(imp.getImage());
         fen.setVisible(true);
     
     
        ImageProcessor ip = imp.getProcessor();
        int w=ip.getWidth(),h=ip.getHeight();//les dimensions de l'image
        int recupPixel[][]= new int[w][h];//declaration de la matrice comportant les pixels
        for(int i=0; i<w;i++)
        {
           for(int j=0;j<h;j++)
           {
              recupPixel[i][j]=ip.get(i,j);//insertion des elements de l'image
           }
        }
        
        
         for( int x=56;x<90;x++)
        {
            for(int y=56;y<90;h++)
                
            {
                
                if((recupPixel[x][y]<=115 )||( recupPixel[x][y]>=145))
                 { 
                     
                     int som=0,moy=0;
                     int mat[][]= new int [3][3];
                     for(int k=0,u=-1;k<3;k++,u++)
                      {   
                        for( int l=0,v=-1;l<3;l++,v++)
                         {
                            mat[k][l]=recupPixel[x-u][y-v];
                            som+= mat[k][l];
                           
                         }
                      }
                     moy=som/9;
                    
                     ip.set(x,y,moy);
                     
                    }
                // System.out.println("bonjour");
            }
         System.out.println("bonjour");
        }
         
         
         
         //imp.show();
         /*JFrame fen=new JFrame();
         fen.setSize(400,500);
        // ImageIcon icon=new ImageIcon(imp.getImage());
         //fen.setIconImage(imp.getImage());
         fen.setVisible(true);*/
         
        }
}
     
        
        

