
// Oppgave 2B

public class Transaksjon{
  
  // Privat data felt
  private double belop;
  private Dato dato;
  private String tekst;
  
  // konstruktør
  Transaksjon(double belop, String tekst){
    this.belop = belop;
    this.dato = new Dato();
    this.tekst = tekst;
  }
  
  // lager getter og setter metoder
  public void setBelop(double belop){
    this.belop = belop;
  }
  
  public double hentBelop(){
    return belop;
  }
  
  public void setDato(Dato dato){
    this.dato = dato;
  }
  
  public Dato hentDato(){
    return dato;
  }
  
  public void setTekst(String tekst){
    this.tekst = tekst;
  }
  
  public String hentTekst(){
    return tekst;
  }
  //////////////////////////////////////////////////////////////////
  // Oppgave 1 C
  // lager en toString metode
  // lagde en toString metode i dato klassen og bruker den her
  public String toString(){
    return "Belop: "+belop+ " Tekst: "+tekst+" "+dato.toString(); 
  }
}