/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laplacien;

import ij.ImagePlus;
import ij.io.Opener;
import ij.process.ImageConverter;
import ij.process.ImageProcessor;
import java.awt.Rectangle;

/**
 *
 * @author Utilisateur
 */
public class Laplacien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
          Opener open = new Opener();//creation 
     ImagePlus imp =open.openImage("C:\\Users\\Utilisateur\\Pictures\\contour.jpg");
     imp.show();
     new ImageConverter(imp).convertToGray8();
     ImageProcessor ip = imp.getProcessor();
     ImageProcessor ip2 = ip.duplicate();
     ImagePlus imp2 = imp.duplicate();
        double A,B,exp; 
        double Sig, sigma=0.6;
        int w=ip.getWidth(),h=ip.getHeight();
        double Gaussien[][]= new double[w][h];
        for(int x=0;x<w;x++)
        {
           for(int y=0;y<h;y++)
           {           Gaussien[x][y]=ip.get(x,y);
                       Sig=sigma*sigma;
                       A=-1/(Math.PI*Sig);
                       B=(1-(x*x+y*y))/(2*Sig);
                       exp=Math.exp((-x*x+y*y)/Sig);
                       Gaussien[x][y]= A*B*exp;
           }
        }
           for(int x=0;x<w;x++)
           {
           for(int y=0;y<h;y++)
           {
               Gaussien[x][y]=(int)(ip.get(x+1,y))+
                       ip.get(x-1,y)+ip.get(x,y+1)+
                       ip.get(x,y-1)-4*ip.get(x,y);
           }
                     //ip2.set(x,y,(int)Gaussien[x][y]);   
                    }
           for(int x=0;x<w;x++)
           {
           for(int y=0;y<h;y++)
           {
               if(Gaussien[x][y]<=7){
                ip2.set(x,y,0);   
               }
               else{
                   ip2.set(x,y,255);
                }
                     //ip2.set(x,y,(int)Gaussien[x][y]);   
                    }
                
                }
       
        imp2.show();
    }
    
}
