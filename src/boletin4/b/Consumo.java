
package boletin4.b;

/**
 *
 * @author julianlinux
 */
public class Consumo {
  private float km;
  private float litros;
  private float vMed;
  private float pGas;
  
  public Consumo(){}
  
  public Consumo (float km,float litros,float vMed,float pGas) {
      
     this.km=km;
     this.litros=litros;
     this.vMed=vMed;
     this.pGas=pGas;
     
  }
     public float getTempo(float km, float vMed){
         
         float tiempo=(km/vMed);
         return tiempo;
         
     }
             
    public float consumoMedios(float litros,float vMed){
        float consumoMedio= (litros*(100/km));
        return consumoMedio;
        
    }
    public float consumoEuros(){
       return (litros / km) * pGas;    
   
        
    }    
    public void setKms (float kilometros){
        km=kilometros;
       
        
    }
           
    public void setLitros (float litros){
        this.litros=litros;
        
    } 
    
    public void setVmed (float vMed){
        this.vMed=vMed;
        
    }
    
    public void setPGas (float pGas){
        this.pGas=pGas;
        
    }
    
    public float getvMed(){
        return vMed;
    }

 
    
    
    
     
        
    
    }
    
      
      
      
