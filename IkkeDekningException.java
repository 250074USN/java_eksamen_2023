//Oppgave 1D

// Arver fra Exception klassen

public class IkkeDekningException extends Exception{
  
  IkkeDekningException(String melding){
    super(melding);
  }
  
}