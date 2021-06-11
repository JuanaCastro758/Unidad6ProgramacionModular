package src;
import java.util.*;
public class Ejercicio7{
    public static void main(String[] args){
        Random random=new Random();
        int[][] array=new int[4][3];
        int s=0;
        //genera los numeros aleatorios y los muestra en pantalla
        for (int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                array[i][j]=random.nextInt(555-0+1)+0;
                System.out.print(array[i][j]+"        ");
            }
            System.out.println();
        }
        //suma los valores de las dos filas pares
        for (int f=1;f<4;f+=2){
            for(int c=0;c<3;c++){
                s+=array[f][c];
            }
            System.out.println();
        }
        //muestra la suma de los valores
        System.out.println("La suma de las filas pares es: "+s);
        
    }
}