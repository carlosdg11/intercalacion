//Métodos de Ordenamiento por Intercalación
//Carlos Daniel Rivera Gómez
package intercalacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Intercalacion {

    int comp=0, mov=0;
    public static void main(String[] args) 
    {
        // creamos un buffer para leer los datos
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        // Instanciar un objeto
        Intercalacion obj= new Intercalacion();
        Burbuja obj2= new Burbuja();
        // Declarar arreglos
        ArrayList<Integer> A= new ArrayList<Integer>();
        ArrayList<Integer> B= new ArrayList<Integer>();
        //Declarar variables
        int t1=0, t2=0;
        try{
            //Pedir el tamaño del arreglo A
            System.out.println("Arreglo A\n Ingresa el tamaño del arreglo A:");
            t1= Integer.parseInt(br.readLine());
            
            for (int i = 0; i <t1; i++) {
                A.add((int)(Math.random()*200)+1);
                
            }
            //Imprimir el arreglo A desordenado
            System.out.println(A);
            System.out.println("Lista A ordenada");
            //Mandamos el método de la burbuja 
            obj2.Burbuja(A);
            
            //Mostramos el arreglo
            System.out.println(A);
            System.out.println("");
            System.out.println("-------------------------------------------");
            
            //Pedir el tamaño del arreglo B
            System.out.println("Arreglo A\n Ingresa el tamaño del arreglo B:");
            t2= Integer.parseInt(br.readLine());
            
            for (int i = 0; i <t2; i++) {
                B.add((int)(Math.random()*200)+1);
                
            }
            //Imprimir el arreglo A desordenado
            System.out.println(B);
            System.out.println("Lista A ordenada");
            //Mandamos el método de la burbuja 
            obj2.Burbuja(B);
            
            //Mostramos el arreglo
            System.out.println(B);
            System.out.println("");
            System.out.println("------------------------------------------------");
            //Mandamos los arreglos ya ordenados al metodo Intercalacion
            obj.Intercalacion(A,B);
        }catch (IOException e){;}
    }
    //Metodo intercalación
    public void Intercalacion(ArrayList<Integer> A,ArrayList<Integer> B){
     //crear el arreglo c para guardar los datos de otros dos arreglos
     // Tamaño del arreglo c es el tamaño de A+B
     int[]c= new int [A.size()+B.size()];
     //Declarar nuestros indices
     int i,j,k;
     //For mientras los arreglos sean de igual tamaños y tengan con quien compararse
     for (i=j=k=0; i<A.size()&& j<B.size(); k++){
         comp++;
         //si el indice i<j lo que hay en el indice i mandarlo al arreglo C
         if (A.get(i)<B.get(j)){
             c[k]= A.get(i);
             //Incrementamos el indice i
             i++;
             //incrementar movimientos
             mov++;
         }else {
             c[k]= B.get(j);
             j++;
             mov++;
             
         }
            
     }
        //En csao de que el tamaño del arreglo A sean mas grandes
        for (;i<A.size();i++,k++) {
            c[k]=A.get(i);
            mov++;
        }
        //En csao de que el tamaño del arreglo A sean mas grandes
         for (;j<B.size();j++,k++) {
            c[k]=B.get(j);
            mov++;
        }
         //Imprimir el nuevo arreglo c
         System.out.println("***************************************************");
         System.out.println("Lista A+B ordenada con intercalacion en c");
         System.out.print("[");
         for (int l=0; l<c.length;l++) {
             System.out.print(c[l]+",");  
        }
        System.out.print("]"); 
        //imprimir los movimientos y comparaciones
        System.out.println("\nMovimientos" + mov);
        System.out.println("Comparaciones"+comp);
    }
    
}
