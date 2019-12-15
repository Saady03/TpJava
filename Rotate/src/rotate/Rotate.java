/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotate;

import ij.ImagePlus;
import ij.io.Opener;
import ij.process.ImageProcessor;
import java.awt.Rectangle;
//import java.awt.image.BufferedImage;
public class Rotate {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Opener open = new Opener();//creation 
        ImagePlus imp =open.openImage("C:\\Users\\Utilisateur\\Pictures\\mus.png");
        imp.show();
        ImagePlus imp2 = imp.duplicate();
        ImageProcessor Ip = imp2.getProcessor();//donne acces au taleau de pixel
        ImageProcessor ip = imp.getProcessor();
        //bout= new BufferedImage(int w,int h);
        double angle=78;
        double delta=(angle/180)*Math.PI;//conversion de l'angle
        int i,j;
        int w=imp.getWidth(),h=imp.getHeight();//les dimensions de l'image
        int recupPixel[][]= new int[w][h];
        for( i=0;i<w;i++)
        {   
            for( j=0;j<h;j++)
            {    recupPixel [i][j]=Ip.get(i,j);
                 Ip.set(i,j,0);//initialisation des pixels en noir
            }
        }
        
        int cx=w/2;//les dimensions du centre de rotation 
        int cy=h/2 ; 
        for(i=0;i<w;i++)
        {  
          for(j=0;j<h;j++)
            {
            //fonction de rotation de l'image
             int i1=i-cx;
             int j1=j-cy;
             int X=(int)(i1*Math.cos(delta)-(j1)*Math.sin(delta))+cx;
             int Y=(int)
                     (i1*Math.sin(delta)+(j1)*Math.sin(delta))+cy;
             if((X>=0 && X<w)&&(Y>=0 && Y<h)) {
                 Ip.set(X,Y, recupPixel [i][j]);
               }
          }
        }
         imp2.show();
     
     }
}