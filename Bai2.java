package Buoi1;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao canh thu nhat: ");
		int a = sc.nextInt();
		System.out.print("Nhap vao canh thu hai: ");
		int b = sc.nextInt();
		System.out.print("Nhap vao canh thu ba: ");
		int c = sc.nextInt();
		if(a+b<c && b+c<a && a+c<b) {
			System.out.println("Day la tam giac");
			if(a*a+b*b==c*c || b*b+c*c==a*a || a*a+c*c==b*b) {
				System.out.println("Day la tam giac vuong");
			}else if(a==b || a==c || b==c) {
				System.out.println("Day la tam giac can");
			}else if(a==b && b==c) {
				System.out.println("Day la tam giac deu");
			}
		}else {
			System.out.println("3 canh khong tao thanh 1 tam giac");
		}
	}
}
