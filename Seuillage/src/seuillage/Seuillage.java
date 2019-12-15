/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seuillage;

import ij.IJ;
import ij.ImagePlus;
import ij.io.Opener;
import ij.process.ImageProcessor;

/**
 *
 * @author Utilisateur
 */
public class Seuillage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Opener open = new Opener(); 
     ImagePlus imp =open.openImage("C:\\Users\\Utilisateur\\Pictures\\Seuillage.jpg");
     imp.show();
     ImagePlus imp2 = imp.duplicate();
     ImageProcessor Ip = imp2.getProcessor();
     ImageProcessor ip = imp.getProcessor();
        int w=ip.getWidth(),h=ip.getHeight();//les dimensions de l'image
        int recupPixel[][]= new int[w][h]; 
        int imageBinaire[][]= new int[w][h];
        int S= 63;//seuil choisi au préalabre
        for(int i =0;i<w;i++)
        {
            for(int j=0;j<h;j++)
            {
                recupPixel[i][j]=ip.get(i,j);//acceder aux pixels de l'image a partir de recupPixel
                if(recupPixel[i][j]<S){
                   imageBinaire[i][j]=0;  
                }
                else{
                imageBinaire[i][j]=255;
            }
                Ip.set(i,j, imageBinaire[i][j]);//remise de l'image
            }
            
        }
         
        imp2.show();
    }
    
}
