/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ardha Nur Fajri
 */
import java.util.Scanner;
public class nomer3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Masukkan Angka:");
        int a=input.nextInt();
        System.out.println("Hasil: ");
        for(int i=1; i<a; i++){
            System.out.print(i+" + ");
        }
        System.out.println(a+" = "+hasil);
    }
}