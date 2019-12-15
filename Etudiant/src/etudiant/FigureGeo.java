package etudiant;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utilisateur
 */
public abstract class FigureGeo {
public abstract double surface();
public abstract double perimetre();
public double volume (double h){
    return h*surface();
}
}
