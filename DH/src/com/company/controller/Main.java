package com.company.controller;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

    //Mensaje 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese n: ");
        int n=sc.nextInt();
        System.out.println("Ingrese m: ");
        int m=sc.nextInt();
        multiplos(n,m);
        System.out.println("hola");
    }
    public static void multiplos(int n, int m){
        int i=1;
        while(i<=n){
            if(i%m==0){
                System.out.println(i + " es multiplo de " + m);
            }
            i++;
        }

    }

}
