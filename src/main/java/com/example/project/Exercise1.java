package com.example.project;

import java.util.Scanner; 
import java.util.*;
public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("Ingrese el numero");
			int n = sc.nextInt();
			System.out.println(obj.convertirBaseGabriel(n));			
		}
	}

	public String convertirBaseGabriel(int a) {
		String m=Integer.toString(a);
		int nue=m.length();
		int dos=0;int i=0, definidor=0;
		int nuevo=0; String nuevoString="Vacio";
		for(;i<nue;i++) {
			char fi=m.charAt(i);
			if(String.valueOf(fi).equals("2")) {
				dos++;
			}
			while(String.valueOf(fi).equals("1")==true&&dos<2&&i<nue||
					String.valueOf(fi).equals("0")==true&&dos<2&&i<nue||
					String.valueOf(fi).equals("2")==true&&dos<2&&i<nue) {
				
				 if(String.valueOf(fi).equals("1")&&dos==0||String.valueOf(fi).equals("0")&&dos==0) {
					  nuevo= (int) (nuevo+(Character.getNumericValue(fi)*(Math.pow(2,(nue-i))-1)));
					  definidor++;
				 }
				 else {
					 if(String.valueOf(fi).equals("2")) {
						 nuevo= (int) (nuevo+(Character.getNumericValue(fi)*(Math.pow(2,(nue-i))-1)));
						 definidor++;
					 }
					 if(String.valueOf(fi).equals("0")) {
						 nuevo=nuevo;
						 definidor++;
					 }
					 if(String.valueOf(fi).equals("1")) {
						 break;
					 }
				 }break;
			
				
			}
			nuevoString=Integer.toString(nuevo);
		}
		if(definidor==nue) {
			return nuevoString;
		}
		else
			return "El numero proporcionado no esta en base Gabriel.";
	}
}
