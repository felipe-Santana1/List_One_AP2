/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package felipe_santana_ado2.lista1_migon;

/**
 *
 * @author felipe santana
 */
import java.io.IOException;
import java.util.Scanner;

public class  Ex_1172 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int[] X = new int[10];
        for (int i=0; i < X.length; i++) {
            X[i] = leitor.nextInt();
        }
        for (int i=0; i < X.length; i++) {
            if (X[i] <= 0) X[i] = 1;
        }
        for (int i=0; i < X.length; i++) {
            System.out.println("X["+ i +"] = " + X[i]);
        }
    }
	
}
