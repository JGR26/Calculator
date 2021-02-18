
package practicaquiz1;



/**Inicio:18:45
 * Hora Final:
 *Programa de creación de metodos para calculadora
 * @author JairoGR
 */
public class clasesCalcu {
    
    public int Suma(int num1, int num2){
        int resultado;
        resultado = num1+num2;
        
        return resultado;
    }//cierre metodo de suma
    
     public int Resta(int num1, int num2){
        int resultado;
        resultado = num1-num2;
        
        return resultado;
    }//cierre metodo de resta
     
    public int Multipli(int num1, int num2){
        int resultado;
        resultado = num1 * num2;
        
        return resultado;
    }//cierre metodo de multiplicación 
    public float Division(int num1, int num2){
        float resultado;
        resultado = num1/num2;
        
        return resultado;
    }//cierre metodo de division
    
     public float Porcentaje(int num1, int num2){
        float resultado;
        resultado = (num1*num2)/100;
        
        return resultado;
    }//cierre metodo de porcentaje
    
      public float promedio(int num1, int num2, int num3, int num4, int num5,int num6,int divisor){
        float resultado;
        resultado = (num1 +num2 + num3 + num4 + num5 + num6)/divisor;
     return resultado;
      }
}
