/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seuillage;

import ij.ImagePlus;
import ij.io.Opener;
import ij.process.ImageProcessor;

/**
 *
 * @author Utilisateur
 */
public class FiltrageMoyenneur {
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Opener open = new Opener(); 
     ImagePlus imp =open.openImage("C:\\Users\\Utilisateur\\Pictures\\contour.gif");
     imp.show();
     ImagePlus imp2 = imp.duplicate();
     ImageProcessor Ip = imp2.getProcessor();
     ImageProcessor ip = imp.getProcessor();
        int w=ip.getWidth(),h=ip.getHeight();//les dimensions de l'image
        int recupPixel[][]= new int[w][h];
        int Moyenneur[][]= new int[w][h];
        int imageBinaire[][]= new int[w][h];
        for(int i =0;i<w;i++)
        {
            for(int j=0;j<h;j++)
            {
                recupPixel[i][j]=ip.get(i,j);//acceder aux pixels de l'image a partir de recupPixel
            }
        }
        
       int t=1;
        
	for ( int x=t; x<h-t; x++ )
	{
	    for ( int y=t; y<w-t; y++ )  
		{
	       if((recupPixel[x][y]<=15)||( recupPixel[x][y]>=150))
                 { //determiner la moyenne des valeurs des pixels 
                     int post=0,som=0;
                     int mat[]= new int [9];
                     for(int k=0,u=-1;k<3;k++,u++)
                      {   
                        for( int l=0,v=-1;l<3;l++,v++,post++)
                         {
                            mat[post]=recupPixel[x-u][y-v];//remplir le tableau a une dimension
                            som+=mat[post];//somme des eléments du nouveau tableau
                         }
                      }
                      som=som/9;
                    Ip.set(x,y, som);//remise de l'image
                    }
                }
                
                
        }
     for(int i =0;i<w;i++)    
     {
            for(int j=0;j<h;j++)
            {
                Moyenneur[i][j]=Ip.get(i,j);//acceder aux pixels de l'image moyennée
                 if(recupPixel[i][j]<Moyenneur[i][j]){
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
     
 

