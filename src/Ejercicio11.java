package src;
import java.util.*;
public class Ejercicio11{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        float[] notas=new float[6];
        String[] nombre=new String[6];
        for(int i=0;i<6;i++){
            System.out.println("Nombre del Estudiante "+(i+1));
            nombre[i]=scanner.next();
            do{
                System.out.println("Nota (0 a 10) del estudiante "+(i+1));
                notas[i]=scanner.nextFloat();
            }while((notas[i]>10) || (notas[i]<0));
        }
        System.out.println("Nobres-----------Nota-----------Calificacion ");
        for(int i=0;i<6;i++){
            if(notas[i]<5){
                System.out.println(nombre[i]+"           "+notas[i]+"           Suspenso");
            }
            if(notas[i]>4.99 && notas[i]<7){
                System.out.println(nombre[i]+"           "+notas[i]+"           Bien");
            }
            if(6.99<notas[i] && notas[i]<9){
                System.out.println(nombre[i]+"           "+notas[i]+"           Notable");
            }
            if(notas[i]>8.99){
                System.out.println(nombre[i]+"           "+notas[i]+"           Sobresaliente");
            }
        }
    }
}