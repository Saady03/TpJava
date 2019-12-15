/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant;

/**
 *
 * @author Utilisateur
 */
public class Triangle extends FigureGeo {
    private double base;
    private double hauteur;
    public Triangle(double hauteur,double base)
    {
     this.base=base;
     this.hauteur=hauteur;
    }
    public double surface()
    {
        double s=this.hauteur*this.base/2;
        return s;
    }
    @Override
    public double perimeter()
    {
        throw new UnsupportedOperationException("Not supported yet.");
      
    }
     @Override
    public double perimetre()
    {
        throw new UnsupportedOperationException("Not supported yet.");
      
    }
}
