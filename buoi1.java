package Buoi1;

import java.util.Scanner;

public class buoi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Nhap vao gia tri cua a: ");
		int a = sc.nextInt();
		System.out.println("Gia tri cua bien a = " + a);
		System.out.println("Nhap vao gia tri cua b: ");
		long b = sc.nextLong();
		System.out.println("Gia tri cua bien b = " + b);*/
		// cau lenh dieu kien
		/*System.out.println("Nhap bien a : ");
		int a = sc.nextInt();
		if(a > 0 && a < 10) {
			System.out.println("a la so co 1 chu so");
		} else if(a > 10 && a < 100) {
			System.out.println("a la so co 2 chu so");
		} else {
			System.out.println("a la so co 3 chu so tro len");
		}*/
		/*System.out.println("Nhap vao diem toan: ");
		float a = sc.nextFloat();
		System.out.println("Nhap vao diem van: ");
		float b = sc.nextFloat();
		System.out.println("Nhap vao diem anh: ");
		float c = sc.nextFloat();
		float dtb = (a + b + c)/3;
		System.out.println("Diem trung binh la: " + dtb);
		if(dtb >= 9.0 && dtb <= 10) {
			System.out.println("Xep loai A");
		} else if(dtb >= 7.0) {
			System.out.println("Xep loai B");
		} else if(dtb >= 5.0) {
			System.out.println("Xep loai C");
		} else {
			System.out.println("Xep loai F");
		}*/
		
		//switch case 
		/*System.out.println("Nhap vao b: ");
		int b = sc.nextInt();
		switch(b) {
			case 1: {
				System.out.println("Gia tri cua b = 1");
				break;
			}
			case 2: {
				System.out.println("Gia tri cua b = 2");
				break;
			}
			default: {
				System.out.println("Gia tri cua a khong bang 1 hoac bang 2");
			}
		} */
		// vong lap
		System.out.println("Nhap vao thang: ");
		int a = sc.nextInt();
		System.out.println("Nhap vao nam: ");
		int b = sc.nextInt();
		switch(a) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.printf("Thang %d co 31 ngay!", a);
				break;
			case 4: case 6: case 9: case 11: 
				System.out.printf("Thang %d co 30 ngay!", a);
				break;
			case 2:
				if(b % 4 == 0 && b % 100 != 0 || b % 400 == 0) {
					System.out.printf("Thang %d co 29 ngay!", a);
				} else {
					System.out.printf("Thang %d co 28 ngay!", a);
				}
				break;
			default:
				System.out.println("Thang khong hop le!");
		}
				
	}
}
