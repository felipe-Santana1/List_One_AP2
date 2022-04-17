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
public class Ex_1173 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int[] N = new int[10];
        N[0] = leitor.nextInt();
        for (int i=1; i <10; i++) {
            N[i] = N[i-1] * 2;
        }
        for (int i=0; i <10; i++) {
            System.out.println("N["+ i +"] = " + N[i]);
        }
    }
}
