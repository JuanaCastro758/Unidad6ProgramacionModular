package src;
import java.util.*;
public class Ejercicio10{
    public static void main(String[] args){
        int[][] matriz=new int[3][4];
        int[][] trans=new int[4][3];
        Random random=new Random();
        //asignar a la matriz los valores
        //asignar a la matriz transpuesta los valores invertidos
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                matriz[i][j]=random.nextInt(1000);
                trans[j][i]=matriz[i][j];
            }
        }
        System.out.println("Matriz 1                                     Matriz Transpuesta");
        System.out.println();
        //mostrar las dos matrices
        for (int i=0;i<4;i++){
            //muestra la matri 1
            if(i<3){
                for(int j=0;j<4;j++){
                System.out.print(matriz[i][j]+"      ");
                }
                System.out.print("        ");
            }
            if(i==3){
                System.out.print("                                            ");
            }
            //muestra la matriz traspuesta
            for(int j=0;j<3;j++){
                System.out.print(trans[i][j]+"      ");
            }
            System.out.println();
        }
    }
}