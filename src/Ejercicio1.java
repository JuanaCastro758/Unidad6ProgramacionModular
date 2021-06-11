package src;
import java.util.*;
public class Ejercicio1{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int [] array=new int[5];
        //guarda los numeros ingresados
        for(int i=0;i<5;i++){
            System.out.println("Ingrese numeros");
            array[i]=scanner.nextInt();
        }
        //muestra los numeros ingresados
        System.out.println("Los numeros ingresados son");
        for(int i=0;i<5;i++){
            System.out.println(+i+1+".-   "+array[i]);
        }
    }
}