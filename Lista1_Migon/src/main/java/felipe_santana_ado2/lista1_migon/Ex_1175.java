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
public class Ex_1175 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int aux;
        int[] N = new int[20];
        for (int i=0; i < N.length; i++) {
            N[i] = leitor.nextInt();
        }
        for (int i=0; i < (N.length / 2); i++) {
        	aux = N[i];
        	N[i] = N[N.length - 1- i];
        	N[N.length - 1 -i] = aux;
        }
        for (int i=0; i < N.length; i++) {
            System.out.println("N["+ i +"] = " + N[i]);
        }
    }
    
}
