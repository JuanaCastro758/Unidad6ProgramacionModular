package src;
import java.util.*;
public class Ejercicio2{
    public static void main(String[] args){
        Random random=new Random();
        int[] array= new int[10];
        int mayor=0;
        int cantidad=0;
        //genera los valores
        for (int i=0;i<10;i++){
            array[i]=random.nextInt(99-0+1)+0;
        }
        //muestra los numeros y verifica el numero mayor
        System.out.println("Los numeros son:");
        for (int i=0;i<10;i++){
            System.out.println(i+1+".- "+array[i]);
            if(array[i]>=mayor){
                mayor=array[i];
            }
        }
        //verifica cuantas veces se repite el numero mayor
        for (int i=0;i<10;i++){
            if(array[i]==mayor){
                cantidad++;
            }
        }
        //escribe el numero mayor y la cantidad de repeticiones
        System.out.println("El numero mayor es "+mayor+" y se repite "+cantidad);

    }
}
