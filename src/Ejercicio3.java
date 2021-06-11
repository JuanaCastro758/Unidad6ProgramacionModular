package src;
import java.util.*;
public class Ejercicio3{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int[] array=new int[8];
        boolean resultado=false;
        //recibe los valores ingresados
        for (int i=0;i<8;i++){
            System.out.print("Ingresar numero entero: ");
            array[i]=scanner.nextInt();
        }
        //el numero a buscar
        System.out.println("¿Que numero desea buscar?");
        //verificar si el numero existe
        int buscar= scanner.nextInt();
        for (int j=0;j<8;j++){
            if(buscar==array[j]){
                resultado=true;
            }else{
                resultado=false;
            }
        }
        //mostrar el resultado de la busqueda
        if(resultado==true){
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");
        }
        
    }
}