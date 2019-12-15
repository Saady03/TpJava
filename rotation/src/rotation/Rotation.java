/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotation;

import ij.ImagePlus;
import ij.io.Opener;
import ij.process.ImageProcessor;
import java.awt.Rectangle;

/**
 *
 * @author Utilisateur
 */
public class Rotation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Opener open = new Opener();//creation 
        ImagePlus imp =open.openImage("C:\\Users\\Utilisateur\\Pictures\\mus.png");
        imp.show();
        ImagePlus imp2 = imp.duplicate();
        ImageProcessor newIp = imp2.getProcessor();//donne acces au taleau de pixel
        ImageProcessor ip = imp.getProcessor();  
        int x,y,J;
        double delta=Math.PI/2;
        Rectangle rec = ip.getRoi();
        for(int i=0;i<rec.width;i++)
        {   
            for(int j=0;j<rec.height;j++)
            {
                newIp.set(i,j,0);//initialisation des pixels en noir
            }
        }
        for(int i=0;i<rec.width;i++)
        {   
            int I=i-(rec.width)/2;//changement de repere

            for(int j=0;j<rec.height;j++)
            {
                //newIp.set(i,j,0);
                J=j-(rec.height)/2;//changement de repere
               //double resultat = ip.get(I,J);
                int X=(int) (I*Math.cos(delta)-J*Math.sin(delta));//rotation sur la ligne
                int Y=(int) (I*Math.sin(delta)+J*Math.cos(delta));//rotation sur la colonne
                int monX = X + (rec.width)/2;//on ramene les coordonnees au repere initial
                int monY = Y + (rec.height)/2;//on ramene les coordonnees au repere initial
                if(monX>=0 && monX<rec.width && monY>=0 && monY<rec.height) newIp.set(monX, monY, ip.get(i,j));//il faut que les dimensions rotees se retrouvent dans l'ancien repere
            }
        }
        //imp.setProcessor(ip2);
        imp2.show();
        }
}
