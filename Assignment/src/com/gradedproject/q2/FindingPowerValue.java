package com.gradedproject.q2;

import java.util.Scanner;

public class FindingPowerValue {

	public static int power(int x, int y) {

		if(y==0) {
			return 1;
		}
		int result = x*power(x, y-1);

		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the base number X : ");
		int baseNumber = sc.nextInt();
		System.out.println("Enter the power N : ");
		int power = sc.nextInt();

		System.out.println(power(baseNumber, power));

		sc.close();
	}

}
