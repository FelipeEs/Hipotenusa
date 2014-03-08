package Businesslogic;

import UI.Grafico;

public class ClaseLogica {
    
    public Double c;
    
    public void Recibir(String a, String b){
        
        Grafico UI = new Grafico(); 
    
        Double a1 = Double.parseDouble(a);
        Double b2 = Double.parseDouble(b);
        
        c = ((a1*a1)+(b2*b2));
        c = Math.sqrt(c);
        
    }
    
    public String Enviar(){
        
        String c1="";
        
        c1 = String.valueOf(c);         
        
        return c1;
         
    }
    
}
