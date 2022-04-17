/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package felipe_santana_ado2.lista1_migon;

import java.util.Scanner;

/**
 *
 * @author felipe santana
 */
public class Ex_1180 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt(); int[] X = new int[N];
        
        for(int i=0; i<X.length; i++){X[i] = sc.nextInt();}
        
        int MenorValor = X[0];
        int Indice = 0;
        
        for (int i = 0; i < X.length; i++) {
            if (X[i] <= MenorValor) {
                MenorValor = X[i];
                Indice = i;
            }
        }  
        System.out.println("Menor valor: " +MenorValor);
        System.out.println("Posicao: " + Indice);

    }
}
