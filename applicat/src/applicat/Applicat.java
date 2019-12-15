/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicat;

import ij.IJ;
import ij.ImagePlus;
import ij.io.Opener;
import ij.process.ImageConverter;
import ij.process.ImageProcessor;
import java.awt.Image;
import java.awt.Rectangle;
import static java.lang.Math.PI;
 
 // @author Utilisateur
 //
public class Applicat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Opener open = new Opener();//creation 
     ImagePlus imp =open.openImage("C:\\Users\\Utilisateur\\Pictures\\mus.png");
     imp.show();
     new ImageConverter(imp).convertToGray8();
     ImageProcessor ip = imp.getProcessor();
     ImageProcessor ip2 = ip.duplicate();
        double som1=0,X,Y,exp,d,Gabor;
        double sigX=4,sigY = 16;
        double delta=Math.PI/6,coef=1/(2*Math.PI*sigX*sigY);
        int k,r=10,l;
        int  f=3,t=16;
        Rectangle rec = ip.getRoi();//selectionne les dimensions concernees
        for(int i=r;i<rec.width-r;i++)
        {
           for(int j=r;j<rec.height-r;j++)
           {
               
                for(k=-r;k<r;k++)
                {
                    for(l=-r;l<r;l++)
                    {
                        X= k*Math.cos(delta)+l*Math.sin(delta);
                        Y=-k*Math.sin(delta)+l*Math.cos(delta);
                        //som1+=l*k;
                        exp=Math.exp((-1/2)*(((X*X)/(sigX*sigX))+((Y*Y)/(sigY*sigY))));
                        d=Math.cos(2*Math.PI*f*X/20);
                        Gabor=coef*exp*d;
                        double resultat = Gabor*ip.get(i-k,j-l);
                        som1+=resultat;
                    }
                }
                ip2.set(i,j,(int) som1);
                som1=0;
            }  
        }
        imp.setProcessor(ip2);
        imp.show();
    System.out.println("la somme est "+som1);
    
    }
 }