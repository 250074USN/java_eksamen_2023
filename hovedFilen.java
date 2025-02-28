// importere de nødvendige pakkene jeg trenger
import java.util.*;

public class hovedFilen{
  
  public static void main(String[] args) {
    
    // oppretter to objekter 
    SpareKonto minSpareKonto = new SpareKonto(1);
    BruksKonto minBruksKonto = new BruksKonto(2);
    
    // siden jeg bruker throws i metodene i konto, sparekonto og brukskonto klassene
    // så må jeg bruke try catch for å fange unntakene 
    
    try{
      double startBelop = 100000.0;
    
      minSpareKonto.innSkudd(startBelop);
      minBruksKonto.innSkudd(startBelop);
      
      // skal bruke denn til for lokken( grensen)
      int antallUttak = 7;
      // lager et random objekt
      Random num = new Random();
      double uttakBelop = 0.0;
      
      // lager en lokke som skal iterere 7 ganger
      for(int i = 0; i < antallUttak; i++){
        
        // generer en random double verdi
        // tar + 1 slik at det ikke blir 0
        uttakBelop = num.nextDouble(10000) + 1;
        // bruker uttakBelop naar jeg kaller på metoden
        minSpareKonto.uttak(uttakBelop);
        // skriver ut nyttig informasjon
        System.out.println(minSpareKonto.toString());
        
        // generer en random double verdi
        // tar + 1 slik at det ikke blir 0
        uttakBelop = num.nextDouble(10000) + 1;
        // bruker uttakBelop naar jeg kaller på metoden
        minBruksKonto.uttak(uttakBelop);
        // skriver ut nyttig informasjon
        System.out.println(minBruksKonto.toString());
      }
    }
    
    // fanger unntaket
    // blant annet de som metodene som kaster untakk i klassen konto, sparekonto og brukskonto
    catch(Exception e){
      System.out.println(e);
    }
    
    // lager et objekt. En arraylist.
    ArrayList <Konto> kontoListe = new ArrayList<>();
    
    // legger til objektene i listen
    kontoListe.add(minSpareKonto);
    kontoListe.add(minBruksKonto);
    
    try{
      Arbeider arbeid = new Arbeider(kontoListe);
      // lager en trad
      Thread traad = new Thread(arbeid);
      // starter traden 
      traad.start();
    }
        
    catch(Exception e){
      System.out.println(e);
    }
  }
}




