package src;
import java.util.*;
public class Ejercicio9{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        //Ingresar las filas y columnas de ambas matrices
        System.out.print("Ingrese la fila de la primera matriz: ");
        int f1=scanner.nextInt();
        System.out.print("Ingrese la columna de la primera matriz: ");
        int c1=scanner.nextInt();
        System.out.print("Ingrese la fila de la segunda matriz: ");
        int f2=scanner.nextInt();
        System.out.print("Ingrese la columna de la segunda matriz: ");
        int c2=scanner.nextInt();
        //verificar que la regla de la suma se cumpla
        if((c2==c1)&&(f2==f1)){
            //ingresar datos de la matriz 1
            System.out.println();
            System.out.println("-----------Matriz 1");
            System.out.println();
            int[][] array1=new int[f1][c1];
            for(int i=0;i<(f1);i++){
                for(int j=0;j<(c1);j++){
                    System.out.print("dato de fila "+(i+1)+", columna "+(j+1)+": ");
                    array1[i][j]=scanner.nextInt();
                }
            }
            //ingresar datos de la matriz 2
            System.out.println();
            System.out.println("-----------Matriz 2");
            System.out.println();
            int[][] array2=new int[f2][c2];
            for(int f=0;f<(f2);f++){
                for(int c=0;c<(c2);c++){
                    System.out.print("dato de fila "+(f+1)+", columna "+(c+1)+": ");
                    array2[f][c]=scanner.nextInt();
                }
            }
            //mostrar resultado
            System.out.println();
            System.out.println("**************Resultado**********");
            //mostrar la matriz 1 ordenada
            System.out.println("la matriz 1 ");
            for(int x=0;x<(f2);x++){
                for(int y=0;y<(c2);y++){
                    System.out.print(array1[x][y]+"    ");
                }
                System.out.println();
            }
            //mostrar la matriz 2 ordenada
            System.out.println("mas la matriz 2 ");
            for(int x=0;x<(f2);x++){
                for(int y=0;y<(c2);y++){
                    System.out.print(array2[x][y]+"    ");
                }
                System.out.println();
            }
            //mostrar la suma de ambas matrices
            System.out.println("es");
            for(int x=0;x<(f2);x++){
                for(int y=0;y<(c2);y++){
                    int s=array1[x][y]+array2[x][y];
                    System.out.print(s+"    ");
                }
                System.out.println();
            }
            
        }else{
            System.out.println("*******No se puede realizar la suma");
            System.out.println("*******Tiene dimensiones diferentes");
        }
        
    }
}