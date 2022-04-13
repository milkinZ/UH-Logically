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
public class nomer1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Masukkan Angka:");
        int a=input.nextInt();
        int b=input.nextInt();
        if(a>b || b>a){
            if(a>b){
                System.out.println(a+" Lebih besar dari "+b);
            }else if(b>a){
                System.out.println(b+" lebih besar dari "+a);
            }
        }else{
            System.out.println("Hanya untuk menentukan angka lebih besar ");
        }
    } 
}
