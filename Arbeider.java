
// importer de pakkene jeg trenger: eks ArrayList
import java.util.*;

public class Arbeider implements Runnable{
  
  ArrayList <Konto> liste = new ArrayList<>();
  Dato tradDato = new Dato();
  
  // konstruktør
  Arbeider(ArrayList <Konto> liste){
    this.liste = liste;
  }
  
  // Overskriver run metoden
  @Override
  public void run(){
    
    while(true){
      Dato sjekkDato = new Dato();
      
      if (sjekkDato.hentDag() != tradDato.hentDag() ){
        
        // kaller på en metode som oppdaterer datoen
        tradDato.oppdaterDato();
        
        // lager en lokke som iterer gjennom listen.
        for(int i = 0; i < liste.size(); i++) {
          // kaller på metoden i klassen
          liste.get(i).beregnRenter();
        }
        
        // for at traden ikke jobber heletiden så lar vi den sove
        System.out.println("Traaden skal sove til neste midtnatt");
        
        // antall sek i 1 døgn
        int dagSek = 86400;
        // vekker traaden litt før midtnatt
        try{
          Thread.sleep(dagSek - 120);
        }
        
        catch(InterruptedException ie){
           System.out.println(ie);
        }
      } 
    }
  }
}