import java.util.Scanner;
/**
 * Write a description of class Primo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Primo
{
    // determinar si un número es primo
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner (System.in);
        int x=0,i,numero;
        
        System.out.println("Ingrese un número, para determinar si es primo");
        numero=teclado.nextInt();
        
         for(i=1;i<=(numero);i=i+1){
             if(numero%i==0){
             x++;
            }
         }
    if(x!=2){
        System.out.println("El número " + numero + " No es Primo ");
            }
            else{
                System.out.println("El número " + numero + " Si es Primo ");
         }
        }
        
    }

  