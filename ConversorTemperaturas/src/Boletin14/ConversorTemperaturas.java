package Boletin14;

public class ConversorTemperaturas {

    private final int TempCelsius = 80;

    public float calcularcentigradosAFharenheit(float temperatura) throws TemperaturaErradaExcepcion {
        if (temperatura < 80) {
            throw new TemperaturaErradaExcepcion("temperatura <80ºC");
        } else 
            //float Fharenheit = (float)(9/5*temperatura+32,4);
        
            return temperatura;
        
    }
}

    

    
    
       
            
        
    
    
        
    


