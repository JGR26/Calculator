package practicaquiz1;

import java.util.Scanner;

/**
 * Inicio:19:09 Hora final
 *
 * @author JairoGR Practica de calculadora
 */
public class Calculadora {

    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        clasesCalcu calcu = new clasesCalcu();

        System.out.println("-----Bienvenido aquí podrá realizar la operación que desee-----");

       
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int num6;
        int divisor;
        
         System.out.println("Desea hacer una suma? ");
         boolean suma= sca.nextBoolean();
         
         if(suma== true){
         System.out.println("--Digite los numeros para el calculo de una Suma--");
         System.out.print("Digite el primer número: ");
         num1 = sca.nextInt();
         System.out.print("Digite el segundo número: ");
         num2 = sca.nextInt();
        int Resultado = calcu.Suma(num1, num2);
        System.out.println("El resultado de su operación es : " + Resultado);
         }
         
         
         System.out.println("Desea hacer una Resta? ");
         boolean resta= sca.nextBoolean();
        if(resta == true){
        System.out.println("--Digite los numeros para el calculo de una Resta--");
        System.out.print("Digite el primer número: ");
        num1 = sca.nextInt();
         System.out.print("Digite el segundo numero: ");
         num2 = sca.nextInt();
        int Resultado = calcu.Resta(num1, num2);
         System.out.println("El resultado de su operación es : " + Resultado);
        }
        
          System.out.println("Desea hacer una Multiplicación? ");
         boolean multi= sca.nextBoolean();
         
         if(multi==true){
        System.out.println("--Digite los numeros para el calculo de una Multiplicación--");
        System.out.print("Digite el primer número: ");
        num1 = sca.nextInt();
         System.out.print("Digite el segundo numero: ");
         num2 = sca.nextInt(); 
         int Resultado = calcu.Multipli(num1, num2);
        System.out.println("El resultado de su operación es : " + Resultado);
         }
       
         System.out.println("Desea hacer una división? ");
         boolean division= sca.nextBoolean();
         
        if(division == true){
         System.out.println("--Digite los numeros para el calculo de una División--");
        System.out.print("Digite el primer número: ");
        num1 = sca.nextInt();
         System.out.print("Digite el segundo numero: ");
         num2 = sca.nextInt();
        float Resultado = calcu.Division(num1, num2);
         System.out.println("El resultado de su operación es : " + Resultado);
        }
        
          System.out.println("Desea optener un porcentaje? ");
         boolean porcent= sca.nextBoolean();
         
         if(porcent == true){
          System.out.println("--Digite los numeros para el calculo de un Porcentaje--");
        System.out.print("Digite el primer número: ");
        num1 = sca.nextInt();
         System.out.print("Digite el segundo numero: ");
         num2 = sca.nextInt();
        float Resultado = calcu.Porcentaje(num1, num2);
        System.out.println("El resultado de su operación es : " + Resultado);
         }
         
         
         System.out.println("Desea optener un promedio? ");
         boolean prom= sca.nextBoolean();
         
         if( prom== true){
          System.out.println("--Digite los numeros para el calculo de un Promedio--");
        System.out.print("Digite el primer número: ");
        num1 = sca.nextInt();
         System.out.print("Digite el segundo numero: ");
         num2 = sca.nextInt();
         System.out.print("Digite el tercer numero: ");
         num3 = sca.nextInt();
         System.out.print("Digite el cuarto numero: ");
         num4 = sca.nextInt();
         System.out.print("Digite el quinto numero: ");
         num5 = sca.nextInt();
         System.out.print("Digite el sexto numero: ");
         num6 = sca.nextInt();
         System.out.print("Digite el divisor de su promedio: ");
         divisor = sca.nextInt();
        float Resultado = calcu.promedio(num1, num2,num3,num4,num5,num6,divisor);
        System.out.println("El resultado de su operación es : " + Resultado);
         }
         else{
             System.out.print("--Lo sentimos en este momento no contamos con ");
             System.out.println("más operaciones en futuras actualizaciones añadiremos más--");
         }
         System.out.println("---Gracias por utilizar nuestro sistema---");

    }

}
