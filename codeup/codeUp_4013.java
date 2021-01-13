package Study;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] arr) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println("2 " + two(num));
		System.out.println("8 " + eight(num));
		System.out.print("16 " + eightteen(num));
	}
	
	static String two(int num) {
		String result = "";
		int k = num;
		while(true) {
			if(k >= 1) {
				if(k % 2 == 1 ) {
					result = "1" + result;
					k = k / 2;
				}else {
					result = "0" +result;
					k = k / 2;
				}
			}else break;
		}
		
		return result;
	}
	
	static String eight(int num) {
		String result = "";
		int k = num;
		
		while(true) {
			if(k >= 8) {
				result = (k % 8) + result;
				k = k / 8;
			}else {
				result = k + result;
				break;
			}
		}
		
		return result;
	}
	
	static String eightteen(int num) {
		String result = "";
		int k = num;
		
		while(true) {
			if(k >= 16) {
				result = change(k % 16) + result;
				k = k / 16;
			}else {
				result = change(k) + result;
				break;
			}
		}
		
		return result;
	}
	
	static String change(int num) {
		if(num >= 10) {
			switch(num) {
			case 10 : return "A";
			case 11 : return "B";
			case 12 : return "C";
			case 13 : return "D";
			case 14 : return "E";
			case 15 : return "F";
			}
		}else return ""+num;
		return "";
	}
}
