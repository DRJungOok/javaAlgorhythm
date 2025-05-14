package javaAlgorhythm.doit;

import java.util.Scanner;

public class DoIt_1c1 {

	static int med3(int a, int b, int c) {
		if(a > b) {
			if(b >= c) {
				return b;
			} else if( a<= c) {
				return a;
			} else {
				return c;
			}
		} else if(a > c) {
			return a;
		} else if(b > c) {
			return c;
		} else {
			return b;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값");
		
		System.out.println("a value ::");
		int a = sc.nextInt();
		System.out.println("b value ::");
		int b = sc.nextInt();
		System.out.println("C value ::");
		int c = sc.nextInt();
		
		System.out.println("middle value ::" + med3(a, b, c));
	}
}
