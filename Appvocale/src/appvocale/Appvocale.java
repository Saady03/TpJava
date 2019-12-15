/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvocale;
import t2s.son.LecteurTexte; 

/**
 *
 * @author Saad
 */
import edu.cmu.sphinx.frontend.util.Microphone;
import edu.cmu.sphinx.recognizer.Recognizer;
import edu.cmu.sphinx.result.Result;
import edu.cmu.sphinx.util.props.ConfigurationManager;
public class Appvocale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
     
    listen();
    }
    
    public static void listen (){
    LecteurTexte lecteur = new LecteurTexte("Bonjour"); 
    lecteur.setTexte("je suis un programme de synthèse   vocale"); 
    lecteur.playAll();    
    }
}
