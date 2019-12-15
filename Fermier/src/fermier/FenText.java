/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.*/
import java.awt.* ;
import java.awt.event.* ;
import javax.swing.* ;

public class FenText extends JFrame implements ActionListener{
    
     public FenText (){
        setTitle ("Revenu") ;
        setSize (400, 300) ;
       
         setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Fermeture de la seession
        //creation d'un formulaire
        Container contenu = new JPanel() ;
//création du container
           setContentPane(contenu);
        ButtonGroup groupe = new ButtonGroup() ;
        //déclaration des editeurs de texte
        nom = new JTextField () ;
        NbreBetes = new JTextField () ;
        NbEnfants = new JTextField () ;
        superficie = new JTextField () ;
        //insertion des donnees
        contenu.setLayout(new GridLayout(6,2,10,10));
        contenu.add(new JLabel("Nom et Prenoms",JLabel.RIGHT));
        contenu.add(nom) ;
        contenu.add(new JLabel("Nombre de betes",JLabel.RIGHT));
        contenu.add(NbreBetes) ;
        contenu.add(new JLabel("Nombre d'enfants",JLabel.RIGHT));
        contenu.add(NbEnfants) ;
        contenu.add(new JLabel("Superficie en (ha)",JLabel.RIGHT));
        contenu.add(superficie) ;
         radio1.addActionListener(this);
         radio2.addActionListener(this);
         JPanel pan = new JPanel();
         pan.add(radio1) ;
         pan.add(radio2) ;
         contenu.add(pan);
        bouton = new JButton ("CALCULER") ;
        contenu.add(bouton) ;
        bouton.addActionListener(this) ;
        affiche = new JTextField (100) ;
        affiche.setEditable(false);
        
     }
     
     
 public void actionPerformed (ActionEvent e){ 
  if (e.getSource() == bouton){
     try{
         int val=0 ;
     String Nom=nom.getText();
     int Recupbete = Integer.parseInt(NbreBetes.getText()) ;
     int RecupEnfant =Integer.parseInt(NbEnfants.getText())  ;
     int RecupSuperficie = Integer.parseInt(superficie.getText()) ; 
        if( RecupSuperficie<5){
          val=0;
         }
       else if ((RecupSuperficie>=5)&&(RecupSuperficie<=10)){
        val=200000;
        }
       else{      
       val=350000;
        }
       double revenu=15000*Recupbete+(val/12)-((3000+(1000*RecupEnfant))*30);
       String s="";
       if(radio1.isSelected()){
           s="Monsieur ";
       }
       else if(radio2.isSelected()){
           s="Madame ";
       }
       
        new JOptionPane().showMessageDialog(getRootPane(), s+Nom+"Votre revenu est :"+revenu,"Le résultat",JOptionPane.INFORMATION_MESSAGE);
       affiche.setText(s+Nom+" Votre revenu est :"+String.valueOf(revenu)) ;
     }catch(Exception ex){
         new JOptionPane().showMessageDialog(getRootPane(),"Vos données sont fausses", "Erreur",JOptionPane.ERROR_MESSAGE);
       
     }
  }
  else if(e.getSource()== radio1){
      radio2.setSelected(false);
      
  }
  else if(e.getSource() == radio2){
      radio1.setSelected(false); ;
  }
  
}
 private JTextField nom, affiche,NbreBetes,NbEnfants,superficie ;
 private JButton bouton ;
 private JTextArea zone; 
 private JRadioButton sexe;
         JRadioButton radio1 = new JRadioButton ("M", true) ;
         JRadioButton radio2 = new JRadioButton ("F",false) ;
 //private int  NbreBetes,NbEnfants,ChargesJour;
 //private double superficie,revenu;
 //private double 
}



