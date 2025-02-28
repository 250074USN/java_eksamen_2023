// Oppgave 1 E

// arver fra exception klassen(som er innebygd i java)

public class IkkeMuligMedNegativtBelopException extends Exception{
  
  IkkeMuligMedNegativtBelopException(String melding){
    super(melding);
  }
}