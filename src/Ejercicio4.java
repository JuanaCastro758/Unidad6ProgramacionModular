package src;
import java.util.*;
public class Ejercicio4{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        Random random=new Random();
        int[] distancia=new int[10];
        int[] array=new int[10];
        int mayor=0;
        //genera y muestra los numeros 
        for (int i=0; i<10;i++){
            array[i]=random.nextInt(1000-1+1)+1;
            System.out.println("   "+array[i]);
            if(array[i]>=mayor){
                mayor=array[i];
            }
        }
        //calcula y muestra la distancia
        for (int j=0; j<10;j++){
            distancia[j]=mayor-array[j];
            System.out.println(j+1+".- "+"la distancia de "+array[j]+" a "+mayor+" es "+distancia[j]);
        }
    }
}