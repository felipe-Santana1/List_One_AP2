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
public class Ex_1174 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double[] A = new double[10];
        for (int i=0; i < A.length; i++) {
            A[i] = leitor.nextDouble();
        }
        for (int i=0; i < A.length; i++) {
            if (A[i] <= 10) System.out.println(String.format("A["+ i +"] = %.1f" , A[i]));
        }
    }
	
}

