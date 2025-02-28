// Oppgave 1 K

public class BruksKonto extends Konto{
  // double rente = 0.025;
  BruksKonto(int kontoNummer){
    //Setter renten lik 0.25 % pr aar
    // 1% => 0.1
    // 0.1% => 0.01
    // 0.01% => 0.001
    
    super(kontoNummer, 0.025);
  }
  
}