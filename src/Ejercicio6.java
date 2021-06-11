package src;
import java.util.*;
public class Ejercicio6{
    public static void main(String[] args){
        int[][] array=new int[3][3];
        //asignar los valores al arreglo de fila 3 y columna 3
        array[0][0]=5;
        array[0][1]=6;
        array[0][2]=13;
        array[1][0]=14;
        array[1][1]=2;
        array[1][2]=4;
        array[2][0]=21;
        array[2][1]=7;
        array[2][2]=6;
        //mostrar los datos del arreglo
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(array[i][j]+"    ");
            }
            System.out.println();
        }
        //mostrar los datos del arreglo ya multiplicado por 2
        System.out.println();
        System.out.println("La matriz multiplaca por 2 es");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int t=2*array[i][j];
                System.out.print(t+"    ");
            }
            System.out.println();
        }
        
        
    }
}