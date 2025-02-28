// Oppgave 1 L

public class SpareKonto extends Konto{
  
  
  // private datafelt
  private int antallGratisUttak = 5;
  private int antallUttak = 0;
  
  SpareKonto(int kontoNummer){
    // Setter renten er lik 1.6 %
    // double rente = 0.016;
    super(kontoNummer, 0.016);
  }
  
  // Overrskriver metoden
  @Override
  public void uttak(double belop) throws IkkeMuligMedNegativtBelopException, IkkeDekningException{
    
    if (belop < 0) {
      throw new IkkeMuligMedNegativtBelopException("ERROR! Ikke lov med negativt belop.");
    }
    
    if (antallGratisUttak > 0){
      // kaller på funksjonen og trekker fra belopet med melding uttak
      utforTransaksjon(-1 * belop, "uttak");
      antallGratisUttak -= 1;
      antallUttak += 1;
    }
    
    else if( (antallGratisUttak == 0) && (belop >= 250)) {
      double gebyr = belop * 0.1;
      // kaller på funksjonen og trekker fra belopet med melding uttak
      // ganger med -1 siden jeg anatar at jeg skal trekke fra saldoen.
      utforTransaksjon(-1*(belop - gebyr), "uttak");
      System.out.println("Uttak fullførst!");
      System.out.println("Saldo: "+hentSaldo());
      antallUttak += 1;
    }
    
    else {
      System.out.println("Dersom du ikke har flere gratis uttak, så er minimumsbeløpet 250 kr med gebyr på 1% av uttakssummen");
     
    }
  }
}