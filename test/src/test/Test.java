/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Utilisateur
 */
public class Test {
public String description;
public String title;
//public  booleen  termine;
public Test(String des,String tt ){
   description = des;
   title=tt; 
    }

  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Test tester1=new Test ("contenu","Voici mon premier texte:") ;
     //Test tester=new Test () ;
     System.out.println(tester1.title);
     System.out.println(tester1.description);
    
        
    }

    private Test(String contenu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
