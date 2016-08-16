/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubicaestrellas;

import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author SEBASTIAN
 */
public class UbicaEstrellas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String fila;
        
        double estrella=0.0;
        System.out.println("Ingrese N° de filas y columnas");
        fila=lector.nextLine();
        
        
        String filas[] = fila.split(" ");
        int filas_Matriz=Integer.parseInt(filas[0])+2;
        int columnas_Matriz= Integer.parseInt(filas[1])+2;
        int MD[][]= new int[filas_Matriz][columnas_Matriz] ;
        double MDresult[][]= new double [filas_Matriz][columnas_Matriz] ;
        String aux[] = new String[filas_Matriz-2];
        String vectores[][] = new String[filas_Matriz-2][];
       
        
        
        
        System.out.println("Ingrese filas de la matriz");//ingreso de las filas de la matriz, se ingresa en una matriz de string
        for (int j=0;j< filas_Matriz-2;j++){
            aux[j]=lector.nextLine();
            vectores[j]=aux[j].split(" ");
        }
        
        for (int k=1;k<filas_Matriz-1;k++){//convertir entrada en numeros
            for(int h=1;h<columnas_Matriz-1;h++){
                MD[k][h]=Integer.parseInt(vectores[k-1][h-1]);
            }
            
        }
        
        System.out.print("\n");
        for (int y=0;y<filas_Matriz;y++){//pintar matriz
            if (y==0 | y==filas_Matriz-1){
                for (int z=0;z<=columnas_Matriz-1;z++){
                    if (z==0 | z==columnas_Matriz-1){
                        System.out.print("  ");
                    }else{
                    System.out.print(" "+(z));
                    }
                }
                System.out.print("\n");
            }
            else {
                System.out.print(" "+y);
                
                    for(int h=1;h<columnas_Matriz-1;h++){ //Encontrar estrellas
                            estrella = (MD[y-1][h-1]+ MD[y-1][h]+ MD[y-1][h+1]+
                            MD[y][h-1]  + MD[y][h]  + MD[y][h+1]+
                            MD[y+1][h-1]+ MD[y+1][h]+ MD[y+1][h+1])/5;
                
                        if(estrella>=10.0){
                            System.out.print(" *");
                            MDresult[y][h]=estrella;
                        }
                        else{
                        System.out.print("  ");
                        MDresult[y][h]=estrella;
                        }    
                    }
                System.out.print(" "+y);
                System.out.print("\n");
                
            }
         }
    }
    
}
