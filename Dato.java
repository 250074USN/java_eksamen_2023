// oppgave 1 A

import java.time.LocalDate;

public class Dato{
  
  //private datafelt
  private int dag;
  private int maaned;
  private int aar;
  
  //  lager en default konstuktør 
  Dato(){
    
    // bruker Localdate klassen   

    this.dag = LocalDate.now().getDayOfMonth();
    // this.dag = LocalDate.getDayOfMonth();
    this.maaned = LocalDate.now().getMonthValue();
    this.aar = LocalDate.now().getYear();
  }
  
  // siden data feltet er privat så er det logisk å lage setter og getter metoder.
  
  public void setDag(int dag){
    this.dag = dag;
  }
  
  public int hentDag(){
    return dag;
  }
  
  public void setMaaned(int maaned){
    this.maaned = maaned;
  }
  
  public int hentMaaned(){
    return maaned;
  }
  
  public void setAar(int aar){
    this.aar = aar;
  }
  
  public int hentAar(){
    return aar;
  }
  
  public void oppdaterDato(){
    this.dag = LocalDate.now().getDayOfMonth();
    this.maaned = LocalDate.now().getMonthValue();
    this.aar = LocalDate.now().getYear();
  }
  
  
  public String toString(){
    return "Dato: "+dag+"."+maaned+"."+aar;
  }
}




