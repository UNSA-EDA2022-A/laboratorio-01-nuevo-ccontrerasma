package com.example.project;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el numero de las posiciones de las piedras");
		while (true) {
            int a [] = new int [7];
            for(int i = 0; i < 7; i++){
                int n = sc.nextInt();
                a[i] = n;
            }
			
			System.out.println(obj.getMenorNumeroSaltos(a));			
		}
	}

	public Integer getMenorNumeroSaltos(int a []) {
		  ArrayList<Integer> saltos = new ArrayList();
		  int conejo=0, cantidad=50; boolean diferencia=false;
		  for(int e = 0; e < 6; e++) {
			  if(a[e+1]-a[e]>50) {
				  diferencia=true;
			  }
		  }
		  if(diferencia==false) {
		  for(int i = 0; i < 7; i++) {
			  if(a[i]>cantidad&&i<=5) {
				  saltos.add(a[i-1]);
				  cantidad=a[i-1]+50;
			  }
			  if(a[i]==cantidad) {
				  saltos.add(a[i]);
				  cantidad=a[i]+50;
			  }
			  if(a[i]>cantidad&&i==6) {
				  saltos.add(a[i-1]);
				  saltos.add(a[i]);
				  cantidad=a[i-1]+50;
			  }
		  }
		  return saltos.size();
		  }
		  else
			  return -1;
	}
}
