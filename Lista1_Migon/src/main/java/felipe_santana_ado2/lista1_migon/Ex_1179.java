/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package felipe_santana_ado2.lista1_migon;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author felipe santana
 */
public class Ex_1179 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int[] par = new int[5];
        int[] impar = new int[5];
        int X, contPar = 0, contImpar = 0;
        for (int i = 0; i < 15; i++) {
        	X = leitor.nextInt();
        	
        	if (X % 2 == 0) {
        		par[contPar] = X; 
        		contPar++;
        	} else {
        		impar[contImpar] = X;
        		contImpar++;
        	}
        	
        	if (contPar == 5) {
        		contPar = 0;
        		for (int j = 0; j < par.length; j++) {
        			System.out.println("par[" + j + "] = " + par[j]);
        		}
        	} else if (contImpar == 5) {
        		contImpar = 0;
        		for (int j = 0; j < impar.length; j++) {
        			System.out.println("impar[" + j + "] = " + impar[j]);
        		}
        	}
        }
        
        for (int i = 0; i < contImpar; i++) {
			System.out.println("impar[" + i + "] = " + impar[i]);
        }
        for (int i = 0; i < contPar; i++) {
			System.out.println("par[" + i + "] = " + par[i]);
        }
    }
	
}
