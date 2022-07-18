package Buoi1;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = sc.nextInt();
		int S = 0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				S+=i;
			}
		}
		System.out.println("Tong cac uoc cua n: " + S);
	}

}
