/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_traaitement_parole;
import t2s.son.LecteurTexte;

import edu.cmu.sphinx.frontend.util.Microphone;
import edu.cmu.sphinx.recognizer.Recognizer;
import edu.cmu.sphinx.result.Result;
import edu.cmu.sphinx.util.props.ConfigurationManager;


/**
 *
 * @author fayhj
 */
public class TP_traaitement_parole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
         ConfigurationManager cm;

        if (args.length > 0) {
            cm = new ConfigurationManager(args[0]);
        } else {
            cm = new ConfigurationManager(TP_traaitement_parole.class.getResource("new.xml"));
        }

        Recognizer recognizer = (Recognizer) cm.lookup("recognizer");
        recognizer.allocate();

        // start the microphone or exit if the programm if this is not possible
        Microphone microphone = (Microphone) cm.lookup("microphone");
        if (!microphone.startRecording()) {
            System.out.println("Cannot start microphone.");
            recognizer.deallocate();
            System.exit(1);
        }

        System.out.println("Say: Open or Close or Dog or Cat");

        // loop the recognition until the programm exits.
        while (true) {
            System.out.println("say 'close' to quit.\n");

            Result result = recognizer.recognize();

            if (result != null) {
                String resultText = result.getBestFinalResultNoFiller();
                System.out.println("You said: " + resultText + '\n');
                if(resultText.equals("close"))
                    System.exit(0);
            } else {
                System.out.println("I can't hear what you said.\n");
            }
        }
    }
    
    public static void SI_voix(){
        LecteurTexte lt = new LecteurTexte("Bonjour, je m'appelle Horace");
        lt.playAll();
    }
    
    public static void Sphinx4(String val){
         
    }
    
}
